package com.neusoft.link;
/**
 * 不带头结点的单链表
 */
import com.neusoft.List.IList;

public class LinkedList2 implements IList {
	public Node head;//单链表的头结点指针
	public LinkedList2() {
		head=null;
	}
	@Override
	public void clear() {
		// TODO 将一个已存在的单链表重置为空表
		head=null;
	}
	@Override
	public boolean isEmpty() {
		// TODO 判断单链表是否为空
		return head==null;
	}
	@Override
	public int length() {
		// TODO 求长度
		Node p = head;
		int length=0;
		while (p!=null) {
			p=p.next;
			length++;
		}
		return length;
	}
	@Override
	public Object get(int i) {
		// TODO 读取单链表中的第i个数据元素
		Node p =head;
		int j=0;
		while (p!=null && j<i) {
			p=p.next;
			j++;
		}
		if (j>i||p==null) {
			System.out.println("第"+i+"个位置不合法");
		}
		return p.data;
	}

	@Override
	public void insert(int i, Object x) {
		// TODO 在单链表的第i个数据元素之前插入一个值为x的数据元素
		Node s=new Node(x);
		if (i==0) {//插入数据为表头
			s.next=head;
			head=s;
			return;}
		else {
				Node p =head;
				int j=0;
				while(p!=null && j<i-1) {
					p=p.next;
					j++;
				}
				if (j>i-1||p==null) {
					System.out.println("插入位置不合理");
				}
				s.next=p.next;
				p.next=s;
			}
}
	@Override
	public void remove(int i) {
		// TODO 将线性表中中第i个元素删除，注意i和合法范围
		Node p =head;//初始化p节点为首节点，j为计数器
		Node q= null;//用来记录p节点的前驱节点
		int j=0;
		while (p!=null&&j<i) {//寻找i节点的过程
			q=p;
			p=p.next;
			j++;
		}
		if (j>i||p==null) {
			System.out.println("删除位置不合法");
		}
		if (q==null) {
			head=null;//删除首节点
		}else {
			q.next=p.next;
		}
	}
	@Override
	public int remove(Object i) {
		// TODO 按指定元素删除
		Node p =head;//p节点指向头结点
		Node q=null;//q节点为p节点的前驱节点
		int j=0;//j为计数器
		while (p!=null&&!p.data.equals(i)) {
			q=p;
			p=p.next;
			j++;
		}
		if (p!=null&&q==null) {//删除的是头结点
			head=p.next;
		}else if(p!=null){
			q.next=p.next;
		}else {
			return -1;
		}
		return j;//返回该元素的位置，删除不成功返回-1
	}

	@Override
	public int indexOf(Object x) {
		// TODO 在不带头结点的单链表中查找值为x的元素，不成功返回-1
		Node p =head;
		int j=0;
		while (p!=null && !p.data.equals(x)) {
			p=p.next;
			j++;
		}
		if (p!=null) {
			return j;
		}else {
			return -1;
		}
	}

	@Override
	public void display() {
		// TODO 输出线性表中的元素
		Node node= head;
		while (node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}

}

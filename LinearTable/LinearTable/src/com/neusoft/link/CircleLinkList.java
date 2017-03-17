package com.neusoft.link;
import com.neusoft.List.IList;
public class CircleLinkList implements IList{
	public Node head;
	public CircleLinkList() {
		// TODO 初始化
		head=new Node();//初始化头结点
		head.next=head;
	}
	@Override
	public void clear() {
		// TODO 清空
		head.next=head;
	}
	@Override
	public boolean isEmpty() {
		// TODO 判空
		return head.next.equals(head);
	}
	@Override
	public int length() {
		// TODO 长度
		Node p =head.next;
		int length=0;
		while (!p.equals(head)) {
			p=p.next;
			length++;
		}
		return length;
	}
	@Override
	public Object get(int i) {
		// TODO 读取带头结点的循环链表中第i个数据元素
		Node p=head.next;
		int j=0;
		while (!p.equals(head)&&j<i) {
			p=p.next;
			j++;
		}
		if (j>i||p.equals(head)) {
			System.out.println("第"+i+"个元素不存在！");
		}
		return p.data;
	}

	@Override
	public void insert(int i, Object x) {
		// TODO 带头结点的循环链表中第i个节点之前插入一个值为x的元素
		Node p = head;
		int j=-1;//第i个节点前驱位置
		while ((!p.equals(head)||j==-1)&&j<i-1) {
			p=p.next;
			j++;
		}
		if (j>i-1||(p.equals(head)&&j!=-1)) {
			System.out.println("插入位置不合法！");
		}
		Node s =new Node(x);
		s.next=p.next;
		p.next=s;
	}

	@Override
	public void remove(int i) {
		// TODO 移除循环单链表中第i个元素的节点，注意i的范围
		Node p=head;//p指向要删除节点的前驱节点
		int j=-1;
		while ((!p.next.equals(head)||j==-1)&&j<i-1) {//找前驱元素
			p=p.next;
			j++;
		}
		if (j>i-1||(p.next.equals(head)&&j!=-1)) {
			System.out.println("删除位置不合法！");
		}
		p.next=p.next.next;
	}

	@Override
	public int indexOf(Object x) {
		// TODO 查找值为x的元素，返回位置
		Node p =head.next;//p指向首节点
		int j=0;
		while ((!p.equals(head))&&(!p.data.equals(x))) {
			p=p.next;
			j++;
		}
		if (!p.equals(head)) {
			return j;
		}else {
			return -1;
		}
	}
	@Override
	public void display() {
		// TODO 输出元素
		Node p =head.next;
		while (!p.equals(head)) {
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

	@Override
	public int remove(Object i) {
		// TODO Auto-generated method stub
		return 0;
	}

}

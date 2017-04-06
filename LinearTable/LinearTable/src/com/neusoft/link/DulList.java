package com.neusoft.link;

import java.util.Scanner;

import com.neusoft.List.IList;

public class DulList implements IList {
	public DulNode head;
	public DulNode getHead() {
		return head;
	}
	public void setHead(DulNode head) {
		this.head = head;
	}
	public DulList() {
		// TODO 构造方法初始化头结点及前驱和后继
		head=new DulNode();
		head.prior=head;//head的前驱指向head
		head.next=head;//head的后继指向head
	}
	/**
	 * 创建从表尾到表头逆向建立双向链表的算法。n为双向链表元素的个数
	 * @param n
	 */
	public DulList(int n){
		this();
		System.out.println("请您输入双向链表的元素~");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			insert(0, sc.next());//生成新节点插入到表头
		}
	}
	@Override
	public void clear() {
		// TODO 置空
		head.prior=head;
		head.next=head;
	}
	@Override
	public boolean isEmpty() {
		// TODO 判空,head=head.next时候即为空
		return head.equals(head.next);
	}
	@Override
	public int length() {
		// TODO 求长度
		DulNode p=head.next;
		int length=0;
		while (!p.equals(head)) {//判断是否为空
			p=p.next;
			length++;
		}
		return length;
	}

	@Override
	public Object get(int i) {
		// TODO 读取循环双链表的第i个数据元素
		DulNode p=head.next;
		int j=0;
		while (!p.equals(head)) {
			p=p.next;
			j++;
		}
		if (j>i||p.equals(head)) {
			System.out.println("查找元素不存在");
		}
		return p.data;
	}

	@Override
	public void insert(int i, Object x) {
		// TODO 在双向循环链表的第i个数据元素之前插入一个值为x的节点，
		//i等于表长时候，p指向头结点；i>表长时候，p=null
		DulNode p=head.next;
		int j=0;
		while (!p.equals(head)&&j<i) {//寻找插入位置i
			p=p.next;
			j++;
		}
		if (j!=i&&!p.equals(head)) {
			System.out.println("插入位置不合法");
		}
		DulNode s=new DulNode(x);
		p.prior.next=s;
		s.prior=p.prior;
		s.next=p;
		p.prior=s;
	}
	@Override
	public void remove(int i) {
		// TODO 删除双链表的第i个数据元素。注意长度取值
		DulNode p = head.next;
		int j=0;
		while (!p.equals(head)&&j<i) {//寻找第i个元素
			p=p.next;
			j++;
		}
		if (j!=i) {
			System.out.println("删除位置不合理");
		}
		p.prior.next=p.next;
		p.next.prior=p.prior;
	}

	@Override
	public int indexOf(Object x) {
		// TODO 在循环双链表中查找值为x的元素，找到返回其位置
		DulNode p = head.next;
		int j=0;
		while (!p.equals(head)&&!p.data.equals(x)) {
			p=p.next;
			j++;
		}
		if (!p.equals(head)) {
			return j;//返回其位置
		}else {
			System.out.println("不存在该元素");
			return -1;
		}
	}

	@Override
	public void display() {
		// TODO 显示循环双链表
		DulNode p = head.next;
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

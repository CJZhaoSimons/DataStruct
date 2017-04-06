package com.neusoft.exercise.Josephus;
/**
 * 带头结点的单链表
 */
import java.util.Scanner;
public class LinkedList{
	public Node head;//链表的头指针
	public LinkedList() {
		head = new Node();//初始化头结点
	}
	public LinkedList(int n,boolean order){
		//如果order=1采用尾插法，如果order=2采用头插法
		this();
		if (order) {
			create1(n);
		}else {
			create2(n);
		}
	}
	private void create1(int n) {
		//尾插法
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			insert(length(), sc.next());
		}
	}
	private void create2(int n) {
		//头插法
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			insert(0, sc.next());
		}
	}
	public int length() {
		// 链表的长度
		Node p = head.next;
		int length=0;
		while (p!=null) {
			p=p.next; //指向后继节点
			length++;
		}
		return length;
	}
	public Object get(int i) {
		// 读取链表中第i个节点
		Node p = head.next;
		int j=0;
		if (j>i||p==null) {
			System.out.println("第"+i+"个元素不存在");
		}
		while (p!=null&&j<i) {//从头结点开始查找，找到第i各节点或者p的指针域为空停止
			p=p.next;
			j++;
		}
		return p.data;
	}
	public void insert(int i, Object x) {
		// 在第i个节点之前插入一个值为x的新节点
		Node p = head;
		int j=-1;
		while (p!=null &&j<i-1) {
			p=p.next;
			j++;
		}
		if (j>i-1||p==null) {
			System.out.println("插入位置不合法");
		}
		Node s = new Node(x);//新开辟的s节点
		//从链表中间或表尾进行插入
		s.next=p.next;
		p.next=s;
	}
	public Object remove(int i) {
		// 删除单链表的第i个节点
		Node p = head;
		int j=-1;
		while (p.next!=null&&j<i-1) {
			p=p.next;
			j++;
		}
		String old=(String)p.next.data;
		if (j>i-1||p.next==null) {
			System.out.println("删除位置不合法");
		}
		p.next=p.next.next;
		return old;
		
	}
	public int indexOf(Object x) {
		// 查找值为x的位置
		Node p = head.next;
		int j=0;
		while (p!=null&&!p.data.equals(x)) {
			p= p.next;
			j++;
		}
		if (p!=null) {
			return  j;
		}else {
			return -1;
		}
	}
	public void display() {
		// 输出单链表的所有节点
		Node node = head.next;
		while(node !=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
}

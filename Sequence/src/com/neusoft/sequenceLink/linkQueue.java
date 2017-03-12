package com.neusoft.sequenceLink;

public class linkQueue<T> {
	private Node<T> front, rear;
	private int length;

	public linkQueue() {
		// 构造一个连队列
		length = 0;
		// 带有表头节点的链表
		front = rear = new Node<T>(null);
	}

	public void EnQueue(T obj) {
		// 入队
		rear = rear.next = new Node<T>(obj, null);
		// rear.next = new Node<T>(obj, null);数据Data入队，指针域为空
		// rear = rear.next;//指针后移动
		length++;
	}

	public T DeQueue() {
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		}
		Node<T> p = front.next;
		T x = p.data;
		front.next = p.next;
		length--;
		if (front.next == null) {
			rear = front;
		}
		return x;
	}

	public T getHead() {
		if (isEmpty()) {
			System.out.println("empty");
			return null;
		}
		return front.next.data;
	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		return front.next==null;
	}

	public void nextOrder() {
		Node<T> p = front.next;
		while (p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}

	public void clear() {
		front.next = rear.next = null;
	}

}

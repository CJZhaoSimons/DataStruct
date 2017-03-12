package com.neusoft.sequenceLink;

public class linkQueue<T> {
	private Node<T> front, rear;
	private int length;

	public linkQueue() {
		// ����һ��������
		length = 0;
		// ���б�ͷ�ڵ������
		front = rear = new Node<T>(null);
	}

	public void EnQueue(T obj) {
		// ���
		rear = rear.next = new Node<T>(obj, null);
		// rear.next = new Node<T>(obj, null);����Data��ӣ�ָ����Ϊ��
		// rear = rear.next;//ָ����ƶ�
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

package com.neusoft.sequenceLink;

public class Node<T> {

	public T data;
	public Node<T> next;

	/**
	 * ��һ�������Ĺ��췽�� ��ʼ��nextָ����
	 * 
	 * @param n
	 */
	public Node(Node<T> n) {
		next = n;
	}
	/**
	 * �ڶ����������� ��ʼ���������ָ����
	 * 
	 * @param data
	 * @param next
	 */
	public Node(T data, Node<T> next) {
		this.data = data;// ������������
		this.next = next;// ������ָ����
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}
}


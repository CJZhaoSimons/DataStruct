package com.neusoft.sequenceLink;

public class Node<T> {

	public T data;
	public Node<T> next;

	/**
	 * 有一个参数的构造方法 初始化next指针域
	 * 
	 * @param n
	 */
	public Node(Node<T> n) {
		next = n;
	}
	/**
	 * 第二个参数方法 初始化数据域和指针域
	 * 
	 * @param data
	 * @param next
	 */
	public Node(T data, Node<T> next) {
		this.data = data;// 单链表数据域
		this.next = next;// 单链表指针域
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}
}


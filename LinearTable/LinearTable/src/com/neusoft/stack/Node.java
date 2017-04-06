package com.neusoft.stack;

public class Node {
	public Object data;// 数据域
	public Node next;// 指针域
	public Node() { //构造空节点
		this(null,null);
	}
	public Node(Object data){//构造有一个参数的数据域
		this(data,null);
	}
	public Node(Object data,Node node){//构造数据域和指针域
		this.data=data;
		this.next=node;
	}
}

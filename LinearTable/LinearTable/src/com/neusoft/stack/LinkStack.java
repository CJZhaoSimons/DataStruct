package com.neusoft.stack;
public class LinkStack implements IStack {
	private Node top;//栈顶元素的引用
	@Override
	public void clear() {
		// TODO 链栈置空
		top=null;
	}

	@Override
	public boolean isEmpty() {
		// TODO 判空
		return top== null;
	}

	@Override
	public int length() {
		// TODO 长度
		Node p =top;//p指针指向栈顶元素
		int length=0;
		while (p!=null) {
			p=p.next;//指向后继节点
			length++;
		}
		return length;
	}

	@Override
	public Object peek() {
		// TODO 查找栈顶元素而不移除
		if (!isEmpty()) {
			return top.data;//栈顶元素
		}else {
			return null;
		}
	}
	@Override
	public Object pop() {
		// TODO 出栈,返回出栈的元素
		if (!isEmpty()) {
			Node p=top;//将要删除的元素用p指针暂存
			top=top.next;
			return p.data;
		}else{
			return null;
		}
	}
	@Override
	public void push(Object x) {
		// TODO 入栈
		Node p=new Node(x);//构造一个新节点
		p.next=top;
		top=p;
	}

	@Override
	public void display() {
		// TODO 显示数据
		Node p=top;
		while(p!=null){
			System.out.print(p.data.toString()+" ");
			p=p.next;
		}
		System.out.println();
	}

}

package com.neusoft.stack;

public class SqStack implements IStack {
	private Object[] stackElem;
	//非空栈中始终表示栈顶元素的下一个位置，当栈为空的时候其值为0
	public int top;
	public SqStack(int maxSize) {
		// TODO 初始化栈
		top=0;
		stackElem=new Object[maxSize];
	}
	@Override
	public void clear() {
		// TODO 栈置空
		top=0;
	}
	@Override
	public boolean isEmpty() {
		// TODO 栈判空
		return top==0;
	}
	@Override
	public int length() {
		// TODO 栈长度
		return top;
	}
	@Override
	public Object peek() {
		// TODO 查看栈顶元素对象而不移除，返回栈顶元素
		if (!isEmpty()) {
			//返回镇定元素
			return stackElem[top-1];
		}
		else {
			//栈为空
			return null;
		}
	}

	@Override
	public Object pop() {
		// TODO 出栈操作
		if (top==0) {
			return null;
		}else {//栈非空
			return stackElem[--top];
		}
	}
	@Override
	public void push(Object elem) {
		// TODO 入栈
		if (top==stackElem.length) {
			System.out.println("栈满~");
		}else {//栈未满
			stackElem[top++]=elem;
		}
	}

	@Override
	public void display() {
		// TODO 显示
		for (int i=top-1;i>=0;i-- ) {
			System.out.print(stackElem[i].toString()+" ");
		}
		System.out.println();
	}

}

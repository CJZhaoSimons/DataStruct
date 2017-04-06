package com.neusoft.stack;

public interface IStack {
	//1.栈置空
	public void clear();
	//2.栈判空
	public boolean isEmpty();
	//3.栈长度
	public int length();
	//4.取栈顶元素
	public Object peek();
	//5.移除栈顶元素-----出栈
	public Object pop();
	//6.入栈
	public void push(Object x);
	//7.打印栈元素
	public void display();
}

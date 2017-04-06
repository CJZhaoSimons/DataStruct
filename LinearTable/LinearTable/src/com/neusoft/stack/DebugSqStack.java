package com.neusoft.stack;
//测试顺序结构的栈
public class DebugSqStack {
	public static void main(String[] args) {
		//------初始化栈------------
		SqStack S = new SqStack(100);
		//-----入栈(添加元素)--------
		for (int i = 0; i < 10; i++) {
			S.push(i);
		}
		//----输出栈中的元素---------
		System.out.println("栈中个元素为：");
		S.display();
		//----判断栈空--------------
		if (!S.isEmpty()) {
			System.out.println("栈不是空的~");
		}
		//---栈长度------------------
		System.out.println("栈的长度为："+S.length());
		//---输出栈顶元素-------------
		System.out.println("栈顶元素为："+S.peek().toString());
		//-----测试取出栈顶元素后的输出---------------
		S.pop();
		S.display();
		//-----去除栈中的所有元素------------------
		System.out.println("去除所有栈中的元素");
		S.clear();
		if (S.isEmpty()) {
			System.out.println("栈已经清空~");
		}
	}
}

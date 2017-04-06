package com.neusoft.stack;

public class DebugLinkStack {
	public static void main(String[] args) {
		//-----------初始化--------------
		LinkStack S = new LinkStack();
		//----------插入元素-------------
		for (int i = 1; i <=10; i++) {
			S.push(i);
		}
		//---------显示栈中各元素-----------
		System.out.println("链栈中的元素为：");
		S.display();
		//---------判断栈空--------------
		if (!S.isEmpty()) {
			System.out.println("栈非空~");
			//--------栈长度-----------
			System.out.println("栈的长度为："+S.length());
			//--------输出栈顶元素-----------
			System.out.println("栈顶元素为："+S.peek().toString());
			//--------去除栈顶元素后，剩余各个元素为-------
			System.out.println("栈顶元素出栈之后的各元素输出为：");
			S.pop();
			S.display();
			//-----栈置空---------
			S.clear();
			if (S.isEmpty()) {
				System.out.println("栈为空！~");
			}
		}
	}
}

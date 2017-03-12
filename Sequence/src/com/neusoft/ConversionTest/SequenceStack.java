package com.neusoft.ConversionTest;

/**
 * 顺序展示利用一组地址连续的存储单元存放自栈底到栈顶的数据元素 把数组下标0的一端作为栈底，为了指示栈中元素位置定义top指示
 * 栈顶元素在顺序栈中的位置，top为整型
 * 
 * @author Worace
 * 
 * @param <T>
 */
public class SequenceStack<T> {
	final int Maxsize = 10;
	private T[] stackArray;
	private int top;

	public SequenceStack() {
		// top初始值为-1，指向栈底,如果栈为空就判断top==-1
		top = -1;
		stackArray = (T[]) new Object[Maxsize];
	}

	public SequenceStack(int n) {
		if (n <= 0) {
			System.out.println("长度必须大于零");
			System.exit(1);
		}
		top = -1;
		stackArray = (T[]) new Object[Maxsize];
	}

	public void push(T obj) {
		// 栈顶插入一个新元素
		if (top==stackArray.length-1) {
			T[] p =(T[]) new Object[top*2+2];
			for (int i = 0; i < top	; i++) {//??????????????????????????????????????????????????????????
				p[i]=stackArray[i];
			}
				stackArray=p;
		}
		top++;
		stackArray[top]=obj;
	}

	public T pop() {
		// 删除栈顶元素
		
		if (top==-1) {
			System.out.println("数据栈为空无法删除");
			return null;
		}
		
		top--;
		return stackArray[top+1];
	}

	public T getHead() {
		// 取栈顶数据元素
		if (top==-1) {
			System.out.println("数据栈为空无法删除");
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		// 判断当前栈是否为空
		return top==-1;
	}

	public int size() {
		// 求出栈中数据元素的个数
		return top+1;
	}

	public void nextOrder() {
		// 依次访问栈中每个元素输并出
		for (int i = top; i >=0 ; i--) {
			System.out.println(stackArray[i]);
		}
	}

	public void clear() {
		// 销毁已存在的栈
		top=-1;
	}

}

package com.neusoft.ConversionTest;

/**
 * ˳��չʾ����һ���ַ�����Ĵ洢��Ԫ�����ջ�׵�ջ��������Ԫ�� �������±�0��һ����Ϊջ�ף�Ϊ��ָʾջ��Ԫ��λ�ö���topָʾ
 * ջ��Ԫ����˳��ջ�е�λ�ã�topΪ����
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
		// top��ʼֵΪ-1��ָ��ջ��,���ջΪ�վ��ж�top==-1
		top = -1;
		stackArray = (T[]) new Object[Maxsize];
	}

	public SequenceStack(int n) {
		if (n <= 0) {
			System.out.println("���ȱ��������");
			System.exit(1);
		}
		top = -1;
		stackArray = (T[]) new Object[Maxsize];
	}

	public void push(T obj) {
		// ջ������һ����Ԫ��
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
		// ɾ��ջ��Ԫ��
		
		if (top==-1) {
			System.out.println("����ջΪ���޷�ɾ��");
			return null;
		}
		
		top--;
		return stackArray[top+1];
	}

	public T getHead() {
		// ȡջ������Ԫ��
		if (top==-1) {
			System.out.println("����ջΪ���޷�ɾ��");
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		// �жϵ�ǰջ�Ƿ�Ϊ��
		return top==-1;
	}

	public int size() {
		// ���ջ������Ԫ�صĸ���
		return top+1;
	}

	public void nextOrder() {
		// ���η���ջ��ÿ��Ԫ���䲢��
		for (int i = top; i >=0 ; i--) {
			System.out.println(stackArray[i]);
		}
	}

	public void clear() {
		// �����Ѵ��ڵ�ջ
		top=-1;
	}

}

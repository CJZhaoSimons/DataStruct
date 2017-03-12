package com.neusoft.sequence;
//ѭ��˳����л�������
public class sequenceQueue<T> {
	final int MaxSize=10;
	private T queueArray[];
	private int front,rear;
	//����һ���ն���
	public sequenceQueue(){
		front=rear=0;
		queueArray =(T[]) new Object[MaxSize];
	}
	//�ڶ��еĶ�β����һ��Ԫ��
	public void EnQueue(T obj) {
		//��ӵ�ʱ�򣬶�βָ��rear�ƶ�����ͷָ��front����
		if ((rear+1)%queueArray.length==front) {
			T[] p=(T[])new Object[queueArray.length*2];{
			if (rear==queueArray.length-1) {
				//��ԭ����queueArray����Ԫ�ظ�ֵ���¿��ٵ�p������
				for (int i = 0; i < rear; i++) {
					p[i]=queueArray[i];
				}
			}else {
				int i,j=1;
				for (i = front+1; i < queueArray.length; i++) {
					p[j]=queueArray[i];
				}
				for (i = 0; i < rear; i++) {
					p[j]=queueArray[i];
				}
				front=0;
				rear=queueArray.length-1;
			} 
		}
				rear=(rear+1)%queueArray.length;
				queueArray[rear]=obj;
	}
}
	//ɾ������ͷԪ��
	public T DeQueue() {
		if (isEmpty()) {
			System.out.println("�����Կգ��޷�����");
			return null;
		}
		front=(front+1)%queueArray.length;
		return queueArray[front];
	}
	//ȡ����ͷԪ��
	public T getHead() {
		if (isEmpty()) {
			System.out.println("�����Կգ��޷�����");
			return null;
		}
		return queueArray[(front+1)%queueArray.length];
	}
	//�������������Ԫ�صĸ���
	public int Size() {
		return (rear-front+queueArray.length)%queueArray.length;
	}
	//�жϵ�ǰ�����Ƿ�Ϊ ��
	public boolean isEmpty() {
		return front==rear;
	}
	//���η��ʶ����е�ÿһ��Ԫ�ز����
	public void nextOder() {
		int i,j=front;
		for ( i = 0; i < Size(); i++) {
			j=(j+1)%queueArray.length;
			System.out.println(queueArray[j]);
		}
	}
	//����һ���Ѵ��ڵĶ���
	public void clear() {
		front=rear=0;
	}
}

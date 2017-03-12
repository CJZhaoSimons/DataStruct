package com.neusoft.sequence;
//循环顺序队列基本操作
public class sequenceQueue<T> {
	final int MaxSize=10;
	private T queueArray[];
	private int front,rear;
	//构造一个空队列
	public sequenceQueue(){
		front=rear=0;
		queueArray =(T[]) new Object[MaxSize];
	}
	//在队列的队尾插入一个元素
	public void EnQueue(T obj) {
		//入队的时候，队尾指针rear移动，队头指针front不动
		if ((rear+1)%queueArray.length==front) {
			T[] p=(T[])new Object[queueArray.length*2];{
			if (rear==queueArray.length-1) {
				//将原来的queueArray数组元素赋值到新开辟的p对象中
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
	//删除队列头元素
	public T DeQueue() {
		if (isEmpty()) {
			System.out.println("队列以空，无法出列");
			return null;
		}
		front=(front+1)%queueArray.length;
		return queueArray[front];
	}
	//取队列头元素
	public T getHead() {
		if (isEmpty()) {
			System.out.println("队列以空，无法出列");
			return null;
		}
		return queueArray[(front+1)%queueArray.length];
	}
	//求出队列中数据元素的个数
	public int Size() {
		return (rear-front+queueArray.length)%queueArray.length;
	}
	//判断当前队列是否为 空
	public boolean isEmpty() {
		return front==rear;
	}
	//依次访问队列中的每一个元素并输出
	public void nextOder() {
		int i,j=front;
		for ( i = 0; i < Size(); i++) {
			j=(j+1)%queueArray.length;
			System.out.println(queueArray[j]);
		}
	}
	//销毁一个已存在的队列
	public void clear() {
		front=rear=0;
	}
}

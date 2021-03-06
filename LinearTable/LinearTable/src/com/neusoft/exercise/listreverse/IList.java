package com.neusoft.exercise.listreverse;

/**
 * @author SimonsZhao 
 * 线性表的基本操作 
 *1.线性表置空
 *2.线性表判空
 *3.求线性表长度
 *4.得到第i个元素的值
 *5.线性表第i个元素之前插入一个元素
 *6.删除并返回线性表中的第i个元素
 *7.线性表中首次出现指定数据元素的位置序号
 *8.输出线性表中的元素
 *9.删除指定元素的值
 *10.顺序表的逆置操作
 */
public interface IList {
	//1.线性表置空
	public void clear();
	//2.线性表判空
	public boolean isEmpty();
	//3.求线性表长度
	public int length();
	//4.得到第i个元素的值
	public Object get(int i);
	//5.线性表第i个元素之前插入一个元素
	public void insert(int i,Object x);
	//6.删除并返回线性表中的第i个元素
	public void remove(int i);
	//7.线性表中首次出现指定数据元素的位置序号
	public int indexOf(Object x);
	//8.输出线性表中的元素
	public void display();
	//9.删除指定元素的值
	public int remove(Object i);
	//10.顺序表的逆置操作
	public void reverse();
}

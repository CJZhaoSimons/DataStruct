package com.neusoft.link;
/**
 * @author zhao-chj
 * 测试循环单链表
 */
public class DebugCircleLinkList {
	public static void main(String[] args) {
		//-----------初始化循环链表中各个元素---------
		CircleLinkList L = new CircleLinkList();
		int n = 8;
		for (int i = 0; i <n ; i++) {
			L.insert(i, i);
		}
		System.out.println("循环链表的各个元素为：");
		L.display();
		//----------调用length()求长度-----------
		int length = L.length();
		System.out.println("循环链表长度为："+length);
		//----------调用get(int i)取出第i个元素----
		if (L.get(2) !=null ) {
			System.out.println("循环链表中第2个元素为"+L.get(2));
		}
		//----------index(Object x)查找x所在的位置--------
		int order = L.indexOf('c');
		if (order!=-1) {
			System.out.println("c元素与的位置为" + order);
		}else {
			System.out.println("字符c不在此链表中");
		}
		//-----------调用remove(i)删除元素---------------
		L.remove(2);
		System.out.println("移除数据元素2后循环链表中的各个元素为:");
		L.display();
		//-----------调用insert(int i，Object x)插入元素------------
		L.insert(3,'d');
		System.out.println("在第3个位置上插入元素d后的显示输出为：");
		L.display();
		//----------调用L.clear()将循环链表置空------------------
		L.clear();
		System.out.println("循环链表执行了置空操作");
		//-----------调用isEmpty()查看循环链表是否为空------
		if (L.isEmpty()) {
			System.out.println("循环链表为空");
		}else {
			System.out.println("循环链表不为空,循环链表中各个元素为：");
			L.display();
		}
	}
}

package com.neusoft.link;

public class DebugLinkedList2 {
	public static void main(String[] args) {
		//---------------初始化单链表中各个元素------------
		LinkedList2 L = new LinkedList2();
		for (int i = 0; i < 8; i++) {
			L.insert(i, i);
		}
		System.out.println("单链表的各个数据元素为");
		L.display();
		//--------------调用length()求 顺序表长度---------
		System.out.println("单链表长度为："+L.length());
		//--------------get(int i)取出第i个元素--------
		if (L.get(2)!=null) {
			System.out.println("单链表中第2个元素为"+L.get(2));
		}
		//-------------调用indexOf(Object x)查找x元素所在位置
		int order=L.indexOf("c");
		if (order!=-1) {
			System.out.println("单链表值为字符串c的数据元素位置为："+order);
		}else {
			System.out.println("字符c不存在与此单链表中");
		}
		//---remove(int i)删除数据元素----------------
		L.remove(2);
		System.out.println("删除第二个数据元素后的单链表的数据元素：");
		L.display();
		//---调用insert(int i，Object x)插入数据元素----------------
		L.insert(2, 'd');
		System.out.println("在2的位置插入数据元素d后单链表中个个数据元素");
		L.display();
		//---调用L.clear()将顺序表置空
		L.clear();
		System.out.println("将单链表置空后，再次打印表中的元素：");
		//----isEmpty()判断顺序表是否为空--------------------------
		if (L.isEmpty()) {
			System.out.println("单链表为空");
		}else {
			System.out.println("单链表不为空，单链表中各个数据元素：");
			L.display();
		}
	}
}

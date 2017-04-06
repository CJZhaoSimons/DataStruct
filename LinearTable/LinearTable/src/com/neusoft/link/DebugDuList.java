package com.neusoft.link;
/**
 * @author zhao-chj
 * 循环双链表的测试
 */
public class DebugDuList {
	public static void main(String[] args) {
		//-------调用构造方法----------------
		System.out.println("************执行构造方法**************");
		System.out.println("请您输入3个双向循环链表的数据元素");
		DulList L = new DulList(3);
		System.out.println("双向循环链表中各个数据元素~");
		L.display();
		//-------调用length()求顺序表的长度-----
		System.out.println("************执行length()方法**************");
		System.out.println("双向循环链表的长度为："+L.length());
		//-------调用get(int i)取出第i个元素---------
		System.out.println("************执行get(int i)方法**************");
		if (L.get(2)!=null) {
			System.out.println("双向循环链表中第2个元素为："+L.get(2));
		}else {
			System.out.println("双向循环链表中第2个元素不存在");
		}
		//-------调用indexOf(Object x)查找x元素所在的位置-------
		System.out.println("************执行indexOf(Object x)方法**************");
		int order = L.indexOf("c");
		if (order !=-1) {
			System.out.println("双向循环链表中字符串为c的数据元素位置："+order);
		}else {
			System.out.println("字符'c'不在促双向循环链表中");
		}
		//------remove(int i)删除数据元素------
		System.out.println("************执行remove(int i)方法**************");
		L.remove(2);
		System.out.println("删除第2个位置的数据之后双向循环链表的个个数据元素为：");
		L.display();
		//----insert(int i,Object x)插入数据元素----------
		System.out.println("************执行insert(int i,Object x)方法**************");
		L.insert(2, 'd');
		System.out.println("在2的位置上插入数据元素d之后双向循环链表的各个元素为：");
		L.display();
		//------调用L.clear()将顺序置空-------
		System.out.println("************执行L.clear()方法**************");
		L.clear();
		System.out.println("将双向循环链表置空之后再打印数据元素：");
		//-------isEmpty()判空操作-----------
		System.out.println("************执行isEmpty()方法**************");
		if (L.isEmpty()) {
			System.out.println("双向链表为空");
		}else {
			System.out.println("双向链表不为空，双向循环链表的各个元素为：");
			L.display();
		}
		System.out.println("************END**************");
	}
}

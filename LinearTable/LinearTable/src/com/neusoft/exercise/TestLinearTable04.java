package com.neusoft.exercise;
import com.neusoft.link.LinkedList;
import com.neusoft.link.Node;

/**
 * @author zhao-chj
 * 实现以删除单链表中的重复元素(去重)
 * 1.初始化单链表，并用尾插法或者头插法赋值
 * 2.显示插入元素的信息,使用display方法
 * 3.实现删除重复节点方法
 * 4.显示输出删除重复节点的值后的单链表
 */
public class TestLinearTable04 {
	public static void main(String[] args) {
		System.out.println("请输入单链表中的10 个节点的值~");
		 //1.初始化单链表，并用for循环赋值
		LinkedList L = new LinkedList(10,true);//true表示采用尾插法
		System.out.println("插入之后单链表中的各个节点的值为：");
		L.display();
		//2.删除重复节点方法
		removeRepeatElement(L);
		//3.显示输出删除重复节点的值后的单链表
		System.out.println("显示输出删除重复节点的值后的单链表:");
		L.display();
	}

	private static void removeRepeatElement(LinkedList l) {
		// TODO 删除重复节点方法
		Node p =l.head.next;//p节点指向后继元素
		Node q =null;//q节点指向前去元素
		while(p!=null){//从头结点开始查找
			int order = l.indexOf(p.data);
			q=p.next;
			while(q!=null){
				if ((p.data).equals(q.data)) {
					l.remove(order+1);
				}else {
					order++;
				}
				q=q.next;//依次寻找后继节点相同的值
			}
			p=p.next;//依次拿后续的每个元素和内层循环的值进行对比
		}
		
	}	
}

package com.neusoft.exercise;

import java.util.Scanner;

import com.neusoft.link.LinkedList;
import com.neusoft.link.Node;

/**
 * @author zhao-chj
 * 合并两个单链表为一有序链表
 * 将两个有序的单链表LA(有m个元素)和LB(有n个元素),要求元素均已从小到大的升序排列
 * 合并成一个有序的单链表LA
 * 1.使用尾插法建立LA和LB两个单链表,初始化LA的个数m和LB的个数n需要用户输入
 * 2.编写合并单链表为一个链表的算法,实现LA和LB其中的元素分别按从小到大顺序排列
 * 3.核心思想为：归并两个按照值非递减排列的带头结点的单链表LA和LB,得到新的带头结点
 * 的单链表LA,且LA也按照值的非递减顺序排列,返回LA作为最后结果。
 * 作业：从大到小实现上述要求
 */
public class TestLinearTable05 {
	public static void main(String[] args) {
		int m=0,n=0;
		//1.使用尾插法建立LA和LB两个单链表,初始化LA的个数m和LB的个数n需要用户输入
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入LA链表的个数：");
		 m = sc.nextInt();
		 System.out.println("请按照非递减的顺序输入"+m+"个数字");
		 LinkedList LA= new LinkedList(m,true);
		 System.out.println("请输入LB链表的个数：");
		 n=sc.nextInt();
		 System.out.println("请按照非递减的顺序输入"+n+"个数字");
		 LinkedList LB= new LinkedList(n,true);
		//2.编写合并单链表为一个链表的算法,实现LA和LB其中的元素分别按从小到大顺序排列
		System.out.println("将单链表LA和LB归并后，新的单链表LA中各个节点为：");
		LinkedList LA_new=mergeList(LA,LB);
	    //3.核心思想为：归并两个按照值非递减排列的带头结点的单链表LA和LB,得到新的带头结点
		     //的单链表LA,且LA也按照值的非递减顺序排列,返回LA作为最后结果。
		LA_new.display();
	}

	private static LinkedList mergeList(LinkedList LA,LinkedList LB) {
		// TODO 合并单链表的函数
		Node pa=LA.head.next;
		Node pb=LB.head.next;
		Node pc=LA.head;
		int da,db;
		while(pa!=null&&pb!=null){
			 da = Integer.valueOf(pa.data.toString());
			 db = Integer.valueOf(pb.data.toString());
			 if (da<=db) {
			  pc.next=pa;//将LA节点加入到新的LA节点中
			  pc=pa;
			  pa=pa.next;//如果da<db成立则pa指针依次后移
			}else {
			  pc.next=pb;//将LB节点加入到新的LA节点中
			  pc=pb;
			  pb=pb.next;//如果da>db成立则pb指针依次后移
			}
		}
		//如果LA和LB链表不相等的时候，需要将元素多的链表的剩余元素插入到新建立的LA中
		pc.next=(pa!=null?pa:pb);
		return LA;
	}
}

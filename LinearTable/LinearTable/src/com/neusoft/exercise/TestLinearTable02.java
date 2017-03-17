package com.neusoft.exercise;

import java.util.Scanner;

import com.neusoft.List.SequenceList;

/**
 * @author zhao-chj
 * 题2：编程实现查找线性表(0,1,2,3,...n-1)中第i个数据元素
 * 的直接前驱和后继，并输出他的值。在顺序表中实现。
 * 1.初始化线性表并构造一个有50个空间的顺序表
 * 2.在线性表中插入元素，按照(i,i),i=0,1,2...
 * 3.用户输入i的值，表示查找第几个元素的前驱和后继
 * 4.查找线性表中第i个元素的前驱，并输出
 * 5.查找线性表中的第i个元素的后继，并输出
 */
public class TestLinearTable02 {
	public static void main(String[] args) {
		 // 1.初始化线性表并构造一个有50个空间的顺序表
		SequenceList L = new SequenceList(50);
		 // 2.在线性表中插入元素，按照(i,i),i=0,1,2...
		int n=10;
		for (int i = 0; i < n; i++) {
			L.insert(i, i);
		}
		 // 3.用户输入i的值，表示查找第几个元素的前驱和后继
		System.out.println("请您输入要查询的元素");
		int in = new Scanner(System.in).nextInt();
		 // 4.查找线性表中第i个元素的前驱，并输出
		if (in>0&&in<n) {
			Object x = L.get(in-1);
			System.out.println("第"+in+"个元素的前驱为："+x);
		}else {
			System.out.println("第"+in+"个元素的前驱不存在");
		}
		 // 5.查找线性表中的第i个元素的后继，并输出
		if (in>=0&&in<n-1) {
			Object x = L.get(in+1);
			System.out.println("第"+in+"个元素的后继为："+x);
		}else {
			System.out.println("第"+in+"个元素的后继不存在");
		}
		
	}
}

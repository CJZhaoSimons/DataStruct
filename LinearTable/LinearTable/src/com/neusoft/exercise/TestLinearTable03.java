package com.neusoft.exercise;

import java.util.Scanner;

import com.neusoft.link.LinkedList;

/**
 * @author zhao-chj
 * 实现以单链表形式的线性表中查找第i个元素的直接前驱和后继
 * 1.初始化单链表，并用for循环赋值
 * 2.用户输入要查询单链表中第i个值
 * 3.调用单链表的方法或函数去实现查找第i个元素的直接前驱和后继
 */
public class TestLinearTable03 {
	public static void main(String[] args) {
		int n=10;
		 //1.初始化单链表，并用for循环赋值
		LinkedList L = new LinkedList();
		for (int i = 0; i < n; i++) {
			L.insert(i, i);
		}
		L.display();
		 //2.用户输入要查询单链表中第i个值
		System.out.println("请输入第i个值~");
		int input = new Scanner(System.in).nextInt();
		 //3.调用单链表的方法或函数去实现查找第i个元素的直接前驱和后继
		if (input>0&&input<n) {
			System.out.println("第"+input+"个元素的前驱是："+L.get(input-1));
		}else {
			System.out.println("第"+input+"元素的前驱不存在");
		}
		//4.后继元素
		if (input>=0&&input<n-1) {
			System.out.println("第"+input+"个元素的后继是："+L.get(input+1));
		}else {
			System.out.println("第"+input+"元素的后继不存在");
		}
	}	
}

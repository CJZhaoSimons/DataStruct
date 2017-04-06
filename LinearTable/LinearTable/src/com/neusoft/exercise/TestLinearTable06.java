package com.neusoft.exercise;

import java.util.Scanner;

import com.neusoft.link.CircleLinkList;

/**
 * @author zhao-chj
 * 约瑟夫环问题：
 * 来源：约瑟夫叙述了他和40个士兵在罗马战争期间被罗马军队包围之后签订的一人自杀协定。
 * 约瑟夫建议每个人杀掉他旁边的人,约瑟夫利用制定的规则使自己成为这些人中唯一的幸存者。
 * 编程：1.考虑存储结构：顺序存储结构和链式存储结构(杀人模拟删除节点,链表更适合)
 *     2.场景：程序需要处理8个士兵组成的线性表,因为每个人要杀掉他的邻居，则要保证
 *     每个人都有邻居，因此采用循环单链表操作,指针指向的位置表示邻居。
 *     ##可以考虑使用循环双链表
 *     3.核心思想：从循环单链表中某个节点开始依次去除其相邻节点，直到链表中剩下一个节点为止
 *     
 */
public class TestLinearTable06 {
	public static void main(String[] args) {
		CircleLinkList circleLinkList = new CircleLinkList();
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入士兵的个数~");
		int num = sc.nextInt();
		System.out.println(num+"士兵分别为：");
		for (int i = 0; i < num; i++) {
			//输入num个士兵
			circleLinkList.insert(i, sc.next());
		}
		for (int i = 0; circleLinkList.length()>1; ) {
			i = i%circleLinkList.length();
			//System.out.println("长度："+circleLinkList.length());
			//读取到链表中位序号为i的士兵
			String str1= circleLinkList.get(i).toString();
			//System.out.println("STR1："+str1);
			//求出相邻士兵在链表中的位序号
			i=++i%circleLinkList.length();
			//相邻的士兵
			String str2 =circleLinkList.get(i).toString();
			//System.out.println("STR2："+str2);
			//杀死相邻的士兵
			circleLinkList.remove(i);
			//输出谁杀死谁的信息
			System.out.println(str1+"杀死"+str2);
		}
		System.out.println("活着的是(约瑟夫)是："+circleLinkList.get(0));
	}
}

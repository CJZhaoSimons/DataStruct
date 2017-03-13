package com.neusoft.link;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		int n=10;
		LinkedList L= new LinkedList();
		for (int i = 0; i < n; i++) {
			L.insert(i, i);
		}
		System.out.println("请输入i的值：");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		if (nextInt>0&&nextInt<=n) {
			System.out.println("第"+nextInt+"个元素的前驱是："
						+L.get(nextInt-1));
		}else {
			System.out.println("第"+nextInt+"个元素的前驱不存在");
		}
		
		if (nextInt>=0&&nextInt<n-1) {
			System.out.println("第"+nextInt+"个元素的后继是："
						+L.get(nextInt+1));
		}else {
			System.out.println("第"+nextInt+"个元素的后继不存在");
		}
	}
}

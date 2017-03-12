package com.neusoft.ConversionTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConversionDemo {

	// 数制转换
	/**
	 * 题目：将十进制转化为r进制，方法是辗转相除法 N为十进制数字，r为要转化的进制
	 * 算法思想：
	 * 		 1.前提：当N>0的时候，重复一下两步骤
	 * 		 2.  若N！=0，则将N%r压入栈s中，执行步骤3，
	 * 			  若N==0，则将栈s中的内容依次出栈，算法结束。
	 * 	     3. 用N/r代替N，执行步骤2
	 * 算法步骤：
	 * 		while (N != 0) {
	 * 			s.push(N % r);//余数进栈
	 * 			N = N / r;
	 * 			}
	 * 例子：将78用辗转相除法转化为二进制的演示过程。
	 * 算法时间复杂度：O(n)
	 */
	public static void conversion(int N, int r) {
		SequenceStack<Integer> s = 
				new SequenceStack<Integer>();
		while (N != 0) {
			s.push(N % r);//余数进栈
			N = N / r;
		}
		System.out.println("转换结果为：");
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

	public static void main(String[] args) {
		BufferedReader br;
		Integer num,radio;
		try{
		br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("请输入一个十进制整数");
		num=Integer.parseInt(br.readLine());
		System.out.println("进制转换：");
		radio=Integer.parseInt(br.readLine());
		conversion(num, radio);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// Scanner sc = new Scanner(System.in);
		// int num1= sc.nextInt();
		// int radio1=sc.nextInt();
		
		
		
		
	}
}

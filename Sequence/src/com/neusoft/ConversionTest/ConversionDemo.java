package com.neusoft.ConversionTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConversionDemo {

	// ����ת��
	/**
	 * ��Ŀ����ʮ����ת��Ϊr���ƣ�������շת����� NΪʮ�������֣�rΪҪת���Ľ���
	 * �㷨˼�룺
	 * 		 1.ǰ�᣺��N>0��ʱ���ظ�һ��������
	 * 		 2.  ��N��=0����N%rѹ��ջs�У�ִ�в���3��
	 * 			  ��N==0����ջs�е��������γ�ջ���㷨������
	 * 	     3. ��N/r����N��ִ�в���2
	 * �㷨���裺
	 * 		while (N != 0) {
	 * 			s.push(N % r);//������ջ
	 * 			N = N / r;
	 * 			}
	 * ���ӣ���78��շת�����ת��Ϊ�����Ƶ���ʾ���̡�
	 * �㷨ʱ�临�Ӷȣ�O(n)
	 */
	public static void conversion(int N, int r) {
		SequenceStack<Integer> s = 
				new SequenceStack<Integer>();
		while (N != 0) {
			s.push(N % r);//������ջ
			N = N / r;
		}
		System.out.println("ת�����Ϊ��");
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
		System.out.println("������һ��ʮ��������");
		num=Integer.parseInt(br.readLine());
		System.out.println("����ת����");
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

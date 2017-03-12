package com.neusoft.matchingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.neusoft.ConversionTest.SequenceStack;

/**
 * ������
 *����ƥ���Ǽ��������г��������⣻
 *Ϊ�����⣺������ʽ�� ֻ�����������ţ�Բ���źͷ�����
 *Ƕ��������ģ�([]())��[()()[]]
 *��[(])��(([)])�ǲ�ƥ��ģ�����ȷ�ĸ�ʽ
 *���ܲ�ƥ��������
 *1.�����������Ų������ڴ���
 *		�磺����[([,���������ڴ�����]������������)��
 *��������Ų�ƥ�䡣
 *2.�������ǡ�����֮�͡���������[()],��ʱ�򲢲���Ҫ������
 *��������ʱ�������������ţ���ƥ�䲻�ɹ�
 *3.ֱ��������Ҳû�е������ڴ���������������[(()),���
 *��ʱ���ʽ�Ѿ����������ǻ���һ��]û�б�ƥ�䣬��ƥ�䲻�ɹ�
 *�ܽ᣺����ƥ�����⣺���������Ƿ�������(�ڴ��Ľ��ȳ̶�)
 *Ҳ����˵��������������Ӧ�����ȱ�ƥ�䣬�������ȳ�����ջ
 *
 *�㷨˼�룺
 *	 ����������в�Ϊ�գ��ظ�����1
 *	����1��������������ȡ��1�����ţ����������
 *	a) �������������ͽ�ջ
 *	b) ���ǳ��������������ȼ��ջ�Ƿ�Ϊ�ա�
 *		��ջ�գ�������������Ŷ��࣬ƥ��ʧ��
 *		���򣬺�ջ��Ԫ����Ƚϣ���ƥ�䣬����������ջ������ƥ��
 *	 ����2���������н���ʱ����ջ�գ���������ʽ��ƥ����ȷ��
 *			��������������������࣬ƥ��ʧ�ܡ�
 *	
 *�㷨ִ�в��裺
 *�㷨��ʱ�临�Ӷȣ�
 */
public class matching {
	public static boolean matchingExp(char[] exp) {
		int state=1,i=0;//���ƥ�����űȽ϶��뽫SequenceStack��Maxsize�Ĵ�
		SequenceStack<Character> s= new SequenceStack<Character>();
		while(i<exp.length&&state==1){
			switch (exp[i]) {
			case '[':
			case '(':
			{
				s.push(exp[i]);
				i++;
				break;
			}
			case ']':
			{
				if (!s.isEmpty()) {
					if(s.getHead()=='['){
						s.pop();
						i++;
					}else{state=0;}
				}else{state=0;}
				break;
			}	
			case ')':
			{
				if (!s.isEmpty()) {
					if(s.getHead()=='('){
						s.pop();
						i++;
					}else{state=0;}
				}else{state=0;}
				break;
			}	
			default:
				{i++;break;}
			}
		}
		if(s.isEmpty()&&state==1){return true;}
		else return false;
	}
	
	
	public static void main(String[] args) {
		BufferedReader br;
		String s;
		char[] us;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("����һ������()��[]�ı��ʽ");
			s= br.readLine();
			us=s.toCharArray();//
//			for (int i = 0; i < us.length; i++) {
//				System.out.println(us[i]);
//			}
//			System.out.println(us);
			if(matchingExp(us)){//
				System.out.println("���ʽ�� ����ƥ��");
			}else{
				System.out.println("���ʽ�� ���Ų�ƥ��");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("ƥ��������Ŀ������");
		}
	}	
}

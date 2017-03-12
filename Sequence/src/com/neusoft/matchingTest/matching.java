package com.neusoft.matchingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.neusoft.ConversionTest.SequenceStack;

/**
 * 简述：
 *括号匹配是计算机设计中常见的问题；
 *为简化问题：假设表达式中 只允许两种括号：圆括号和方括号
 *嵌套是任意的，([]())、[()()[]]
 *而[(])、(([)])是不匹配的，不正确的格式
 *可能不匹配的情况：
 *1.到来的右括号不是所期待的
 *		如：输入[([,接下来最期待的是]，如果输入的是)，
 *则和左括号不匹配。
 *2.到来的是“不速之客”，如输入[()],这时候并不需要右括号
 *，如果这个时候输入了右括号，则匹配不成功
 *3.直到结束，也没有到来所期待的括弧，如输入[(()),如果
 *此时表达式已经结束，但是还有一个]没有被匹配，则匹配不成功
 *总结：括号匹配问题：检验括号是否完整，(期待的紧迫程度)
 *也就是说最后输入的左括号应该最先被匹配，满足后进先出，用栈
 *
 *算法思想：
 *	 如果括号序列不为空，重复步骤1
 *	步骤1：从括号序列中取出1个括号，分两种情况
 *	a) 凡是左括弧，就进栈
 *	b) 凡是出现右括弧，首先检查栈是否为空。
 *		若栈空，则表明该右括号多余，匹配失败
 *		否则，和栈顶元素相比较，若匹配，则左括弧出栈，否则不匹配
 *	 步骤2：括号序列结束时，若栈空，则表明表达式中匹配正确，
 *			否则表明“左括弧”多余，匹配失败。
 *	
 *算法执行步骤：
 *算法的时间复杂度：
 */
public class matching {
	public static boolean matchingExp(char[] exp) {
		int state=1,i=0;//如果匹配括号比较多请将SequenceStack中Maxsize改大
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
			System.out.println("输入一个含有()和[]的表达式");
			s= br.readLine();
			us=s.toCharArray();//
//			for (int i = 0; i < us.length; i++) {
//				System.out.println(us[i]);
//			}
//			System.out.println(us);
			if(matchingExp(us)){//
				System.out.println("表达式中 括号匹配");
			}else{
				System.out.println("表达式中 括号不匹配");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("匹配括号项目结束！");
		}
	}	
}

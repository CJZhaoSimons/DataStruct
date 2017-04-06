package com.neusoft.stack;
/**
 * @author zhao-chj
 * 编写一个序列判断十个字符是否是回文序列
 * 回文序列:正读和反读都相同,如abba和abdba
 * 要求：使用栈实现
 */
public class Exercise002 {
	private static boolean isPailndSeq(String str) {
		// TODO 判断是否为回文序列
		LinkStack S= new LinkStack();
		for (int j = 0; j < str.length(); j++) {
			S.push(str.charAt(j));//Returns the char value at the specified index.
		}
		for (int i = 0; i < str.length(); i++) {
			char c=((Character)S.pop()).charValue();
			if (c!=str.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1="abba";
		String str2="abdba";
		boolean as=isPailndSeq(str1);
		if (as) {
			System.out.println(str1+"是回文序列");
		}else {
			System.out.println(str1+"不是回文序列");
		}
	}


}

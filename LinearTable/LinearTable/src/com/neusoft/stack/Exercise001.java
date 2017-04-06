package com.neusoft.stack;
/**
 * @author zhao-chj
 * 编写一个函数，要求借助栈把一个数组中的元素逆置
 */
public class Exercise001 {
  public static void main(String[] args) {
	  Integer[] a={2,3,5,8,12,34};
	  System.out.println("逆置前数组中的各个元素为：");
	  for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	  System.out.println();
	  reserve(a);
	  System.out.println("逆置后的数据中的元素为：");
	  for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
  }

  private static void reserve(Object[] a) {
	// TODO 栈中数组元素逆置
	SqStack S = new SqStack(a.length);
	for (int i = 0; i < a.length; i++) {
		S.push(a[i]);
	}
	for (int i = 0; i < a.length; i++) {
		a[i]=S.pop();
	}
}
}

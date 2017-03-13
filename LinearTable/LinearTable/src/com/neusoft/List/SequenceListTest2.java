package com.neusoft.List;
import java.util.Scanner;
/**
 * @author SimonsZhao
 *实现查找线性表中第i个数据元素的直接前驱和后继，并输出
 */
public class SequenceListTest2 {
	public static void main(String[] args) {
		int n=10;
		SequenceList seq= new SequenceList(50);
		for (int i = 0; i < n; i++) {
			seq.insert(i, i);
		}
		System.out.println("请输入i的值：");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input>0 && input<=n) {
		System.out.println("第"+input+"个元素的直接前驱是："+seq.get(input-1));
		}else {
			System.out.println("第"+input+"个元素的直接前驱不存在");
		}
		
		if (input>=0 && input<n) {
			System.out.println("第"+input+"个元素的直接后继是："+seq.get(input+1));
			}else {
				System.out.println("第"+input+"个元素的直接后继不存在");
			}
	}
}

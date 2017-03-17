package com.neusoft.exercise;

import com.neusoft.List.SequenceList;

/**
 * @author zhao-chj
 *    建立一个顺序存储的线性表，查找顺序表中第一个出现的值为z
 *的元素并输出其位置。
 *1.建立一个顺序存储的线性表
 *2.首先初始化线性表，并且插入值为z的元素
 *3.查找第一个出现值为z的元素
 *4.对于位置的判断需要考虑是否符合要求
 *5.并输出该元素的位置
 */
public class TestLinearTable01 {
	public static void main(String[] args) {
		 //1.建立一个顺序存储的线性表
		SequenceList L = new SequenceList(10);
		 //2.首先初始化线性表，并且插入值为z的元素
		L.insert(0, 'a');
		L.insert(1, 'z');
		L.insert(2, 'd');
		L.insert(3, 'm');
		L.insert(4, 'z');
		 //3.查找第一个出现值为z的元素
		int location = L.indexOf('z');
		 //4.对于位置的判断需要考虑是否符合要求
		if (location!=-1) {
			System.out.println("第一次出现z元素的位置为："+location);
		}else {
			System.out.println("顺序表中不存在为z的元素");
		}
		 //5.并输出该元素的位置
	}
}

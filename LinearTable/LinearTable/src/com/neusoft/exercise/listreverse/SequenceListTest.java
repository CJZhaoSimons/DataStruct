package com.neusoft.exercise.listreverse;

public class SequenceListTest {
	public static void main(String[] args) {
		SequenceList seq=new SequenceList(10);
		//------插入数据元素--------
		seq.insert(0,'a');
		seq.insert(1,'b');
		seq.insert(2,'c');
		seq.insert(3,'d');
		seq.insert(4,'e');
		//------显示插入元素--------
		System.out.println("原序列数据元素为:");
		seq.display();
		//------就地逆置-----------
		seq.reverse();
		//------显示就地逆置后元素--------
		System.out.println("就地逆置后元素为:");
		seq.display();
	}
}

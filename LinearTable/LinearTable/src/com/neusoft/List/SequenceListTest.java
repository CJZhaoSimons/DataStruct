package com.neusoft.List;

public class SequenceListTest {
	public static void main(String[] args) {
		SequenceList seq=new SequenceList(10);
		seq.insert(0,'a');
		seq.insert(1,'b');
		seq.insert(2,'c');
		seq.insert(3,'d');
		seq.insert(4,'e');
		int index = seq.indexOf('e');
		if (index != -1) {
			System.out.println("第一次出现的位置为"+index);
		}else {
			System.out.println("不存在");
		}
	}
}

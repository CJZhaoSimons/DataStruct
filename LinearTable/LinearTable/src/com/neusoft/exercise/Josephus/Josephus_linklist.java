package com.neusoft.exercise.Josephus;

public class Josephus_linklist {
	
	public static void main(String[] args) {
		new Josephus_linklist(5,0,2);
	}
	public Josephus_linklist(int number, int start, int distance) {
				// TODO 约瑟夫环的构造方法
				System.out.println("Josephus("+number+","+start+","+distance+")");
				//输入提示
				System.out.println("请您输入"+number+"个元素");
				//插入元素的名称，如以A,B,C等为例
				LinkedList list=new LinkedList(number,true);
				//显示已插入元素的名字
				list.display();
				//计算起始位置
				int i=start;
				//找到下一个distance距离的元素
				while(list.length()>1){
					i=(i+distance-1)%list.length();
					//将删除掉的元素作为返回值返回
					System.out.print("删除"+list.remove(i)+":");
					list.display();
				}
				//输出赦免的元素是谁
				System.out.println("被赦免者是："+list.get(0));
		
	}

}

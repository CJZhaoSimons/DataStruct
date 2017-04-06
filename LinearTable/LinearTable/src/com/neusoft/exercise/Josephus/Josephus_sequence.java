package com.neusoft.exercise.Josephus;
/**
 * @author zhao-chj
 * 古代判官要判决number个罪犯的死刑，制定了一条荒谬的法律
 *   将犯人站成一个圈，从start开始数起，每数到第distance
 * 个就处决他，依照此规律直到最后剩下一个人赦免。
 *   如当number=5时候，start=0，distance=2时：
 *   1.假设五个人是A B C D E
 *   2.从A开始每隔两个处决一个人，依次处决
 *   3.原始序列A(0) B(1) C(2) D(3) E(4)
 *      第一次A(0) C(2) D(3) E(4)  干掉B(1),从c开始
 *      第二次A(0) C(2) D(3) E(4)  干掉D(3)，从e开始
 *      第三次A(0) C(2) E(4)  干掉A(0),从c开始数
 *      第四次C(2) E(4)  干掉E(4)
 *      第五次C(2)   c是被赦免的人
 */
public class Josephus_sequence {
	public static void main(String[] args) {
		new	Josephus_sequence(5,0,2);
	}
	public Josephus_sequence(int number,int start,int distance) {
		// TODO 约瑟夫环的构造方法
		System.out.println("Josephus("+number+","+start+","+distance+")");
		//插入元素的名称，如以A,B,C等为例
		SequenceList list =new SequenceList(number);
		for (int i = 0; i < number; i++) {
			list.insert(i,(char)('A'+i)+" ");
		}
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

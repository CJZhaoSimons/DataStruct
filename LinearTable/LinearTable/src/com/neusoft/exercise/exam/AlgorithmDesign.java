package com.neusoft.exercise.exam;
/**
 * 算法设计思想：
 * @author zhao-chj
 * 1.两个带头结点的单链表str1和str2,
 * 2.其中str1的长度为m,str2的长度为n,长度之差为m-n
 * 3.先在长度较长的链表上遍历长度之差m-n个元素,在同步遍历两个单链表
 * 4.直到找到相同节点或者两个节点到达两个链表表尾为止
 */
public class AlgorithmDesign {
	public static void main(String[] args) {
		System.out.println("请您输入3个元素~");
		LinkedList str1=new LinkedList(3,true);
		str1.display();
		System.out.println("请您输入2个元素~");
		LinkedList str2=new LinkedList(2,true);;
		str2.display();
		Node searchFirstCommon = searchFirstCommon(str1, str2);
		String result=(String)searchFirstCommon.getData();
		System.out.println(result);
		
	}
	public static Node searchFirstCommon(LinkedList str1,LinkedList str2){
		Node lp,sp;//lp指向较长链表,sp指向较短链表
		int m = str1.length();
		System.out.println("str1长度"+m);
		int n = str2.length();
		System.out.println("str2长度"+n);
		int k=(m>n)?m-n:n-m;//两个元素长度之差
		//将lp和sp分别指向长链表和短链表
		if (m>n) {
			//lp指针指向长度为m的str1,sp指针指向长度为n的str2
			//如果定义的单链表没有gethead()方法首先应该增加该方法获取对应链表的头指针
			//定义next节点指针，指向第一个元素
		 lp = str1.getHead().getNext();//较长元素的首节点
		 System.out.println("str1首节点:"+lp.getData());		 
		 sp=str2.getHead().getNext();
		 System.out.println("str2首节点:"+sp.getData());		 
		}else {
		 lp = str2.getHead().getNext();//较长元素的首节点
		 sp=str1.getHead().getNext();
		}
		//较长的元素先遍历k个节点
		while(k!=0){
			System.out.println("LP+++:"+lp.getData());
			lp=lp.getNext();
			System.out.println("LP---:"+lp.getData());
			System.out.println("K的值为："+k);
			k--;
		}

		while(lp!=null){
		if (lp.getData()==sp.getData()) {
			//System.out.println(lp.getData());
			System.out.println("[][]"+lp.getData());
			return lp;
		}else {
			//System.out.println("LP00000:"+lp.getData());
			//System.out.println("SP00000:"+sp.getData());
			lp=lp.getNext();
			sp=sp.getNext();
		}
	}
		return null;
	}
}

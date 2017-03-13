package com.neusoft.List;

public class SequenceList implements IList{
	public Object[] listElem;
	public int currentLen;//线性表长度
	public  SequenceList(int maxSize) {
		currentLen =0;//线性表长度置空
		listElem = new Object[maxSize];
		//为顺序表分配存储空间
	}
	@Override
	public void clear() {
		currentLen=0;//置顺序表的当前长度为0
	}

	@Override
	public boolean isEmpty() {
		return currentLen==0;
	}

	@Override
	public int length() {
		return currentLen;
	}
	//4.得到第i个元素的值
	@Override
	public Object get(int i) {
		if (i<0 || i>currentLen-1) {
			System.out.println("第"+i+"个元素不存在");
		}
		return listElem[i];
	}
	@Override
	public void insert(int i, Object x) {//i指的是在第几个位置插入
		if (i<0 || i>currentLen) {
			System.out.println("第"+i+"个元素不存在");
		}
		if (currentLen==listElem.length) {
			System.out.println("顺序表容量已满");
		}
		for (int j = currentLen; j >i; j--) {
			listElem[j]=listElem[j-1];
		}
		listElem[i]=x;
		currentLen++;
	}

	@Override
	public void remove(int i) {
		// 将顺序表上的第i个元素a从顺序表中删除
		if (i<0 ||i>=currentLen-1) {
			System.out.println("删除位置不合法");
		}
		for (int j = i; j < currentLen-1; j++) {
			listElem[j]=listElem[j+1];
		}
		currentLen--;
	}

	@Override
	public int indexOf(Object x) {
		//查找满足条件的数据元素首次出现的位置
		//显示顺序表中待比较的数据元素，其起始值指示顺序表中第0个元素
		int j =0;
		while (j<currentLen&&!listElem[j].equals(x)) {
			j++;
		}
		if (j<currentLen) {
			return j;//返回值为x的数据元素在线性表中的位置
		}else {
			return -1;//顺序表中不存在该元素。
		}
	}

	@Override
	public void display() {
		for (int i = 0; i < currentLen; i++) {
			System.out.println(listElem[i]+" ");
		}
		System.out.println();

}
	@Override
	public int remove(Object i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
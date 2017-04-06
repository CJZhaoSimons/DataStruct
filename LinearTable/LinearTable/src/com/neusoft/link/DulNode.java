package com.neusoft.link;
/**
 * @author zhao-chj
 *双向循环链表节点类
 */
public class DulNode {
	public Object data;
	public DulNode prior;
	public DulNode next;
	public DulNode() {//无参构造函数
		this(null);
	}
	public DulNode(Object data) {//构造值为data的节点
		this.data=data;
		this.prior=null;
		this.next=null;
	}
}

package com.neusoft.SortDemo;
/**
 * 业务描述：
 * 某银行有一个客户办理业务，在单位时间内随机地有客户到达
 * 设每位客户的业务办理时间是某一个范围内的随机值。
 * 设只有一个窗口，一个业务人员，要求程序能够模拟统计在
 * 设定时间内，业务人员的总空闲时间和客户的平均等待时间
 * 。假定模拟数据已经按照客户到达顺序依次存放于某个文件
 * 中，对应的每位客户有两个数据，到达实践和需要办理业务的
 * 时间。
 *
 */

public class QNode {
	public int arrive;//到达时间
	public int treat;//业务办理所需时间
	public QNode(int a,int t) {
		this.arrive=a;
		this.treat=t;
	}
}

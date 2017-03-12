package com.neusoft.SortDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import com.neusoft.sequence.sequenceQueue;

/**
 * 算法描述：
 * { 设置统计初值；
 *   设置当前时钟时间为0
 *   打开数据文件，读取数据文件
 *   读入第一位客户的信息存储于变量中
 *   do{
 *   	if(等待队列为空，并且还有客户等待){
 *   		累计业务员总的等待时间；
 *   		时钟推进到暂存变量中的客户到达时间
 *   		暂存变量中的客户信息入队
 *   		读取下一位客户信息暂存变量
 *   	}
 *   累计客户人数
 *   从等待的队列中出队一位客户
 *   将该客户的等待时间累计到客户的总等待时间
 *   设定当前客户的业务办理结束时间
 *   while(下一位客户的到达时间在当前客户处理结束之前){
 *   	暂存变量中的客户信息人员；
 *   	读取下一位客户信息存于暂存变量
 *   }
 *   时钟推进到当前客户的结束时间
 *   }while(还有未处理的客户)
 *   计算统计结果并输出；
 * }
 *
 */
public class SortBank {
	public static void main(String[] args) {
		int dwait=0,colck=0,wait=0;
		int count=0,have=0,finish;
		int arr,tre;
		QNode curr,temp;
		StringTokenizer rsplit;
		sequenceQueue<QNode> wa=new sequenceQueue<QNode>();
		try {
			BufferedReader br = new BufferedReader(
				new FileReader("D:\\WorkSpace\\EclispeWorkspace\\customer.txt"));
			String s;
			s= br.readLine();
			rsplit = new StringTokenizer(s);
			arr=Integer.parseInt(rsplit.nextToken());
			tre=Integer.parseInt(rsplit.nextToken());
			System.out.println("arr:"+arr);
			System.out.println("tre:"+tre);
			temp=new QNode(arr, tre);
			while(wa.Size()!=0||s!=null){
				if (wa.Size()==0&&s!=null) {//等待队列为空，但还有客户
					//累计业务员总的等待时间；
					dwait+=temp.arrive-colck;
					//时钟推进到暂存变量中的客户到达时间
					colck= temp.arrive;
					wa.EnQueue(temp);
					s=br.readLine();
					if (s!=null) {
						rsplit = new StringTokenizer(s);
						arr=Integer.parseInt(rsplit.nextToken());
						tre=Integer.parseInt(rsplit.nextToken());
						temp=new QNode(arr, tre);
					}
				}
				count++;//统计等待人数
				curr=wa.DeQueue();//出队一位客户信息
				wait+=colck-curr.arrive;//累计到客户的总等到时间
				finish=colck+curr.treat;//设置业务办理结束时间
				// while(下一位客户的到达时间在当前客户处理结束之前){
				while(s!=null&&temp.arrive<=finish){
					wa.EnQueue(temp);
					s=br.readLine();
					rsplit= new StringTokenizer(s);
					arr= Integer.parseInt(rsplit.nextToken());
					tre= Integer.parseInt(rsplit.nextToken());
					temp=new QNode(arr,tre);
				}
				colck=finish;//时钟推进到当前客户办理结束时间
			}
		} catch (Exception e) {
			System.out.println("文件访问异常！"+e);
			e.printStackTrace();
		}
		System.out.println("业务等待时间   客户平均等待时间");
		System.out.println(dwait+"    "+(double)wait/count);
		System.out.println("模拟总时间   客户人数   总等待时间");
		System.out.println(colck+"  "+count+"  "+wait);	
	}
}

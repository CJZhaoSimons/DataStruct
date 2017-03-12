package com.neusoft.SortDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import com.neusoft.sequence.sequenceQueue;

/**
 * �㷨������
 * { ����ͳ�Ƴ�ֵ��
 *   ���õ�ǰʱ��ʱ��Ϊ0
 *   �������ļ�����ȡ�����ļ�
 *   �����һλ�ͻ�����Ϣ�洢�ڱ�����
 *   do{
 *   	if(�ȴ�����Ϊ�գ����һ��пͻ��ȴ�){
 *   		�ۼ�ҵ��Ա�ܵĵȴ�ʱ�䣻
 *   		ʱ���ƽ����ݴ�����еĿͻ�����ʱ��
 *   		�ݴ�����еĿͻ���Ϣ���
 *   		��ȡ��һλ�ͻ���Ϣ�ݴ����
 *   	}
 *   �ۼƿͻ�����
 *   �ӵȴ��Ķ����г���һλ�ͻ�
 *   ���ÿͻ��ĵȴ�ʱ���ۼƵ��ͻ����ܵȴ�ʱ��
 *   �趨��ǰ�ͻ���ҵ��������ʱ��
 *   while(��һλ�ͻ��ĵ���ʱ���ڵ�ǰ�ͻ��������֮ǰ){
 *   	�ݴ�����еĿͻ���Ϣ��Ա��
 *   	��ȡ��һλ�ͻ���Ϣ�����ݴ����
 *   }
 *   ʱ���ƽ�����ǰ�ͻ��Ľ���ʱ��
 *   }while(����δ����Ŀͻ�)
 *   ����ͳ�ƽ���������
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
				if (wa.Size()==0&&s!=null) {//�ȴ�����Ϊ�գ������пͻ�
					//�ۼ�ҵ��Ա�ܵĵȴ�ʱ�䣻
					dwait+=temp.arrive-colck;
					//ʱ���ƽ����ݴ�����еĿͻ�����ʱ��
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
				count++;//ͳ�Ƶȴ�����
				curr=wa.DeQueue();//����һλ�ͻ���Ϣ
				wait+=colck-curr.arrive;//�ۼƵ��ͻ����ܵȵ�ʱ��
				finish=colck+curr.treat;//����ҵ��������ʱ��
				// while(��һλ�ͻ��ĵ���ʱ���ڵ�ǰ�ͻ��������֮ǰ){
				while(s!=null&&temp.arrive<=finish){
					wa.EnQueue(temp);
					s=br.readLine();
					rsplit= new StringTokenizer(s);
					arr= Integer.parseInt(rsplit.nextToken());
					tre= Integer.parseInt(rsplit.nextToken());
					temp=new QNode(arr,tre);
				}
				colck=finish;//ʱ���ƽ�����ǰ�ͻ��������ʱ��
			}
		} catch (Exception e) {
			System.out.println("�ļ������쳣��"+e);
			e.printStackTrace();
		}
		System.out.println("ҵ��ȴ�ʱ��   �ͻ�ƽ���ȴ�ʱ��");
		System.out.println(dwait+"    "+(double)wait/count);
		System.out.println("ģ����ʱ��   �ͻ�����   �ܵȴ�ʱ��");
		System.out.println(colck+"  "+count+"  "+wait);	
	}
}

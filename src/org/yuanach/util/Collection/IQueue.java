package org.yuanach.util.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * 	interface Queue extends Collection
 */
public class IQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		Random r=new Random(50);
		
		Integer integer=new Integer(r.nextInt());
		
		//����
		integer=q.element();
		integer=q.peek();
		
		//���У���ɾ��
		integer=q.poll();
		integer=q.remove();
		
		//����
		q.offer(integer);
		
		for(int i=0;i<10;i++)
			q.offer(r.nextInt());

		System.out.println(q);
	}

}

package org.yuanach.lang;

public class MyObject {

	private static int hash=0x00;
	private static long milliseconds=0x00;
	private static int nanoseconds=0x00;
	
	public static void main(String[] args) {
		
		Class cls; 
		
		Object obj=new Object();
		Object obj2=new Object();
		
		//�Ƚ��Ƿ�Ըö���ȼ�
		obj.equals(obj2);
		
		//���������ö������
		cls=obj.getClass();
		
		//
		hash=obj.hashCode();
		
		//�ָ��ȴ����ö�����߳�ִ��
		obj.notify();
		
		//�ָ����еȴ����ö�����߳�ִ��
		obj.notifyAll();
		
		//��������������ַ���
		obj.toString();
		
		//�ȴ���һ���̵߳�ִ��
		//�ȴ�ֱ��ָ������������һ��ִ�е��߳�
		//�ȴ�ֱ��ָ���������ͺ�΢�����һ��ִ�е��߳�
		try {
			obj.wait();
			obj.wait(milliseconds);
			obj.wait(milliseconds, nanoseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package org.yuanach.lang;

public class MyObject {

	private static int hash=0x00;
	private static long milliseconds=0x00;
	private static int nanoseconds=0x00;
	
	public static void main(String[] args) {
		
		Class cls; 
		
		Object obj=new Object();
		Object obj2=new Object();
		
		//比较是否对该对象等价
		obj.equals(obj2);
		
		//返回描述该对象的类
		cls=obj.getClass();
		
		//
		hash=obj.hashCode();
		
		//恢复等待调用对象的线程执行
		obj.notify();
		
		//恢复所有等待调用对象的线程执行
		obj.notifyAll();
		
		//返回描述对象的字符串
		obj.toString();
		
		//等待另一个线程的执行
		//等待直至指定毫秒数的另一个执行的线程
		//等待直至指定毫秒数和毫微秒的另一个执行的线程
		try {
			obj.wait();
			obj.wait(milliseconds);
			obj.wait(milliseconds, nanoseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

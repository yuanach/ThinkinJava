package org.yuanach.lang.Thread;

public class IThread{

	/*
	 * 	public class java.lang.Thread 
	 * 		implements java.lang.Runnable
	 */
	
	private static String tName="";
	/* must be limited between MIN_PRIORITY(0) and MAX_PRIORITY(10)
	 * default Priority is NORM_PRIORITY(5)*/
	private static int tPriority=0; 
	private static long millis=1000;
	private static int nanos=100;

	public static void main(String[] args) {
		
	}
	
	private static void imain(){
		Thread thread=Thread.currentThread();

		tName=thread.getName();
		thread.setName(tName);
		
		tPriority=thread.getPriority();
		thread.setPriority(tPriority);
		
		if(thread.isAlive()) 
			System.out.print("The thread is still alive.");
		
		
		try{
			
			//等待这个线程终止，在其他线程(如主线程)中使用
			thread.join();
			thread.join(millis);
			thread.join(millis, nanos);
			
			//sleep()是静态方法，应该由Thread类直接调用
			Thread.sleep(millis);
			Thread.sleep(millis, nanos);
			
			thread.start();
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}

 class NewThreadi implements Runnable{

	Thread t;
	private static String tName="";

	/*	
	 * 创建新线程，this指向当前Runnable实例，用于调用run()线程入口方法
	*	Runnable实例在IThread对象创建时已经被创建
	*/
	public NewThreadi(String tName){	
		t=new Thread(this,tName);
	}
	
	/*
	 *	实现run()
	 *	线程入口点，方法指定了线程的主要任务，与主线程共享CPU资源
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// thread start here
	}
}
 
 /*
  * 	创建线程的第二种方式
  */
class NewThreadii extends Thread{
	
	private static String tName="";
	
	public NewThreadii(String tName){
		super(tName);
		start();
	}
	
	/*
	 * 重写run()
	 */
	@Override
	public void run(){
		//thread start here
	}
}

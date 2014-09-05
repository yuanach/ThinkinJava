package org.yuanach.lang.Thread;

public class IThread  implements Runnable{

	/*
	 * 	public class java.lang.Thread 
	 * 		implements java.lang.Runnable
	 */
	
	private Thread t;
	private static final String THREAD_ERROR_TAG="Thread Exception";
	private static String tName="";
	private static int tPriority=0;
	private static long millis=1000;
	private static int nanos=100;
	
	public static void main(String[] args) {
	
		Thread thread=Thread.currentThread();

		tName=thread.getName();
		thread.setName(tName);
		
		tPriority=thread.getPriority();
		thread.setPriority(tPriority);
		
		if(thread.isAlive()) 
			System.out.print("The thread is still alive.");
		
		
		try{
			
			thread.join();
			
			//sleep()是静态方法，应该由Thread类直接调用
			Thread.sleep(millis);
			Thread.sleep(millis, nanos);
			
			thread.start();
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public IThread(){
		
		tName="My Thread";
		
		/*	创建新线程，this指向当前Runnable实例，用于调用run()线程入口方法
		*	Runnable实例在IThread对象创建时已经被创建
		*/
		t=new Thread(this,tName);
		
		t.start();
	}
	
	/*
	 *	线程入口点，方法指定了线程的主要任务，与主线程共享CPU资源
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		
	}

}

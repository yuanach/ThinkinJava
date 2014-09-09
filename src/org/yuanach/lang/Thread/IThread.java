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
			
			//�ȴ�����߳���ֹ���������߳�(�����߳�)��ʹ��
			thread.join();
			thread.join(millis);
			thread.join(millis, nanos);
			
			//sleep()�Ǿ�̬������Ӧ����Thread��ֱ�ӵ���
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
	 * �������̣߳�thisָ��ǰRunnableʵ�������ڵ���run()�߳���ڷ���
	*	Runnableʵ����IThread���󴴽�ʱ�Ѿ�������
	*/
	public NewThreadi(String tName){	
		t=new Thread(this,tName);
	}
	
	/*
	 *	ʵ��run()
	 *	�߳���ڵ㣬����ָ�����̵߳���Ҫ���������̹߳���CPU��Դ
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// thread start here
	}
}
 
 /*
  * 	�����̵߳ĵڶ��ַ�ʽ
  */
class NewThreadii extends Thread{
	
	private static String tName="";
	
	public NewThreadii(String tName){
		super(tName);
		start();
	}
	
	/*
	 * ��дrun()
	 */
	@Override
	public void run(){
		//thread start here
	}
}

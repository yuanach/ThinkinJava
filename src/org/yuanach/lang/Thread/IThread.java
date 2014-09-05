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
			
			//sleep()�Ǿ�̬������Ӧ����Thread��ֱ�ӵ���
			Thread.sleep(millis);
			Thread.sleep(millis, nanos);
			
			thread.start();
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public IThread(){
		
		tName="My Thread";
		
		/*	�������̣߳�thisָ��ǰRunnableʵ�������ڵ���run()�߳���ڷ���
		*	Runnableʵ����IThread���󴴽�ʱ�Ѿ�������
		*/
		t=new Thread(this,tName);
		
		t.start();
	}
	
	/*
	 *	�߳���ڵ㣬����ָ�����̵߳���Ҫ���������̹߳���CPU��Դ
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		
	}

}

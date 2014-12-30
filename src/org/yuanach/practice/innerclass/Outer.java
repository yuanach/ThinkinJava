package org.yuanach.practice.innerclass;

/**
 * 		10.1-(1)
 *   @author yuanach
 *
 */
public class Outer {
	class Inner{
		private int innerfield=0xfefe;
		//Inner class
		public void mod(int j){
			i=j;  //可以无条件访问外部类成员
		}
	}
	Inner getInner(){
		System.out.println("Inner");
		return new Inner();
	}
	
	private int i=0;
	private void f(){}
	public void access(){
		Inner i=new Inner();
		i.mod(1);
		System.out.println(i.innerfield);
	}
	public static void main(String[] args){
		Outer out=new Outer();
		Outer.Inner i=out.getInner();
		out.access();
	}
}

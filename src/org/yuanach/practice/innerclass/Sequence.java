package org.yuanach.practice.innerclass;

interface Selector{
	boolean end();
	Object current();
	void next();
}

//10.2-2
class SomeObjects{
	String string="S";
	public SomeObjects(String s){
		this.string=s;
	}
	@Override
	public String toString(){
		return string;
	}
}
//:~

public class Sequence {
	private Object[] items;
	private int next=0;
	
	public Sequence(int size){
		items=new Object[size];
	}
	public void add(Object x){
		if(next < items.length){
			items[next++]=x;
		}
	}
	
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public boolean end() { return i==items.length; }
		@Override
		public Object current() {	 return items[i]; }
		@Override
		public void next() {
			if(i < items.length) i++;
		}
		
		//10.3-4
		@SuppressWarnings("unused")
		public Sequence getOuter(){
			return Sequence.this;
		}
		///:~
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
	
	//10.2-3
	private String string;
	public Sequence(String s){
		this.string=s;
	}
	class InnerClass{
		public String toString(){
			return string;
		}
	}
	public InnerClass innerClass(){
		return new InnerClass();
	}
	///:~
	
	public static void main(String[] args){
		Sequence s=new Sequence(10);
		for(int i=0;i<10;i++){
			s.add(new SomeObjects(Integer.toString(i)));
		}
		
		//10.2-3
		Sequence si=new Sequence("Inner class accesses outer class's field.");
		Sequence.InnerClass in=si.innerClass();
		System.out.println(in.toString());
		///
	}
	
}

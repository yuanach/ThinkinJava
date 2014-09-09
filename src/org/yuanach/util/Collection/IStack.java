package org.yuanach.util.Collection;

import java.util.LinkedList;

/*
 *  利用LinkedList实现Stack数据结构
 * 
 */
public class IStack<T> {
	private LinkedList<T> storage=new LinkedList<T>();
	public void push(T v){
		storage.addFirst(v);
	}
	public T peek(){
		return storage.getFirst();
	}
	public T pop(){
		return storage.removeFirst();
	}
	public boolean empty(){
		return storage.isEmpty();
	}
	public String toString(){
		return storage.toString();
	}
	
	public static void main(String[] args){
		IStack<String> stack=new IStack<String>();
		for(String s : "apple balana cake delicious".split(" ")){
			stack.push(s);
		}
		while(!stack.empty())
			System.out.print(stack.pop()+" ");	
	}
}

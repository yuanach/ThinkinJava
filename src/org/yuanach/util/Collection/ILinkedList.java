package org.yuanach.util.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ILinkedList {
	//LinkedList����չAbstractSequentialList��ִ��List�ӿ�
	
	// java.util.LinkedList extends java.util.AbstractSequentialList 
			//implements java.util.List, java.util.Deque, java.lang.Cloneable, java.io.Serializable
	
	/*
	 * 	Deque extends Queue
	 */
	private static int index=0;
	
	public static void main(String[] args) {
		
		Object obj=new Object();
		Iterator<Object> iterator;
		
		Collection<Object> collection=new LinkedList<Object>();
		
		LinkedList<Object> link=new LinkedList<Object>();
		link=new LinkedList<Object>(collection);
		
		//
		link.add(obj);				//β��
		link.add(index, obj);  //ָ��λ��
		link.addFirst(obj);
		obj=link.getFirst();
		link.removeFirst();
		link.removeFirstOccurrence(obj);
		
		//
		link.addLast(obj);
		obj=link.getLast();
		link.removeLast();
		link.removeLastOccurrence(obj);
		
		//
		iterator=link.descendingIterator();
		
		//
		link.element();
		
		
	}

}

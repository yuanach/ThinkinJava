package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IArrayList {
	//java.util.ArrayList extends java.util.AbstractList 
		//implements java.util.List, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable
	
	//ArrayList 继承AbstractList并执行List接口
	
	private static int capacity=0x10;
	private static int minCapacity=0x10;
	
	public static void main(String[] args) {
		
		Collection<Object> collection=new ArrayList<Object>();
		
		ArrayList<Object> alist=new ArrayList<Object>();
		
		List<Object> list=new ArrayList<Object>(); //构造一个空的ArrayList
		list=new ArrayList<Object>(collection);		  //用一个集合来构造ArrayList
		list=new ArrayList<Object>(capacity);			  //指定ArrayList的初始大小
		
		//implements from Cloneable
		alist.clone();
		
		//人工增加容量，避免后续增加容量时再分配，以改善性能
		alist.ensureCapacity(minCapacity);
		
		//当ArrayList容量增加时，会预留（额外增加）一部分空间
		//该方法用于释放这部分预留的空间，使其容量为实际占有的空间大小，以达到修整目的，节省空间消耗
		alist.trimToSize();
		
		//
		//alist.forEach(action);
		
		
	}

}

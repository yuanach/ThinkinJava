package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IArrayList {
	//java.util.ArrayList extends java.util.AbstractList 
		//implements java.util.List, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable
	
	//ArrayList �̳�AbstractList��ִ��List�ӿ�
	
	private static int capacity=0x10;
	private static int minCapacity=0x10;
	
	public static void main(String[] args) {
		
		Collection<Object> collection=new ArrayList<Object>();
		
		ArrayList<Object> alist=new ArrayList<Object>();
		
		List<Object> list=new ArrayList<Object>(); //����һ���յ�ArrayList
		list=new ArrayList<Object>(collection);		  //��һ������������ArrayList
		list=new ArrayList<Object>(capacity);			  //ָ��ArrayList�ĳ�ʼ��С
		
		//implements from Cloneable
		alist.clone();
		
		//�˹��������������������������ʱ�ٷ��䣬�Ը�������
		alist.ensureCapacity(minCapacity);
		
		//��ArrayList��������ʱ����Ԥ�����������ӣ�һ���ֿռ�
		//�÷��������ͷ��ⲿ��Ԥ���Ŀռ䣬ʹ������Ϊʵ��ռ�еĿռ��С���Դﵽ����Ŀ�ģ���ʡ�ռ�����
		alist.trimToSize();
		
		//
		//alist.forEach(action);
		
		
	}

}

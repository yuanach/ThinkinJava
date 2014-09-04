package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class MyList {

	public static void main(String[] args) {
		
		//List接口扩展了Collection并声明了存储一系列元素的类集的元素
		List<Object> list=new ArrayList<Object>();

		int index=0;
		Object obj=new Object();
		Collection<Object> cl=new ArrayList<Object>();
		List<Object> list2=new ArrayList<Object>();
		
		ListIterator<Object> listiterator;
		
		//在指定位置插入对象
		list.add(index, obj);		
		
		//在指定位置插入集合
		list.addAll(index, cl);		
		
		//返回指定下标的对象
		obj=list.get(index);
		
		//返回指定对象的下标
		index=list.indexOf(obj);
		
		//返回指定对象的最后一个实例的下标
		list.lastIndexOf(obj);
		
		//返回调用列表开始的迭代程序
		listiterator=list.listIterator();
		
		//返回调用列表在在指定地方开始的迭代程序
		list.listIterator(index);
		
		//移除指定位置的对象实例
		list.remove(index);
		
		//
		//list.replaceAll();
		
		//对指定下标处的位置进行赋值
		list.set(index, obj);
		
		//
		//list.sort(cmp);
		
		//返回一个子列表,start...end-1
		int start=0,end=2;
		list2=list.subList(start, end);
		
		
	}

}

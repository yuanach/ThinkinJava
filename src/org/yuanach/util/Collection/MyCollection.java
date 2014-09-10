package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {

	private static int hash=0x00;
	private static int cl_size;
	public static void main(String[] args) {
		
		Object obj=new Object(); obj.hashCode();
		Object[] objArray;
		Iterator<Object> it;
		
		//Collection是构造类集框架的基础，声明了所有类集都拥有的核心方法
		Collection<Object> cl=new ArrayList<Object>();
		
		//添加对象到容器
		cl.add(obj);	
		
		//添加一个集合到容器
		cl.addAll(cl);
		
		//清除容器中的所有对象
		cl.clear();
		
		//检查容器中是否保存有某对象
		cl.contains(obj);
		
		//检查容器中是否保存有一个集合
		cl.containsAll(cl);
		
		//返回该容器的hash调用码
		hash=cl.hashCode();
		
		//检测该容器是否为空
		cl.isEmpty();
		
		//返回该容器的迭代对象
		it=cl.iterator();
		
		//
		//cl.parallelStream();
		
		//从容器中移除指定对象
		cl.remove(obj);
		
		//从容器中移除指定集合
		cl.removeAll(cl);
		
		//cl.removeIf(arg0);
		
		cl.retainAll(cl);
		
		cl_size=cl.size();
		
		//cl.spliterator();
		
		//cl.stream();
		
		//返回该容器的数组化引用
		objArray=cl.toArray();
		
		//从容器中返回与指定数组相匹配的数组化引用
		objArray=cl.toArray(new Object[]{});
	}

}

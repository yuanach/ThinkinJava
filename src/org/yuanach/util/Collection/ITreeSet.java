package org.yuanach.util.Collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ITreeSet {

	/*
	 * 	TreeSet 使用数型结构来存储数据，数据按有序存储，查找速度很乐观
	 */
	
	/*
	 * TreeSet 
	 * 		extends AbstractSet 
	 * 		implements java.util.NavigableSet, java.lang.Cloneable, java.io.Serializable
	 */
	
	/*
	 * 	NavigableSet 
	 * 		extends java.util.SortedSet
	 */
	
	/*
	 * 	SortedSet 
	 * 		extends java.util.Set
	 */
	
	private static boolean inclusive=true;
	private static boolean fromInclusive=true;
	private static boolean toInclusive=true;
	private static Object fromElement=new Object();
	private static Object toElement=new Object();
	
	public static void main(String[] args) {

		//Comparator<?> comparator;
		Object obj=new Object();
		Iterator<Object> iterator;
		
		Collection<Object> collection=new TreeSet<Object>();
		SortedSet<Object> sorted=new TreeSet<Object>();
		NavigableSet<Object> navi;
		
		TreeSet<Object> treeset=new TreeSet<Object>();
		treeset=new TreeSet<Object>(collection);
		//treeset=new TreeSet<Object>(comparator);
		treeset=new TreeSet<Object>(sorted);
		
		obj=treeset.ceiling(new Object());
		
		//返回该Set中按降序迭代的迭代器
		iterator=treeset.descendingIterator(); 
		
		//返回Set中元素的逆序子集
		navi=treeset.descendingSet();
		
		//
		obj=treeset.first();
		
		//返回Set中小于等于给定元素的最大元素，若无则返回NULL
		obj=treeset.floor(new Object());
		
		//返回子集，该子集中的元素严格小于给定的元素
		sorted=treeset.headSet(obj);
		
		//返回子集，该子集中的元素，小于等于(如果inclusive为true)给定的元素
		navi=treeset.headSet(obj, inclusive);
		
		//返回此 Set 中严格大于给定元素的最小元素；如果不存在这样的元素，则返回 null。
		obj=treeset.higher(new Object());
		
		//返回此 Set 中严格小于给定元素的最大元素；如果不存在这样的元素，则返回 null。
		obj=treeset.lower(new Object());
		
		//移除第一个元素
		treeset.pollFirst();
		
		//移除最后一个元素
		treeset.pollLast();
		
		//返回此 set 的子集，其元素从 fromElement（包括）到 toElement（不包括）。
		sorted=treeset.subSet(fromElement, toElement);
		
		//返回此 set 的子集，其元素范围从 fromElement 到 toElement。
		sorted=treeset.subSet(fromElement, fromInclusive, toElement, toInclusive);
		
		//返回此 set 子集，其元素大于等于 fromElement。
		sorted=treeset.tailSet(fromElement);
		
		//返回此 set 的子集，其元素大于等于 (如果toInlusive为true)fromElement。
		navi=treeset.tailSet(fromElement, toInclusive);
	}

}

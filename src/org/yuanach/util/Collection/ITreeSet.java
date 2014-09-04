package org.yuanach.util.Collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ITreeSet {

	/*
	 * 	TreeSet ʹ�����ͽṹ���洢���ݣ����ݰ�����洢�������ٶȺ��ֹ�
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
		
		//���ظ�Set�а���������ĵ�����
		iterator=treeset.descendingIterator(); 
		
		//����Set��Ԫ�ص������Ӽ�
		navi=treeset.descendingSet();
		
		//
		obj=treeset.first();
		
		//����Set��С�ڵ��ڸ���Ԫ�ص����Ԫ�أ������򷵻�NULL
		obj=treeset.floor(new Object());
		
		//�����Ӽ������Ӽ��е�Ԫ���ϸ�С�ڸ�����Ԫ��
		sorted=treeset.headSet(obj);
		
		//�����Ӽ������Ӽ��е�Ԫ�أ�С�ڵ���(���inclusiveΪtrue)������Ԫ��
		navi=treeset.headSet(obj, inclusive);
		
		//���ش� Set ���ϸ���ڸ���Ԫ�ص���СԪ�أ����������������Ԫ�أ��򷵻� null��
		obj=treeset.higher(new Object());
		
		//���ش� Set ���ϸ�С�ڸ���Ԫ�ص����Ԫ�أ����������������Ԫ�أ��򷵻� null��
		obj=treeset.lower(new Object());
		
		//�Ƴ���һ��Ԫ��
		treeset.pollFirst();
		
		//�Ƴ����һ��Ԫ��
		treeset.pollLast();
		
		//���ش� set ���Ӽ�����Ԫ�ش� fromElement���������� toElement������������
		sorted=treeset.subSet(fromElement, toElement);
		
		//���ش� set ���Ӽ�����Ԫ�ط�Χ�� fromElement �� toElement��
		sorted=treeset.subSet(fromElement, fromInclusive, toElement, toInclusive);
		
		//���ش� set �Ӽ�����Ԫ�ش��ڵ��� fromElement��
		sorted=treeset.tailSet(fromElement);
		
		//���ش� set ���Ӽ�����Ԫ�ش��ڵ��� (���toInlusiveΪtrue)fromElement��
		navi=treeset.tailSet(fromElement, toInclusive);
	}

}

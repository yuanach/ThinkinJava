package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class MyList {

	public static void main(String[] args) {
		
		//List�ӿ���չ��Collection�������˴洢һϵ��Ԫ�ص��༯��Ԫ��
		List<Object> list=new ArrayList<Object>();

		int index=0;
		Object obj=new Object();
		Collection<Object> cl=new ArrayList<Object>();
		List<Object> list2=new ArrayList<Object>();
		
		ListIterator<Object> listiterator;
		
		//��ָ��λ�ò������
		list.add(index, obj);		
		
		//��ָ��λ�ò��뼯��
		list.addAll(index, cl);		
		
		//����ָ���±�Ķ���
		obj=list.get(index);
		
		//����ָ��������±�
		index=list.indexOf(obj);
		
		//����ָ����������һ��ʵ�����±�
		list.lastIndexOf(obj);
		
		//���ص����б�ʼ�ĵ�������
		listiterator=list.listIterator();
		
		//���ص����б�����ָ���ط���ʼ�ĵ�������
		list.listIterator(index);
		
		//�Ƴ�ָ��λ�õĶ���ʵ��
		list.remove(index);
		
		//
		//list.replaceAll();
		
		//��ָ���±괦��λ�ý��и�ֵ
		list.set(index, obj);
		
		//
		//list.sort(cmp);
		
		//����һ�����б�,start...end-1
		int start=0,end=2;
		list2=list.subList(start, end);
		
		
	}

}

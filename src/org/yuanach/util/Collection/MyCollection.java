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
		
		//Collection�ǹ����༯��ܵĻ����������������༯��ӵ�еĺ��ķ���
		Collection<Object> cl=new ArrayList<Object>();
		
		//��Ӷ�������
		cl.add(obj);	
		
		//���һ�����ϵ�����
		cl.addAll(cl);
		
		//��������е����ж���
		cl.clear();
		
		//����������Ƿ񱣴���ĳ����
		cl.contains(obj);
		
		//����������Ƿ񱣴���һ������
		cl.containsAll(cl);
		
		//���ظ�������hash������
		hash=cl.hashCode();
		
		//���������Ƿ�Ϊ��
		cl.isEmpty();
		
		//���ظ������ĵ�������
		it=cl.iterator();
		
		//
		//cl.parallelStream();
		
		//���������Ƴ�ָ������
		cl.remove(obj);
		
		//���������Ƴ�ָ������
		cl.removeAll(cl);
		
		//cl.removeIf(arg0);
		
		cl.retainAll(cl);
		
		cl_size=cl.size();
		
		//cl.spliterator();
		
		//cl.stream();
		
		//���ظ����������黯����
		objArray=cl.toArray();
		
		//�������з�����ָ��������ƥ������黯����
		objArray=cl.toArray(new Object[]{});
	}

}

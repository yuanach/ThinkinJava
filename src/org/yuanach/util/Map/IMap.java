package org.yuanach.util.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IMap {

	/*
	 * 	abstract interface Map ͨ����ֵ��ӳ��
	 * �ӽӿ�: SortedMAP
	 * �ڲ���: Map.Entry
	 * Map��: HashMap,TreeMap
	 * 	
	 */
	
	public static void main(String[] args) {
		
		Set<Object> set=new HashSet<Object>();
		Object key=new Object();
		Object value=new Object();
		Object defaultValue=new Object();
		
		Map<Object,Object> map=new HashMap<Object,Object>();

		map.clear();
		
		map.containsKey(key);
		
		map.containsValue(value);
				
		map.entrySet();
		
		map.get(key);
		
		//����ָ������Ӧ��ֵ��������ɹ��򷵻�Ĭ��ֵ
		//value=map.getOrDefault(key, defaultValue);
		
		//���ش�ӳ���а����ļ��� Set ��ͼ,�� set ��ӳ��֧�֣����Զ�ӳ��ĸ��Ŀ��ڴ� set �з�ӳ��������֮��Ȼ��
		set=map.keySet();
		
		map.put(key, value);
		
		map.putAll(new HashMap<>());
		
		//map.putIfAbsent(key, value);
		
		map.remove(key);
		//map.remove(key, value);
		
		//map.replace(key, defaultValue);
		//map.replace(arg0, arg1, arg2);
	}

}

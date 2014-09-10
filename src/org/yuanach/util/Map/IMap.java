package org.yuanach.util.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IMap {

	/*
	 * 	abstract interface Map 通过键值对映射
	 * 子接口: SortedMAP
	 * 内部类: Map.Entry
	 * Map类: HashMap,TreeMap
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
		
		//返回指定健对应的值，如果不成功则返回默认值
		//value=map.getOrDefault(key, defaultValue);
		
		//返回此映射中包含的键的 Set 视图,该 set 受映射支持，所以对映射的更改可在此 set 中反映出来，反之亦然。
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

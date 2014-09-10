package org.yuanach.util.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap采用拉链法实现
 */
public class IHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Karachio");
		map.put(2, "Yuanach");
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		
		//返回键的集合
		Set<Integer> keyset=map.keySet();
		//返回值的集合
		Collection<String> valueset=map.values();
		
		map.get(1);
	}

}

package org.yuanach.util.Map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap01 {

	public static void main(String[] args) {
		Map<String,Student> map=new HashMap<String,Student>();
		
		map.put("karachio",new Student("karachio", 99));
		
		Student s=map.get("karachio");
		
		//ɾ���������ã�����ָ��Ķ�����
		map.remove("karachio");
		
		System.out.println(s.getName());
	}

}

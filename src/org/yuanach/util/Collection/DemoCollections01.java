package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoCollections01 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}

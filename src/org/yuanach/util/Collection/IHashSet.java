package org.yuanach.util.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class IHashSet {
	
	/*	HashSet继承了AbstractSet并实现了Set接口,Set接口继承了Collection接口
	*	该类集使用Hash法进行存储
	*/
	
	/*	HashSet 
	*		extends AbstractSet 
	*		implements Set, java.lang.Cloneable, java.io.Serializable
	*/

	/* AbstractSet 
	*		extends AbstractCollection 
	*		implements Set
	*/
	
	/* AbstractCollection 
	*		implements Collection
	*/
	
	private static int capacity=0x10;
	private static float fillRatio=0.75f; //must be limited to (0.0,1.0)
	
	public static void main(String[] args) {
		
		Collection<Object> collection=new ArrayList<Object>();
		Set<Object> set;
			
		HashSet<Object> hashset=new HashSet<Object>();
		hashset=new HashSet<Object>(collection);
		hashset=new HashSet<Object>(capacity);					//容量
		hashset=new HashSet<Object>(capacity,fillRatio);		//容量和填充比,默认为0.75
		
		System.out.println(hashset);
		
	}

}

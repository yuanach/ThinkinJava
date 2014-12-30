package org.yuanach.practice.innerclass;

/**
 * 	在方法内或某作用域内创建内部类
 * @author yuanach
 *
 */
interface Contents{
	public void f();
}
public class Parcel6 {
	public Contents f(){
		class Content implements Contents{
			@Override
			public void f() {}
		}
		return new Content();
	}
	public Contents f2(boolean flag){
		if(flag){
			class Content implements Contents{
				@Override
				public void f() {}
			}
			return new Content();
		}
		return null;
	}
}

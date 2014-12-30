package org.yuanach.Abstract;

public abstract class Heroes {

	//抽象类不能被实例化，所拥有的实例只能通过子类赋予，所以抽象类的实例引用和其子类的实例引用的
	//地址是一样的，即使是非抽象函数的调用也只能通过子类实例的引用来完成
	protected Heroes(){
		System.out.println("I am a Hero!"+this.hashCode());
		
	}
	
	public abstract int attack(Object skill);
	
	public void realive(){
		System.out.println("The hero does realive."+"["+this.hashCode()+"]");
	}
	
}


class Karachio extends Heroes{
	
	public Karachio(){
		System.out.println("I am Karachio!"+this.hashCode());
	}
	
	@Override
	public int attack(Object skill){
		
		return skill.hashCode();
	}
}
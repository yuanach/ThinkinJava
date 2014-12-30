package org.yuanach.Abstract;

public interface HeroSkill {
	//常量，抽象方法
	
	//接口中的预默认为public final static
	String ORINGINAL_ATTACK = "";
	
	//默认为public, "only public & abstract are permitted"
	void terminalSkill();
}
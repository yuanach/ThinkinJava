package org.yuanach.practice.innerclass;


/**
 * 	在其他类中创建内部类实例
 * @author yuanach
 *
 */
public class NewInner {
	class Inner{	}
}

class CreateInnerClass{
	//OuterObject.new Inner()
	NewInner.Inner n=new NewInner().new Inner();
}

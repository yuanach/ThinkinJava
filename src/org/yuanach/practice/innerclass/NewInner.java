package org.yuanach.practice.innerclass;


/**
 * 	���������д����ڲ���ʵ��
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

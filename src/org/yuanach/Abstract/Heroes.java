package org.yuanach.Abstract;

public abstract class Heroes {

	//�����಻�ܱ�ʵ��������ӵ�е�ʵ��ֻ��ͨ�����ำ�裬���Գ������ʵ�����ú��������ʵ�����õ�
	//��ַ��һ���ģ���ʹ�Ƿǳ������ĵ���Ҳֻ��ͨ������ʵ�������������
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
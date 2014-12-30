package org.yuanach.util.Map;

import java.util.Comparator;
import java.util.TreeMap;


public class DemoTreeMap01 {
	public static void main(String[] args) {
		TreeMap<Student,String> map=new TreeMap<Student,String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return -(o1.getScore() - o2.getScore());
			}
		});
		
		map.put(new Student("karachio", 99),"");
		map.put(new Student("yuanach", 89),"");
		map.put(new Student("chenyuan", 79),"");

		for (Student s : map.keySet()) {
			System.out.print(s.getName() + " ");
		}
	}
	


}

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}
package org.yuanach.util.Collection;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {

		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore() - o2.getScore();
			}
		});

		System.out.println(set.hashCode());//Set框架的hashcode是set元素hashcode之和
		
		set.add(new Student("karachio", 99));
		set.add(new Student("yuanach", 89));
		set.add(new Student("chenyuan", 79));

		for (Student s : set) {
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

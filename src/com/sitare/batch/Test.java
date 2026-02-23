package com.sitare.batch;

import oops.Student;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(24034, "Trivedh", "CSE");
        System.out.println("Id: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Department: " + s1.getDept());
	}
}

package com.yujh.markerinterface;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"satya");
		if(s instanceof Regestarable)
		System.out.println("student registered");
		else
			System.out.println("student not registered");

	}
}


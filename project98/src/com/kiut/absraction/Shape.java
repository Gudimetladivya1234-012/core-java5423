package com.kiut.absraction;

public abstract class Shape {
	protected float area;
	//Abstract method
	abstract void calArea();
	void show() {//concrte method
		System.out.println("area of shape is "+area);	}
	

}

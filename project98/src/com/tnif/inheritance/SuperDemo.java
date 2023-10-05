package com.tnif.inheritance;

class parent{//base classar=100;
	int var=100;
}
public class SuperDemo extends parent {//child class
	int var=50;
	void disply() {
		System.out.println("the child value is"+var);
		System.out.println("the child value is"+super.var);

	}
	public static void main(String[] args) {
		SuperDemo ob=new SuperDemo();
		ob.disply();
	
	
	}

}



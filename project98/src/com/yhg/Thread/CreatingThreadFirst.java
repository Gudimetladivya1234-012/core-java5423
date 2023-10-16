package com.yhg.Thread;

public class CreatingThreadFirst extends Thread{
	public void run(){
	System.out.println("hello");
}

	public static void main(String[] args) {
		CreatingThreadFirst ob=new CreatingThreadFirst();
		ob.start();
		// TODO Auto-generated method stub

	}

}

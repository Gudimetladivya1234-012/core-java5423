package com.yhg.Thread;


public class ImplementThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ImplementThread ob=new ImplementThread();
			Thread t=new Thread(ob);
			t.start();
			
		
	}

}

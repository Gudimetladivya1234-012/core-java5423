package com.kijh.Ststicprogramtwo;

public class Myclass {
	
		private int section;//instance variable
		private static int srNo;//static variable
		static {
			System.out.println("------staticblock------");
			srNo=1000;
		}
		//default constructor
		Myclass(){
			System.out.println("------default consructor------");
			srNo++;
			section++;
		}
		//static method
		static void display() {
			//	System.out.println("section"+section);
			System.out.println("serialno"+srNo);
		}
		@Override
		public String toString() {
			return "Myclass [section=" + section + "]";
		}
		

	}



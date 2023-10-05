package com.tnjh.multilevel;
public class Collegestudent extends Student1 {
	private String group;
	private char grade;
	public Collegestudent() {
		super();
	}
	public Collegestudent(String group, char grade) {
		super();
		this.group = group;
		//this.grade = grade;
	}
	
	public Collegestudent(int id, String board) {
		super(id, board);
		// TODO Auto-generated constructor stub
	}
	public Collegestudent(String name, int population) {
		super(name, population);
		// TODO Auto-generated constructor stub
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	//@Override
	//public String toString() {
		//return "Collegestudent [group=" + group + ", grade=" + grade + ", getGroup()=" + getGroup() + ", getGrade()="
			//	+ getGrade() + ", getId()=" + getId() + ", getBoard()=" + getBoard() + ", toString()="
				//+ super.toString() + ", getName()=" + getName() + ", getPopulation()=" + getPopulation()
			//	+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	//}
	

}

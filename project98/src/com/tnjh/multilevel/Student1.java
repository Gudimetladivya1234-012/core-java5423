package com.tnjh.multilevel;

public class Student1 extends Citizen {
	private int id;
	private String board;
	public Student1() {
		super();
		}
	public Student1(int id, String board) {
		super();
		this.id = id;
		this.board = board;
	}
	
	public Student1(String name, int population) {
		super(name, population);
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	
}
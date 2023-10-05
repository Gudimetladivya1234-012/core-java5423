package com.tnjh.multilevel;

public class Citizen {
	private String name;
	private int population;
	
	public Citizen() {
		super();
	}
	
	public Citizen(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", population=" + population + "]";
	}

	
	
	}


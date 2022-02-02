package com.revature.TourOfHeroes.models;

public class Hero {

	private int id;
	
	private String alias;
	
	private String firstName;
	
	private String lastName;
	
	private String power1;
	
	private HeroTag herotype;
	
	//private String power2;
	
    //private String power3;

	public Hero(int id, String alias, String firstName, String lastName, String power1, HeroTag type) {
		super();
		this.id = id;
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lastName;
		this.power1 = power1;
		this.herotype = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPower1() {
		return power1;
	}

	public void setPower1(String power1) {
		this.power1 = power1;
	}

	public HeroTag getHeroType() {
		return herotype;
	}

	public void setHeroType(HeroTag herotype) {
		this.herotype = herotype;
	}
	
	
	
	
	
	
	
	
}

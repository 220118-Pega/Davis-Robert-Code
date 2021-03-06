package com.revature.stacklite.models;

/**
 * 
 * 
 * this is a class used to model coding issues
 * @author rjdav
 *
 */

public class Issues {
	
	// the class : the blue print, the template, the recipe
	//Members
	//the members: fields/attributes, methods, constructors
	
	//Fields
	//used to define the characteristics
	//used to define the dependencies
	
	private String title;   
	private String description;
	private int id;
	private List<Solution> solutions;
	
	//Constructors
	//special methods thats are used to intialize properties of a class
	//No Args Constructor
	
	
	// No args constructor
	public Issues() {
		
		this("No title", "No description", 0);
	//	super();
		
	}
	
	// Parameterized constructor AKA constructor with arguements
	public Issues(String title, String description) {
		
		// the this keyword pertains to the particular instances title and descriptions properties
		
		this.title = title; //the title attribute of the object I am constructing will have the value if the title parameter i am passing
		this.description = description;
		
	}
	
	
	
	public Issues (String title, String description, int id) {
		
		
		//calling an existing constructor of the same class
		this(title, description);
		this.id = id;
	}
	//having multiple constructors is a form of polymorphism, called method overloading
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public List<Solution> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	@Override
	public String toString() {
		return "Issues [title=" + title + ", description=" + description + ", id=" + id + "]";
	}

	
}

package co.grandcircus;

import java.util.ArrayList;

// Task class will 
public class Task {
	
	// List of instance variables
	public String name;
	public String description;
	public String dueDate;
	public boolean complete = false;
	
	// Constructor
	public Task(String name, String description, String dueDate) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		complete = false;
	}
	
	// setters are usually void methods and allow us to set private instance
	//  variable data
	// in main() in other file - Task abc = new Task(String a, "This is funny", 05/02/2019);
	//  abc is the local variable ArrayList set up in the main app
	// set up ArrayList in main()

	// Setter for Name
	public void setName(String name) {
		this.name = name;
	}
	
	// getters usually return the same type as the associated instance variable

	// Getter for Name
	public String getName() {
		return name;
	}
	
	// Setter for Description
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Getter for Description
	public String getDescription() {
		return description;
	}
	
	// Setter for dueDate
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
		
	// Getter for Description
	public String getDescription() {
		return description;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Method to list tasks
	public static mainTaskList<>() (int a) {
		
		// ArrayList of tasks
		// Includes name, description, due date, completion
		ArrayList<String> mainTaskList = new ArrayList<>();
		
		mainTaskList.add();
		
		return 0;
	}

}

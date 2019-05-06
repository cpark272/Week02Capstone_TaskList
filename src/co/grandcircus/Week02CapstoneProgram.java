package co.grandcircus;

import java.util.Scanner;

public class Week02CapstoneProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		
		// Title of program
		System.out.println("Welcome to the Task Manager!");
		
		while (userInput != 5) {
			// List of menu options of Task Manager
			System.out.println("\n   1. List tasks");
			System.out.println("   2. Add task");
			System.out.println("   3. Delete task");
			System.out.println("   4. Mark task complete");
			System.out.println("   5. Quit");
			
			System.out.print("\nWhat would you like to do? ");
			userInput = scan.nextInt();
			
			if (userInput == 1) {
//				System.out.println(listTasks);
			} else if (userInput == 2) {
				//System.out.println(addTask("Chan", "Update links", "01/15/2019", "false"));
			} else if (userInput == 3) {
//				System.out.println(deleteTask);
			} else if (userInput == 4) {
//				System.out.println(markTaskComplete);
			} else if (userInput == 5) {
				break;
			} else {
				System.out.println("\nWrong input. Please enter a number.");
			}
			
		}
		
		System.out.println("\n\n\n\n\nHave a great day!");

	}
	
}
	
	// Method to list tasks
//	public static int {
//		
//		return listTasks;
//	}
	
	// Method to add a task
//	public static String addTask(String name, String description, String date, String complete) {
//		
//		return "\n\n\n\n\nTask entered!";
//	}

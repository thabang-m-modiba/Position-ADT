/**
 * @author Thabang Mamoloko
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class TaskManager {
	/**
	 * The main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		
		while(running) {
			List<Task> arrList = new ArrayList<>();
			
			System.out.println("1. Add Student Task.");
		    System.out.println("2. Display Student Task");
		    System.out.println("3. Exit");
		    System.out.println("Enter: ");
		    
		    int userInput = scanner.nextInt();
		    
		    switch(userInput) {
		    case 1:
		    	System.out.print("Enter Task ID: ");
		    	int taskID = scanner.nextInt();
		    	
		    	System.out.print("Enter task Name: ");
		    	String taskName = scanner.next();
		    	
		    	System.out.print("Enter task priority: ");
		    	int taskPriority = scanner.nextInt();
		    	
		    	System.out.print("Enter task status: ");
		    	String status = scanner.next();
		    	
		    	Task newTask = new Task(taskID, taskName, taskPriority, status);
		    	arrList.add(newTask);
		    	
		    	try {
					ObjectOutputStream obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data/binary.dat")));
					obj.writeObject(arrList);
					obj.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Error 1: " + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("Error 2: " + e.getMessage());
				}
		    	break;
		    case 2:
		    	try {
					ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data/binary.dat")));
					
					while(true) {
						Object task = objIn.readObject();
						System.out.println(task.toString() + " ");
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Error 1: " + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("Error 2: " + e.getMessage());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Error 3: " + e.getMessage());
				}
		    	break;
		    case 3:
		    	running = false;
		    	System.out.println("Exiting...");
		    	break;
		    default:
		    	System.out.println("Please enter valid input!");
		    }
		}
		
		scanner.close();
		
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Enter Student Tasks.");
		System.out.println("2. Display Student info.");
		System.out.println("3. Exit.");
		
		int userSelection = scanner.nextInt(); // To be handled
		switch(userSelection) {
		case 1:
			System.out.print("Enter Task ID: ");
			int taskID = scanner.nextInt();
			
			System.out.print("Enter Task Name: ");
			String taskName = scanner.next();
			
			System.out.print("Enter Task Priority (1 - 5): "); // To be handle
			int priority = scanner.nextInt();
			
			System.out.println("Enter Status(Pending/ Completed): "); // To be handled
			String status = scanner.next();
			
			Task newTask = new Task(taskID, taskName, priority, status);
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data/binary.dat")));
				oos.writeObject(newTask);
				oos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("Error: " + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Error:  " + e.getMessage());
			}
			System.out.println("Task Updated Successfully");
			break;
			
		case 2:
			try {
				ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data/binary.dat")));
				Task task = (Task) ois.readObject();
				PositionalList<Task> list = new PositionalList<>();
				Position<Task> p1 = list.addFirst(task);
			    list.printList();
				ois.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("Error: " + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Error: " + e.getMessage());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("Error: " + e.getMessage());
			}
		
		case 3:
			System.out.println("Exiting...");
			break;
		default:
			System.err.println("Invalid input!");
		}
		System.out.print("Enter menu: ");*/
	}
}

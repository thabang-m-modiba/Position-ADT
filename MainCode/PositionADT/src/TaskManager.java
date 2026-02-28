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
	 * @throws PriorityOutOfRange 
	 */
	public static void main(String[] args) throws PriorityOutOfRange, IllegalStatusException {
		
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
		    	if(taskPriority < 0 || taskPriority > 6) {
		    		throw new PriorityOutOfRange("Priority Out of Range");
		    	}
		    	
		    	System.out.print("Enter task status (Pending/ Completed): ");
		    	String status = scanner.next();
		    	if(status != "pending" || status != "Pending" || status != "completed" || status != "Completed") {
		    		throw new IllegalStatusException("Invalid Status");
		    	}
		    	
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
		
		// TO-DO List
		/**
		 * 1. Fix adding list
		 * 2. Add option to clear the binary file
		 */
		
		scanner.close();
	}
}

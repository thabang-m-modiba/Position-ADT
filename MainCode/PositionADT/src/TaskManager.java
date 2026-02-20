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
		System.out.print("Enter menu: ");
	}
}

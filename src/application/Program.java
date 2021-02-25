package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***************************************************************");
		
		System.out.println("Enter department's name:");
		String department = sc.next();
		
		System.out.println("***************************************************************");
		System.out.println("--Enter worker data--");
		
		System.out.println("Name:");
		String name = sc.next();
		
		System.out.println("Level:");
		String level = sc.next();
		
		System.out.println("Base Salary:");
		Double baseSalary = sc.nextDouble();
		
		System.out.println("***************************************************************");
		System.out.println("How many contracts to this worker:");
		int contracts = sc.nextInt();
		
		
		for(int i = 0; i < contracts; i++) {
			System.out.println("***************************************************************");
			System.out.println("Enter contract #"+ (i+1) + " data:");
			System.out.println("Value per hour:");
			System.out.println("Duration (hours):");
			
		}
	}
}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		sc.useLocale(Locale.ENGLISH);
		
		SimpleDateFormat formatoMesAno = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("***************************************************************");

		System.out.print("Enter department's name:");
		String department = sc.next();

		System.out.println("***************************************************************");
		System.out.println("--Enter worker data--");

		System.out.print("Name:");
		String name = sc.next();

		System.out.print("Level:");
		String level = sc.next();

		System.out.print("Base Salary:");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

		System.out.println("***************************************************************");
		System.out.print("How many contracts to this worker:");
		int contracts = sc.nextInt();

		for (int i = 0; i < contracts; i++) {
			System.out.println("***************************************************************");

			System.out.print("Enter contract #" + (i + 1) + " data:");
			String dataContract = sc.next();

			System.out.print("Value per hour:");
			double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours):");
			int hours = sc.nextInt();

			Date dataFormatada = formatoMesAno.parse(dataContract);

			worker.addContract(new HourContract(dataFormatada, valuePerHour, hours));

		}

		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int monthCalculate2 = Integer.parseInt(monthAndYear.substring(0, 2));
		int yearCalculate = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println(worker.getName());
		System.out.println(worker.getDepartment().getName());
		System.out.println(worker.income(yearCalculate, monthCalculate2));
		
		sc.close();

	}
}

package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import entities.Worker;
import entities.HourContract;
import entities.Department;
import entities.enums.WorkerLevel;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i < n + 1; i++) {
			System.out.println("Enter contract #"  + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			sc.nextLine();
		}

		System.out.print("Enter month and year to calculate income (MM/YYYY):  ");
		YearMonth date = YearMonth.parse(sc.nextLine(), fmt1);
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for  " + date.format(fmt1) + String.format("%.2f: ", worker.income(date.getYear(), date.getMonthValue())));

		sc.close();
	}
}
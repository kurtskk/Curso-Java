package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.printf("NAME: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
			System.out.println();
			// employees.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Boolean found = false;
		for (Employee ep : employees) {
			if (id == ep.getId()) {
				System.out.print("Enter the percentage: ");
				Double amount = sc.nextDouble();
				ep.salaryIncrease(amount);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("This id does not exist!");
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee ep : employees) {
			System.out.println(ep.toString());
		}
	}
}
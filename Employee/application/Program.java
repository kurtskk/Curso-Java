package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee._name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee._GrossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		employee._tax = sc.nextDouble();

		System.out.println(employee.toString());
		System.out.print("Which precentage to incrase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.print("Update data: " + employee.toString());
	}
}
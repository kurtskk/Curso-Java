package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.print("NAME: ");
		student._name = sc.nextLine();
		System.out.print("GRADE 1: ");
		student._grade1 = sc.nextDouble();
		System.out.print("GRADE 2: ");
		student._grade2 = sc.nextDouble();
		System.out.print("GRADE 3: ");
		student._grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());

		if (student.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}

		sc.close();
	}
}
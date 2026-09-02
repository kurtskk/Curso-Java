package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %d pessoa: %n", i + 1);
			System.out.print("NAME: ");
			String name = sc.nextLine();
			System.out.print("IDADE: ");
			int age = sc.nextInt();
			System.out.print("ALTURA: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);
		}

		double sum = 0.0;
		double  under16 = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				under16 += 1;
			}
		}
		double avgHeight = sum / vect.length;

		System.out.printf("Altura media: %.2f%n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", (under16 * 100) / vect.length);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("RENT #%d%n", i + 1);
			System.out.print("NAME: ");
			String name = sc.nextLine();
			System.out.print("EMAIL: ");
			String email = sc.nextLine();
			System.out.print("ROOM: ");
			int numberRoom = sc.nextInt();
			vect[numberRoom] = new Rent(name, email);
			System.out.println();
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s %n", i, vect[i].getName(), vect[i].getEmail());
			}
		}

		sc.close();
	}
}
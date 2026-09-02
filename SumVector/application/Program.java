package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("type a number: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("VALUES");
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
				System.out.print(" " + vect[i]);
				sum += vect[i];
		}
		double avg = sum / vect.length;

		System.out.println();
		System.out.println("SUM = " + sum);
		System.out.printf("AVERAGE = %.2f", avg);

		sc.close();
	}
}
package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Triangule;


public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangule x, y;
		x = new Triangule();
		y = new Triangule();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.areaDoTriangulo();
		double areaY = y.areaDoTriangulo();
		System.out.printf("Triangule X area: %.2f%\n", areaX);
		System.out.printf("Triangule Y area: %.2f%\n", areaY);

		if (areaX > areaY)
			System.out.println("Large area X");
		else
			System.out.println("Large area Y")
		sc.close();
	}
}
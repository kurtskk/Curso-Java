package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and heigth: ");
		rectangle._width = sc.nextDouble();
		rectangle._height = sc.nextDouble();
		System.out.println(rectangle);
		sc.close();
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product._name = sc.nextLine();
		System.out.print("Price: ");
		product._price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product._quantity = sc.nextInt();

		System.out.println(product);
		System.out.print("Enter of Produts to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println("Update data: " + product);
		System.out.print("Enter of Produts to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.println("Update data: " + product);
		sc.close();
	}
}

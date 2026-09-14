package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import entities.Order;
import entities.enums.OrderStatus;
import entities.Client;
import entities.OrderItem;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import entities.enums.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime date = LocalDateTime.now();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();

		Order order = new Order(date, OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data: \n", i + 1);
			System.out.print("Product name: ");
			String name1 = sc.nextLine();
			System.out.print("Product price: ");
			Double price2 = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem orderProduct = new OrderItem(quantity, price2, new Product(name1, price2));
			order.addItem(orderProduct);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order.toString());
		sc.close();

	}
}
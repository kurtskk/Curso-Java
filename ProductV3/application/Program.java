package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import entities.ProductV3;
import entities.ImportedProduct;
import entities.UsedProduct;

public class Program {

    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<ProductV3> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int p = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= p; i++) {
            System.out.print("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            ProductV3 product;
            sc.nextLine();
            if (choice == 'i') {
                System.out.print("customs fee: ");
                Double tax = sc.nextDouble();
                product = new ImportedProduct(name, price, tax);
                sc.nextLine();
            } else if (choice == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate  date = LocalDate.parse(sc.nextLine(), fmt);
                product = new UsedProduct(name, price, date);
            } else {
                product = new ProductV3(name, price);
            }
            products.add(product);

        }

        System.out.println("\nPRICE TAGS:");
        for (ProductV3 product : products) {
            System.out.println(product.priceTag());
}
    }
}

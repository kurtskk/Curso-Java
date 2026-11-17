package application;

import entities.OutSourcedEmployee;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static  void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            String outSourced = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            Employee employee;
            if ("y".equalsIgnoreCase(outSourced)) {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employee = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
            }
            else {
                employee = new Employee(name, hours, valuePerHour);
            }
            employees.add(employee);

        }

        System.out.println();
        System.out.println("Payments:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
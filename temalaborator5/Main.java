package temalaborator5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceti numarul de angajati: ");
            int n = scanner.nextInt();

            ArrayList<Employee> employees = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Introduceti datele pentru angajatul #" + (i + 1));
                System.out.print("Nume: ");
                String name = scanner.next();

                System.out.print("Email: ");
                String email = scanner.next();

                System.out.print("Tarif pe ora: ");
                double hourRate = scanner.nextDouble();

                System.out.print("Capacitate (ore pe zi): ");
                int capacity = scanner.nextInt();

                System.out.print("Zile libere: ");
                int freeDays = scanner.nextInt();


                Employee employee = new Employee(name, email, hourRate, capacity, freeDays);


                employees.add(employee);
            }


            System.out.println("\nSalarii lunare:");
            for (Employee employee : employees) {
                System.out.println(employee.calculateMonthlyIncome());
            }
        }
    }



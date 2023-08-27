package Applications;

import Entities.Worker;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Worker worker1 = new Worker();

        System.out.print("Enter worker name: ");
        worker1.name = sc.nextLine();

        System.out.print("Enter worker age: ");
        worker1.age = sc.nextInt();

        System.out.print("Enter worker salary(Without taxes): $");
        worker1.salary = sc.nextDouble();

        System.out.print("Enter worker taxes(in percentage): ");
        worker1.taxes = sc.nextDouble();

        System.out.print("Worker salary increase(in percentage): ");
        worker1.salaryIncrease = sc.nextDouble();

        System.out.printf("Worker salary: $%.2f\n", worker1.getSalary());
        System.out.printf("Worker taxes will be: $%.2f\n", worker1.showTaxes());

        sc.close();
    }

}

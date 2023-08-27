package Applications;

import Entities.Rectangle;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle ret1 = new Rectangle();

        System.out.print("Enter rectangle width: ");
        ret1.width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        ret1.height = sc.nextDouble();

        System.out.printf("Area: %.2f\n",ret1.Area());
        System.out.printf("Perimeter: %.2f\n",ret1.Perimeter());

        sc.close();

    }
}

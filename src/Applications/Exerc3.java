package Applications;

import Entities.Grades;

import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grades student1 = new Grades();

        System.out.print("Enter student name: ");
        student1.name = sc.nextLine();

        System.out.print("Enter student first trimester grade: ");
        student1.FirstTrim = sc.nextDouble();

        System.out.print("Enter student second trimester grade: ");
        student1.SecondTrim = sc.nextDouble();

        System.out.print("Enter student third trimester grade: ");
        student1.ThirdTrim = sc.nextDouble();

        System.out.printf("Student situation: %s\n",student1.passed());
        System.out.printf("Final grade: %.2f\n",student1.getFinalGrade());

        sc.close();
    }

}

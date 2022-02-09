package day4;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Polynomial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = in.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = in.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = in.nextDouble();
        double d = b * b - 4.0 * a * c;
        double sqrtvalue = sqrt(abs(d));
        if (d> 0.0)
        {
            double x1 = (-b + sqrtvalue) / (2.0 * a);
            double x2 = (-b - sqrtvalue) / (2.0 * a);
            System.out.println("The roots are real and different " + x1 + " and " + x2);
        }
        else if (d == 0.0)
        {
            double x = -b / (2.0 * a);
            System.out.println("The roots are real and same : " + x);
        }
        else
        {
            System.out.println("The roots of the equation are complex and different.");
            System.out.println(-b / (2 * a) + " + i"+ sqrtvalue + "\n"+ -b / (2 * a)+ " - i" + sqrtvalue);
        }
    }
}

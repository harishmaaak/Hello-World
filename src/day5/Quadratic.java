package day5;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = scan.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = scan.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = scan.nextDouble();
        double d = b * b - 4 * a * c;
        double sqroot = sqrt(abs(d));
        if(d>0){
            double x1 = (-b + sqroot)/(2 * a);
            double x2 = (-b - sqroot)/(2 * a);
            System.out.println("The roots are real and different "+ x1 +"and" + x2);
        }else if(d == 0)
        {
            double  x = -b / (2 * a);
            System.out.println("The roots are real and same : "+ x);
        }else
        {
            System.out.println("The roots are complex and different :");
            System.out.println((-b / (2*a)) + "+i" + sqroot +"\n"+ (-b /(2*a)) + "-i" + sqroot);
        }

    }
}

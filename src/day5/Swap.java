package day5;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of X : ");
        int x = in.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = in.nextInt();
        x += y;
        y = x - y;
        x -= y;
        System.out.print("Swapped numbers X is : " + x + "\n" + "Swapped numbers Y is : " + y);
    }
}

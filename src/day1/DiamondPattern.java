package day1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        System.out.println("Enter the Max Width of the Diamond pattern : ");

        Scanner in = new Scanner(System.in);
        int maxWidth = in.nextInt();
        boolean grow = true;


        for (int i = 1; i > 0 /*space < maxWidth*/; ) {
            int printableStars = i;
            int space = maxWidth - printableStars;
            for (int j = 1; j <= maxWidth; j++) {
                if (j <= space) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            if (grow == true) {
                i++;
                if (i == maxWidth) {
                    grow = false;
                }
            } else {
                i--;
            }

            System.out.println();
        }
    }
}

package day1;

import java.util.Scanner;

public class ReversedDiamond {
    public static void main(String[] args) {
        System.out.println("How many rows  do you want : ");

        Scanner in = new Scanner(System.in);
        int maxWidth = in.nextInt();
        boolean grow = false;

        for (int i = maxWidth; i <= maxWidth ; ) {

           int  printableStars = i;
            int space = maxWidth - printableStars;

            for (int j = 1; j <= maxWidth; j++) {
                if (j <= space) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            if (grow) {
                i++;
            } else {
                i--;
                if(i==1){
                    grow=true;
                }
            }

            System.out.println();
        }
    }
}

package day3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }else
        {
            System.out.println("number is odd");
        }

    }
}

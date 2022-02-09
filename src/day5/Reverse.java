package day5;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value : ");
        long n = sc.nextLong();
        long rev =0;
        long rem;
        while(n!=0){
            rem = n%10;
            rev = rev * 10 +rem;
            n=n/10;
        }
        System.out.print("Reverse of the given number : " +rev);
    }
}

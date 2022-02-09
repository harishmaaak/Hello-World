package day3;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(((a<b)&(a<c))?a:c);
       System.out.println((a<b)|(a<c));
       System.out.println(a^b);
       System.out.println(~b);
       System.out.println(a<<2);
       System.out.println(a>>2);
       System.out.println(a>>>2);
    }
}

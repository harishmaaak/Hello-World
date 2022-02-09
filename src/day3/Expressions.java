package day3;

public class Expressions {
    public static void main(String[] args){
        int a = 4;
        int b = 2;
        int x;
        System.out.println(++a-b--);
        System.out.println( a%b++);
        System.out.println( a*=b+5);
        System.out.println( x=69>>>2);
    }
}

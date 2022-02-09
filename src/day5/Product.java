package day5;

public class Product {
    public static void main(String[] args){
        int x= 6;
        x = x++ * 2 + 3 * --x;
        System.out.println(x);
    }
}

package day4;

public class PowerOfNumber {
    public static void main(String[] args){
        int base =5;
        int exponent = 8;
        long result =1;
        for(;exponent!=0;exponent--){
            result*=base;
        }
        System.out.print(result);
    }
}

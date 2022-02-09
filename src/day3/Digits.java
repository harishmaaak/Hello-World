package day3;

public class Digits {
    public static void main(String[] args){
        long num = 2657634223L;
        int count =0;
        for(; num!=0 ; count++){
            num/=10;
        }
        System.out.print("Number of digits = "+ count);
    }
}

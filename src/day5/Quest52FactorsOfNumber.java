package day5;

public class Quest52FactorsOfNumber {
    public static void main(String[] args){
        int num = 50;
        System.out.println("The factorial number of the given number is :");
        for(int i = 1; i<=num ; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}

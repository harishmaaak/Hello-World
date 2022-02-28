package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Division input = new Division();
        input.divide();
    }
    public  void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        try{
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int result = n1 / n2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("check whether the given input is zero");
            divide();
        }catch(InputMismatchException i){
            System.out.println("Check the given input");
            divide();
        }

    }
}

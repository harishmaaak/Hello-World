package day5;

import java.util.Scanner;

public class Ques51ArmstrongBtNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            int temp,r,sum =0;
            temp = i;
            while(temp>0){
                r = temp%10;
                temp = temp/10;
                sum = sum+ r*r*r;
            }
            if(sum ==i){
                System.out.println(i + " is an Armstrong number.");
            }
        }

    }
}

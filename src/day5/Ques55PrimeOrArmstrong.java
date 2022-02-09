package day5;

public class Ques55PrimeOrArmstrong {
    public static int checkPrime(int num){
        int i=2;
         int prime = 1;
        while(i<num) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
            i++;
        }
        if (num == 1) {
            prime = 0;
        }
        return prime;
    }

    public static int checkArmstrong(int num){
        //int n = num;
        int sum = 0;
        int temp = num;
        int r;
        while(temp>0){
            r = temp%10;
            temp = temp/10;
            sum = sum+ r*r*r;
        }
        if(sum == num){
            return 0;
        }else
        {
            return 1;
        }
    }
    public static void main(String[] args){
      int num = 100;
      if(checkArmstrong(num) == 0){
          System.out.println("Given number is Armstrong number.");
      }else
      {
          System.out.println("Given number is not Armstrong number.");
      }
      if(checkPrime(num) == 0){
          System.out.println("Given number is prime number.");
      }else
      {
          System.out.println("Given number is not prime number.");
      }
    }
}

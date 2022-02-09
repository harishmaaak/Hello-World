package day5;

public class PrimeNumber {
    public static void main(String[] args){
        int num =17,i=2;
        boolean prime = true;
        while(i<num) {
            if (num % i == 0) {
                System.out.print("not prime number");
                prime = false;
                break;
            }
            i++;
            }
            if (prime == true) {
                System.out.print("prime number");
            }

        }
    }


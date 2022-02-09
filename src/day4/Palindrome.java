package day4;

public class Palindrome {
    public static void main(String[] args){
        int rev = 0;
        int rem,temp;
        int n = 63736;
        temp = n;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n= n/10;
        }
        if(temp == rev){
            System.out.print("Given no is palindrome.");
        }else
        {
            System.out.print("Given no is not palindrome.");
        }
    }
}

package day5;

public class Ques58FactorialUsingRecursive {
    public static long factorial(long num){
        if (num == 0){
            return 1;
        }else
        {
            return num * factorial(num -1);
        }
    }
    public static void main(String[] args){
       System.out.println(factorial(5));
    }
}

package day5;

public class Ques59GcdUsingRecursion {
    public static int gcdRecursive(int n1,int n2){
        int min =(n1<n2)?n1:n2;
        int gcd = 0;
        for(int i=1;i<=min;i++){
            if((n1%i == 0)&&(n2%i ==0)){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        System.out.println(gcdRecursive(50,60));
    }
}

package day4;

public class Lcm {
    public static void main(String[] args){
        int n1=50;
        int n2=60;
        int min = (n1<n2)?n1:n2;
        int gcd = 0;
        for(int i = 1;i<=min;i++){
            if ((n1%i==0)&&(n2%i==0)){
                gcd = i;
            }
        }
        int lcm= (n1 *n2)/gcd;
        System.out.print("lcm = "+lcm);
    }
}

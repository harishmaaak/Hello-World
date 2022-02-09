package day3;

public class Gcd {
    public static void main(String[] args){
        int no1 = 50;
        int no2 = 60;
        int min =(no1<no2)?no1:no2;
        int gcd = 0;
        for(int i=1;i<=min;i++){
            if((no1%i == 0)&&(no2%i ==0)){
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
}

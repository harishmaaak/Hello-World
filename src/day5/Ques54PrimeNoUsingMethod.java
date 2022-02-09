package day5;

public class Ques54PrimeNoUsingMethod {
    public static boolean primeNumber(int num){
        boolean flag = true;
        for(int i = 2;i<= num/2; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args){
        int low = 40 , high = 60;
        while(low<high){
            if(primeNumber(low)){
                System.out.print(low +" ");
            }
            low++;
        }

    }

}

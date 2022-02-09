package day4;

public class Armstrong {
    public static void main(String[] args){
        int num = 371;
        int sum = 0;
        int temp = num;
        int r;
        while(temp>0){
            r = temp%10;
            temp = temp/10;
            sum = sum+ r*r*r;
        }
        if(sum == num){
            System.out.print(" an Armstrong number");
        }else
        {
            System.out.print(" not an Armstrong number");
        }
    }
}

package day5;

public class Ternary {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int c = 5;
        int d = ((a>b)&&(a>c))?a:((b>a)&&(b>c))?b:c;
        System.out.println(d);
    }
}

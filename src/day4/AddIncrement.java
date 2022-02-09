package day4;

public class AddIncrement {
    public static void main(String[] args){
        int x = 5;
        int x1 = ++x - x++ + --x;
        System.out.println(x1);

    }
}

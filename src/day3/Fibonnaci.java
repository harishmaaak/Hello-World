package day3;

public class Fibonnaci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 10; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }

    }
}

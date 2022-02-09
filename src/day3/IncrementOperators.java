package day3;

public class IncrementOperators {
    public int postIncrement(int x){
        System.out.println("post increment values:");
        for(int i=1; i<x; i++){
          System.out.println(i);
        }
        return x;
    }
    public int preIncrement(int x){
        System.out.println("pre increment values:");
        for(int i=1;i<x;++i){
            System.out.println(i);
        }
        return x;
    }
    public static void main(String[] args){
        IncrementOperators in = new IncrementOperators();
        int num = in.postIncrement(3);
        int value =in.preIncrement(5);


    }
}

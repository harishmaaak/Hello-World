package day4;

public class Alphabet {
    public static void main(String[] args){
        char ch = '%';
        if((ch >= 'a' & ch <='z') | (ch >= 'A' & ch <='Z')){
            System.out.println("The given character is an alphabet.");
        }else
        {
            System.out.println("The given character is not an alphabet.");
        }
    }
}

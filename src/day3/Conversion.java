package day3;

public class Conversion {
    public static void main(String[] args){
        double kmph = 150;
        double miles = 0.6214;
        float celsius = 23;
        float farenheit = ((celsius*9)/5+32);
        double squareFt = 50000;
        double acre = squareFt/43560;
        System.out.println("kmph to miles :"+(miles*kmph));
        System.out.println("celsius to farenheit :"+ farenheit);
        System.out.println("squareFt to acre :"+acre);


    }
}

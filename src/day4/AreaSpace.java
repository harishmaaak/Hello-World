package day4;

public class AreaSpace {
    public double calcArea(int x,int y){
        double pi = 3.14;
        double areaX = pi*x*x;
        double areaY = pi*y*y;
        return areaX - areaY;

    }
    public static void main(String[] args){
        AreaSpace ar = new AreaSpace();
        double space = ar.calcArea(6,4);
        System.out.println("Area of the space between the two concentric circle = "+space);

    }
}

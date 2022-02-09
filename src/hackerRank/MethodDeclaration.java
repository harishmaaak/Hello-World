package hackerRank;

public class MethodDeclaration {
    public int sum(int a, int b) {
         int c = a+b;
//        int c = a + b;
        return c;
    }

    public static void main(String[] args){
     MethodDeclaration sc =new MethodDeclaration();
     int num = sc.sum(5,10);
     System.out.println(num);
    }
}

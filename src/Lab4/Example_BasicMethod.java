package Lab4;


public class Example_BasicMethod {

    public static void B (int num){
        //Statement
        System.out.println("Haiio B. "+num);

    }//B
    public static int C (int x,int y){
        //Statement
        System.out.println("Haiio C.");
        int sum = x + y;
        return sum;

    }//C



    public static void main (String[]args){
        System.out.println("Haiio Main.");
        //class A()
        A();
        A();
        A();
        B(100);
        int sum = C(100 ,200);
        System.out.println(sum);
        System.out.println(C(500 ,600));


    }//main

    public static void A () {
        //Statement
        System.out.println("Hello A.");
        B(500);
    }//A


}//class

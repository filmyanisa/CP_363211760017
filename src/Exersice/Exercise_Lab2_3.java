package Exersice;

import java.util.Scanner;

public class Exercise_Lab2_3 {
    //global variable
    public static final double PT = 3.141 ;

    private static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of circle :");
        double r = scanner.nextInt();

        double area = (4/3) * PT * r * r * r;
        System.out.println("The area of circle is : "+ area );
    }
}

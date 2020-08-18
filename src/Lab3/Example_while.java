package Lab3;
// รับค่าจำนวนเต็มจากผู้ใช้ เมื่อผู้ใช้ใส่ค่า 0 ให้จบการทำงาน (while)

import java.util.Scanner;

public class Example_while {

    public static void main (System [] args){

        Scanner sc = new Scanner(System.in);

        int num = 1;
         while (num !=0){
             System.out.println("Enter integer");
             num = sc.nextInt();
         }
         System.out.println("End. Good Bye");


    }//main
}//class

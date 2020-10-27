package Lab8;

import java.io.*;

public class ExFinally {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        BufferedReader reader = null;



        try {
            reader = new BufferedReader(new FileReader(myFile));
            String txt = null;

            while ((txt = reader.readLine()) != null){
                //display
                System.out.println(txt);

            }//while


        } catch (FileNotFoundException e) {
            System.out.println("File could not found.");
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            //connect DB
            // close connection
            System.out.println("Test Finally.");
        }


    }//main
}//class

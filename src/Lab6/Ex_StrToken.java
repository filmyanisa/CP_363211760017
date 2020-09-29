package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {

    public static void main (String [] args) {

        String msg = " It so happened that a Fox caught its tail in a trap, and in struggling to release himself lost all of it but the stump. At first he was ashamed to show himself among his fellow foxes. But at last he determined to put a bolder face upon his misfortune, and summoned all the foxes to a general meeting to consider a proposal which he had to place before them";
        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());  //return word count at integer

        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }

    }
}

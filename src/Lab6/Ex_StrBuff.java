package Lab6;

public class Ex_StrBuff {
    public static void main (String []aegs){
        StringBuffer strbuf = new StringBuffer(); //null
        strbuf.append(" at RUTS");
        System.out.println(strbuf.length());

        strbuf.append(" 2020");
        System.out.println(strbuf);

        strbuf.insert(0 , " My name is FILM ");
        System.out.println(strbuf);


    }//main
}

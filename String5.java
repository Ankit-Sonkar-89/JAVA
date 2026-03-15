import java.util.*;
public class String5 {
    public static void main ( String args [] ){
        String Sentence = " I am learning Java Programming ";
        // String Name = Sentence.substring(20 , Sentence.length());
        // String Name = Sentence.substring(0 , 5);
        String Name = Sentence.substring(20 ); // By Default it will take till the end of the string
        System.out.println(Name);
    }
}


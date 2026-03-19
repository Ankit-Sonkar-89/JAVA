import java.util.*;
public class StringsBuild2 {
    public static void main ( String args [] ){
        StringBuilder sb = new StringBuilder("Tony");
        // Print the StringBuilder object
        System.out.println(sb);
        // Print the character at index 0
        System.out.println(sb.charAt(0));
        // Modify the character at index 0 to 'p'
        sb.setCharAt(0,'p');
        System.out.println(sb);
        // Insert the character 'k' at index 1
        sb.insert(1,'k');
        System.out.println(sb);
        // Delete the character at index 1
        sb.delete(1,2);
        System.out.println(sb);
    }
}
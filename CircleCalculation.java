import java.util.*;
public class CircleCalculation {
public static void main ( String args [] ) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println(" Enter the radius of circle " );
    Float radius = sc.nextFloat();
    Float circumference = 2 * 3.14f * radius;
    Float area = 3.14f * radius * radius;
    System.out.println("Circumference of circle : " + circumference );
    System.out.println("Area of circle : " + area);
    sc.close();
}
} 



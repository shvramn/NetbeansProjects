
package exceptionhandling;
import java.util.*;

public class ExceptionHandling {

    
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        a= sc.nextInt();
        b=sc.nextInt();
       
        try
        {
           c  = a/b;
        System.out.println(c);   
        }
        catch(ArithmeticException e)
                {
                    System.out.println(e);
                }
        System.out.println("bye");
    }
    
}

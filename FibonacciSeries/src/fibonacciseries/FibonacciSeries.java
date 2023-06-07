
package fibonacciseries;
import java.util.*;
public class FibonacciSeries 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to fibonacci series");
    System.out.println("enter the number of values to be extracted :");
    int n = sc.nextInt();
    
    int a=0,b=1,c;
    System.out.print(a+ ","+b + ",");
    
    for(int i=0;i<=n-2;i++)
    {
        c = a+b;
        System.out.print(c+",");
        a=b;
        b=c;
    }
    
    }
    
}

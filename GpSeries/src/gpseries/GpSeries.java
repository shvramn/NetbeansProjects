
package gpseries;
import java.util.*;
public class GpSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a, r and n values");
        int a,r,n;
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        
        int term=a;
         for (int i=0;i<n;i++)
         {
             System.out.print(term+ ",");
             term = term*r;
         }
    }
    
}

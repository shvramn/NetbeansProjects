
package apseries;
import java.util.*;
public class ApSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,d and n values");
        int n,d,a;
        a= sc.nextInt();
        d= sc.nextInt();
        n= sc.nextInt();
       
       
        int term = a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+ ",");
            term = term+d;
            
        }
            
        
    }
    
}

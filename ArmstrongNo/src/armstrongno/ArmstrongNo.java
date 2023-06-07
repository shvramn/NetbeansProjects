
package armstrongno;
import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        int r;
        int sum = 0;
         while (n>0)
         {
             r = n%10;
             sum = sum +(r*r*r);
             n = n/10;     
         }
        if(sum==m)
        {
            System.out.println("armstong number");
        }
        else
        {
            System.out.println("not an armstrong number");
            
        }
    }
    
}

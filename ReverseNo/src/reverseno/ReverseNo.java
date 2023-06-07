
package reverseno;
import java.util.*;
public class ReverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int r;
        int reverse= 0;
                while(n>0)
                {
                    r = n%10;
                    reverse = (reverse*10)+r;
                    n =n/10;
                   /*System.out.println("Reverse of a number is " +reverse);*/
                }
                System.out.println("Reverse of a number is " +reverse);
                
    }
    
}


package palindromeint;
import java.util.*;
public class PalindromeInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int r;
        int m = n;
        int rev = 0;
        while(n>0)
                {
                    r = n%10;
                    /*n = n/10;*/
                    rev = (rev*10)+r;
                    n = n/10;
                    /*System.out.println("Reverse of a number is " +m);*/
                }
        
        if(rev==m)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not a palindrome");
            
        }
    }
    
}

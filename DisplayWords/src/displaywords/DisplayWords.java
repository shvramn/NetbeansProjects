
package displaywords;
import java.util.*;
public class DisplayWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int r;
        String str = "";
        while (n>0)
                {
                    r=n%10;
                    n = n/10;
                    str = str+r;
                    /*System.out.println("reverse of given number is " +str);*/
                }
        System.out.println("reverse of given number is " +str);
        
        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c = str.charAt(i);
            switch(c)
            {
                case '0' : System.out.println("zero");
                break;
                case '1' : System.out.println("one");
                break;
                case '2' : System.out.println("two");
                break;
                case '3' : System.out.println("three");
                break;
                case '4' : System.out.println("four");
                break;
                case '5' : System.out.println("five");
                break;
                case '6' : System.out.println("six");
                break;
                case '7' : System.out.println("seven");
                break;
                case '8' : System.out.println("eight");
                break;
                case '9' : System.out.println("nine");
                break;
            }
        }
            
        
    }
    
}

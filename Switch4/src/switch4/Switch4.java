
package switch4;
import java.util.*;
public class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("=====");   
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        int a,b;
        System.out.println("Enter two numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words : ");
        String option = sc.nextLine();
        option = option.toUpperCase();
        
        
        switch(option)
                {
                    case "ADD":System.out.println("ADDITION OF TWO NUMBERS IS  " +(a+b));
                    break;
                    case "SUB":System.out.println("SUBSTARCTION OF TWO NUMBERS IS " + (a-b));
                    break;
                    case "MUL":System.out.println("MULTIPLICATION OF TWO NUMBERS IS " + (a*b));
                    break;
                    case "DIV":System.out.println("SUBSTARCTION OF TWO NUMBERS IS " + (a/b));
                    break;
                    default: System.out.println("Invalid Option");
                    break;
                    
                }
    }
    
}


package switch1;
import java.util.*;
public class Switch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int day = sc.nextInt();
        
        switch(day)
        {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            default: System.out.println("invalid day");
            break;
            
        }
    }
    
}

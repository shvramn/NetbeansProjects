
package switch3;
import java.util.*;
public class Switch3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the domain");
        String domain = sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
       
        switch(ext)
        {
            case "com" : System.out.println("commercial");
            break;
            case "org" : System.out.println("organisation");
            break;
            case "net" : System.out.println("network");
            break;
            case "gov" : System.out.println("government");
            break;
            default : System.out.println("Invalid domain");
            break;
            
            
        }
    }
    
}


package regexp;


public class RegExp
{
    public static void main(String[] args) 
    {
        
        String str = "a!B@c#1#2%3";
        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);
    }
    
}
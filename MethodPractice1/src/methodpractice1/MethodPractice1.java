
package methodpractice1;


public class MethodPractice1 
{
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
           return true;
            
            
        
    
    }
    
    public static void main(String[] args) 
{
       int n = 91;
       isPrime(n);
        
        System.out.println(isPrime(n));
        
        
        
    }
    
}

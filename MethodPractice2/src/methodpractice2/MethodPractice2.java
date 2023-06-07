
package methodpractice2;


public class MethodPractice2 {
    static  int gcd(int m, int n)
    {
       while (m!=n)
       {
           if(m>n)
               m = m-n;
           else
           n = n-m;
       }
      return m ;
       
    }

    
    public static void main(String[] args)
    {
    int m=35,n=56;

        System.out.println(gcd(m,n));
        
    }
    
}

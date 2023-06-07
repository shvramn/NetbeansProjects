
package varargs4;


public class VarArgs4 {

   static double sum(double ...P)
   {
       double sum = 0;
       for(int i=0;i<P.length;i++)
       {
           sum = sum + P[i];
       }
       if(sum<500)
           return sum*0.10;
       else if(sum>=500 && sum<=1000)
           return sum*0.15;
           else
                   return sum*0.20;
   }
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30,40,50));
    }
    
}

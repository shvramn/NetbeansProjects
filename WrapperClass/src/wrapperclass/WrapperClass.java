
package wrapperclass;


public class WrapperClass {

    
    public static void main(String[] args) {
        
        int m1 = 15;//primitive data type variable 
        Integer m2= Integer.valueOf("123");
        try
        {
        Integer m3=Integer.valueOf("1010", 1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
        System.out.println(Integer);
        }
         
    }
    
}

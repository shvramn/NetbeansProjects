
package exceptionhandling1;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        int A[]={30,20,10,40,0};
        try
        {
            int c = A[0]/A[2];
            System.out.println(c);
            System.out.println(A[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Denominator should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is Invalid");
        }
        System.out.println("Bye");
    }
    
}

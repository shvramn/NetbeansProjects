
package arrayrotation;
public class ArrayRotation {

    public static void main(String[] args) {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        for(int x :A)
        
            System.out.print(x+ "," );
            System.out.println("");
            
        
        int temp = A[A.length-1];
        for(int i=1;i<A.length;i++)
        {
           A[i+1]= A[i];
        }
        /*A[]=temp;*/
        for(int x :A)
        
            System.out.print(x+ "," );
            System.out.println("");
        
        
            
    }
    
}


package arraymax;


public class ArrayMax {

   
    public static void main(String[] args) {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int max;
        max = A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max = A[i];
            }
            
            
        }
        System.out.println("Maximum element in the array is :" +max);
    }
    
}

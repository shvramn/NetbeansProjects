
package methodpractice3;

public class MethodPractice3 {
    static int max(int A[])
    {
        int max = A[0];
        for (int i=1;i<A.length;i++)
        {
            if(A[i]>max);
            {
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int A[]= {8,3,15,9,7};
        int max = max(A);
        System.out.println(max);
    }
    
}

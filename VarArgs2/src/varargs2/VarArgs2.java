
package varargs2;


public class VarArgs2 {
    static void showList(int start,String ...S)
    {
       for (int i=0;i<S.length; i ++)
    {
      System.out.println(start + "."+ S[i]);
      start++;
      
    }
     
    }
    public static void main(String[] args) {
        showList(5,"john","smith","ajay","ahmed","mark","suresh");
    }
    
}

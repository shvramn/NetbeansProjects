
package paralambdaexperession;
//single parameter
/*@FunctionalInterface
        interface MyLambda
{
    public void display(String str);
}
*/

//multiple parameterized lambda expression
@FunctionalInterface
interface MyLambda
{
    public int add(int x,int y);
}

public class ParaLambdaExperession {

    
    public static void main(String[] args) {
        //display method for single parameter
        /*MyLambda m =(s)->{System.out.println(s);};
        m.display("hello world");*/
        
        //display method for multiple parameterized lambda expression
        
        MyLambda m = (a,b)->a+b;
        /*int r = m.add(20,30);
       
        System.out.println(r);*/
        System.out.println(m.add(20, 30));
        
        

}
    
}

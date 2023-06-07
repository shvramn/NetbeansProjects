
package lambdaexpression;

interface MyLambda
{
    public void display();
}
/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("hello world");
    }
}*/
public class LambdaExpression {
    public static void main(String[] args) {
        /*My m = new My();
        m.display();*/
        
        MyLambda m =()->{System.out.println("Hello World");};
        m.display();
        
    }
    
}


package overriding;
class Super
{
    public void display()
    {
        System.out.println("super class");
    }
    
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("sub class");
    }
}


public class OverRiding {

    
    public static void main(String[] args) {
        Super sup=new Sub();
       
        sup.display();
         
    }
    
}

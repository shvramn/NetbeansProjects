
package static3;
class Test
{
    static 
    {
        System.out.println("test1");
    }
    static 
    {
        System.out.println("test2");
    }
    
}


public class Static3 {

    
    public static void main(String[] args) {
      Test t = new Test();
        System.out.println("main");
    }
    
}


package abstractclass;
 abstract class Shape
{
   abstract double perimeter();
   abstract double area();
}

class Circle extends Shape
{
   public double radius;
   @Override
           public double perimeter()
           {
              
             return 2*Math.PI*radius;
           }
           
   @Override
           public double area()
           {
             return Math.PI*radius*radius;
           }
}

class Rectangle extends Shape
{
    public double length;
    public double breadth;
    
    @Override
    public double perimeter()
    {
      return 2*(length+breadth);  
    }
    @Override
    public double area()
    {
        return length*breadth;
    }
    
}

public class AbstractClass {

    
    public static void main(String[] args) {
        Rectangle rt= new Rectangle();
        rt.length = 10;
         rt.breadth = 5;
         System.out.println(rt.area());
        
    }
    
}

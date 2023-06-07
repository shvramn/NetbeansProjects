
package class2;
class Rectangle
        {
    public double length;
    public double breadth;
    
    public double area()
    {
      return length*breadth;  
    }
    public double perimeter()
    {
        return 2*(length + breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}


public class Class2 
{ 
    public static void main(String[] args)
    {
        Rectangle c = new Rectangle();
    c.length = 5;
c.breadth = 10;
System.out.println("area : " +c.area());
System.out.println("perimeter : " +c.perimeter());
System.out.println("circumference : " +c.isSquare());


       
    }
    
}

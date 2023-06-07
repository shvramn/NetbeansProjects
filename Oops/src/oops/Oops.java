
package oops;
class Rectangle
{
    private double length;
    private double breadth;
    
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    
    
    public void setLength(int l)
    {
        if(l>0)
            length=1;
        else
            length=0;
    }
    public void setBreadth(int b)
    {
        if(b>0)
         breadth = b;
        else
            breadth = 0;
    }
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


public class Oops {

    
    public static void main(String[] args)
    {
     Rectangle r = new Rectangle();
     r.setLength(10);
     r.setBreadth(5);
     
    System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
    }
    
}

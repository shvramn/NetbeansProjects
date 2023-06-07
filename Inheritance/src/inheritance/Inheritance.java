
package inheritance;
class Circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
    
    
}

class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
}


public class Inheritance {

    
    public static void main(String[] args) {
        Circle c1= new Circle();
        Cylinder c2 = new Cylinder();
        c2.radius = 7;
        c2.height = 10;
        
           System.out.println("Area "+c1.area());
        System.out.println("Volume "+c2.volume());
           System.out.println("Area "+c2.area());
    }
    
}

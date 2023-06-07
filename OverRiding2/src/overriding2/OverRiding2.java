
package overriding2;
class Car
{
    public void start()
    {
        System.out.println("manual start");
    }
    public void accelarate()
    {
        System.out.println("hard accelearation ");
    }
    public void changeGear()
    {
        System.out.println("manula transmission");
    }
    
}
class LuxuryCar extends Car
{
   
    @Override
    public void changeGear()
    {
        System.out.println("automatic transmission");
    }
    public void openRoof()
    {
        System.out.println("open roof luxury");
    }
}

public class OverRiding2 {

    
    public static void main(String[] args) {
        
        Car c = new LuxuryCar();
        c.start();
        c.accelarate();
        c.changeGear();
        
        
    }
    
}

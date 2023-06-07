
package overriding1;
class Tv
{
   
public void switchOn()
{
System.out.println("normal TV");
}
public void changeChannel()
    {
      System.out.println("smart tv");
    }
}

class SmartTv extends Tv
{
    
@Override
public void switchOn()
   {
     System.out.println("smart tv switched on ");
   }
@Override
public void changeChannel()
    {
      System.out.println("smart tv change channel");
    }
public void browse()
{
    System.out.println("smart tv browsing");
}
}


public class OverRiding1 {

   
    public static void main(String[] args) {
        Tv t = new SmartTv();
        
        t.switchOn();
        t.changeChannel();
    }
    
}

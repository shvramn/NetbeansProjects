
package static2;

class CoffeeMachine
{
    private static float waterqty;
    private static float coffeeqty;
    private static float sugarqty;
    private static float milkqty;
    
    static private CoffeeMachine my=null;
    private CoffeeMachine()
    {
        coffeeqty=1;
        waterqty=1;
        sugarqty=1;
        milkqty=1;
        
    }
    static public CoffeeMachine getInstance()
    {
      if(my==null)
          my = new CoffeeMachine();
      return my;
    }
            
}
public class Static2 {
    public static void main(String[] args) {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
    }
    
}

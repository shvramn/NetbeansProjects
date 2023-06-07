
package constructor2;
class Product
{
    private String itemno;
    private String name;
    private double price;
    private int qty;
    
    
    public Product(String itemno)
    {
        this.itemno=itemno;
    }
    public Product(String itemno,String name)
    {
        this.itemno=itemno;
        this.name=name;
        
    }
     public Product(String itemno,String name,double price,short qty)
    {
        this.itemno=itemno;
        this.name=name;
        this.price=price;
        this.qty = qty;
    }
    
    public String getItemNo()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;   
    }
    public int getQty()
    {
        return qty;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQuantity(int qty)
    {
        this.qty=qty;
    }
    
    
}

class Customer
{
    private String custid;
    private String name;
    private String address;
    private String phno;
    
    public String getCustId()
    {
       return custid;    
    }
    public String name()
    {
        return name;
    }
    private String address()
    {
        return address;
    }
    private String phno()
    {
        return phno;
    }
    
}

public class Constructor2 {

    
    public static void main(String[] args) {
        
        
        
    }
    
}

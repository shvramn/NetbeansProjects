
package inheritance1;
class Account
{
    private String accno;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public String getAccNo()
{
    return accno;
}
public String getName()
{
    return name;
}
public String getAddress()
{
    return address;
}
public String getPhNo()
{
    return phno;
}
public String getDoB()
{
    return dob;
}
public long getBalance()
{
    return balance;
}

public void setAddress(String address)
{
 this.address=address;
}
public void setPhno(String phno)
{
    this.phno=phno;
}
public Account(String accno, String name,String address,String phno,String dob)
{
  this.accno=accno;
this.name = name;
this.address =address;
this.phno=phno;
this.dob = dob;
balance=0;
}

}

class SavingsAccount extends Account
{
    private long amt;

    public SavingsAccount(String accno, String name, String address, String phno, String dob) {
        super(accno, name, address, phno, dob);
    }

    SavingsAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public long getamt()
    {
        return amt;
    }
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{

    public LoanAccount(String accno, String name, String address, String phno, String dob) {
        super(accno, name, address, phno, dob);
    }

    LoanAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void payEmi(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}



public class Inheritance1 {

   
    public static void main(String[] args) {
        Account a1 = new Account();
        SavingsAccount a2 = new SavingsAccount();
        LoanAccount a3 = new LoanAccount();
        
        
        
        
    }
    
}

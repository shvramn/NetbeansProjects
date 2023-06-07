
package pkgenum;
enum Dept
{
CS("John","Block A"), IT("Steve","Block B"),CIVIL("Mark","Block C"),ECE("Jackie","Block D");

String head;
String location;

private Dept(String head, String loc)
{
    this.head=head;
    this.location=loc;
}
public String getHeadName()
{
    return head;
}
public String getLocationName()
{
    return location;
}

}


public class Enum {

    public static void main(String[] args) {
        Dept d = Dept.ECE;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocationName());
        
    }
    
}

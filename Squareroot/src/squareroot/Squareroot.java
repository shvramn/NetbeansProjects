package squareroot;
import java.util.*;

public class Squareroot
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c;
double s,area ;
System.out.println("enter the values a,b,c ");

a = sc.nextInt();
b =sc.nextInt();
c = sc.nextInt();
 s = (a+b+c)/2f;
area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of traingle is " + area);
}
}

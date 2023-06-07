package grades;
import java.util.*;
public class Grades
{
    public static void main(String[] args) {
    int a,b,c,t1,a1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks : ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
t1 = a+b+c;
a1 = (a+b+c)/2;
System.out.println("total is " +t1);
System.out.println("average is " +a1);

if (a1>=70)
{
    System.out.println(" A grade");
}
else if (a1 < 70 && a1>=60)
{ 
    System.out.println("B grade");
}
else if (a1<60 && a1>=50)
{
    System.out.println("C grade");
}
else if (a1 <50 && a1>=50)
{
    System.out.println("D grade");
}
else 
{
    System.out.println("F grade");
            }

}
    }
    
}

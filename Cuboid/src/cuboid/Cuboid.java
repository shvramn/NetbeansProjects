package cuboid;
import java.util.Scanner;

public class Cuboid
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int length,breadth,height;
int totalArea,volume;
System.out.println("Enter the values ");
length= sc.nextInt();
breadth = sc.nextInt();
height = sc.nextInt();


totalArea = (length*height)+(breadth*height)+(length*breadth);
volume = length*breadth*height;

System.out.println(" total area of cuboid  is " +totalArea);
System.out.println("volume of cuboid is " +volume);
}
}

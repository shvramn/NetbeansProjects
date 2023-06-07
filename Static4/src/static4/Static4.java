
package static4;
import java.util.Date;
class Student
{
    private  String rollNo;
    private static int count =1;
    private String assignRollNo()
    {
       Date d = new Date();
       String rn = "univ-"+(d.getYear()+1900)+"-"+count;
       count ++;
       return rn;
    }
      public Student()
    {
        rollNo= assignRollNo();
    }
     public String getRollNo()
     {
         return rollNo;
     }    
}
class Account
{
    private long accNo;
    private String assignAccNo()
    {
       
    }
}
public class Static4 {

    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
          
        
        


    }
    
}

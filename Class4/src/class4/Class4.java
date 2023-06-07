
package class4;
class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total()
    {
      return (m1+m2+m3);
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>=70)
            return 'A';
        else 
                return 'B';
        
    }
    public String details()
    {
        return "Roll.no"+roll+"\n"+"name : "+name+"\n"+"course :" +course+"\n";
    }
}

public class Class4 {
    public static void main(String[] args) {
        Student s=new Student();
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=10;
        s.m2=20;
        s.m3=30;
        System.out.println("total marks : " +s.total());
        System.out.println("average : " +s.average());
        System.out.println("details : " +s.details());
        
    }
    
}

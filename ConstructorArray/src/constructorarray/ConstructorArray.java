
package constructorarray;
class Subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subId,String name)
    {
        this.subId=subId;
        this.name = name;
    }
    
    public Subject(String subId,String name,int maxMarks)
    {
        this.subId=subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    
    public Subject(String subId,String name,int maxMarks,int marksObtain)
    {
        this.subId=subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain=marksObtain;
        
    }
    public String getsubId()
    {
        return subId;
    }
    public String getname()
    {
        return name;
    }
    public int getmaxMarks()
    {
        return maxMarks;
    }
    public int getmarksObtain()
    {
        return marksObtain;
    }
    
    
    public void setmaxMarks(int i)
    {
        if(i>0)
        maxMarks=i;
        else 
            maxMarks=0;
    }
    
     public void setmarksObtain(int j)
    {
        if(j>0)
        marksObtain=j;
        else 
            marksObtain=0;
    }
     public String toString()
     {
         return "\nSubject ID: "+subId+"\nName : "+name+ "\n MarksObtained:"+marksObtain;     }
    
}

class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private String subjects;
    
    public String getrollNo()
    {
        return rollNo;
    }
    public String getname()
    {
        return name;
    }
    public String dept()
    {
        return dept;
    }
    public String subjects()
    {
        return subjects;
    }
     
    
}


public class ConstructorArray {

    
    public static void main(String[] args) {
        Subject subs[]= new Subject[3];
        subs[0]= new Subject("s101","DS",100);
        subs[1]= new Subject("s102","cS",100);
        subs[2]= new Subject("s103","bS",100);
        
        for(Subject s:subs)
        System.out.println(s);
        
    }
    
}

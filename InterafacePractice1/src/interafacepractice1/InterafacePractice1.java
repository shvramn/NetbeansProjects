
package interafacepractice1;
class Phone
{
  public void call()
  {
      System.out.println("phone call ");
  }
  public void sms()
  {
      System.out.println("phone sms");
  }
  
}

interface ICamera
{
    void click();
    void record();
    
}

interface IMusicPlayer
{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
   public void videocall()
   {
       System.out.println("smartphone videocall");
   }
   public void click()
   {
       System.out.println("smart phone click");
   }
   public void record()
   {
       System.out.println("smartphone record");
   }
   public void play(){
       System.out.println("smartphone play");
   }
   public void pause(){
       System.out.println("smartphone pause");
   }
    public void stop(){
       System.out.println("smartphone stop");
   }
}



public class InterafacePractice1 {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.play();
        sp.record();
        sp.call();
        
        
    }
    
}

import java.util.*;

public class battery extends Thread{

   device device=null;
   
   public battery(device device){
      this.device=device;
   }
   public void run(){
      try{
         while(this.device.battery>0){
            Thread.sleep(5000);
            this.device.timer=this.device.battery-1;
            System.out.println(this.device.battery);
         }
      }
      catch (InterruptedException e){
         //System.out.println("Timer Interrupted");
      }   
   }
}
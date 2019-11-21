import java.util.*;

public class timer extends Thread{

   device device=null;
   
   public timer(device device){
      this.device=device;
   }
   public void run(){
      try{
         while(this.device.timer>0){
            Thread.sleep(1000);
            this.device.timer=this.device.timer-1;
            System.out.println(this.device.timer);
         }
      }
      catch (InterruptedException e){
         //System.out.println("Timer Interrupted");
         //Thread.currentThread().interrupt();
         return;
      }   
   }
}
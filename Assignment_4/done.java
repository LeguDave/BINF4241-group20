import java.util.*;

public class done extends Thread{

   device device=null;
   
   public done(device device){
      this.device=device;
   }
   public void run(){
      try{
         while(this.device.done>0){
            Thread.sleep(10000);
            this.device.timer=this.device.done-1;
            System.out.println(this.device.done);
         }
      }
      catch (InterruptedException e){
         //System.out.println("Timer Interrupted");
      }   
   }
}
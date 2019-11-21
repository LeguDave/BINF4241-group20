import java.util.*;

public class battery extends Thread{

   device device=null;
   boolean charging=false;
   
   public battery(device device, boolean charging){
      this.device=device;
      this.charging=charging;
   }
   public void run(){
      try{
      
         if(this.charging==false){
            while(this.device.battery>0){
            Thread.sleep(5000);
            this.device.timer=this.device.battery-1;
            System.out.println(this.device.battery);
            }
         }
         else{
            while(this.device.battery<100){
            Thread.sleep(1000);
            this.device.timer=this.device.battery+1;
            System.out.println(this.device.battery);
            }
         
         }
         
      }
      catch (InterruptedException e){
         //System.out.println("Timer Interrupted");
      }   
   }
}
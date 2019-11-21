import java.util.*;

public class battery extends Thread{

   cleaning_robot device=null;
   boolean charging=false;
   
   public battery(cleaning_robot device, boolean charging){
      this.device=device;
      this.charging=charging;
   }
   public void run(){
      try{
         //first checks whether battery or time is zero
         if(this.charging==false){
            while(this.device.battery>0 || this.device.timer!=0){
               Thread.sleep(1000);
               this.device.battery=this.device.battery-10;
               this.device.done=this.device.done+4;
            }
            this.device.stop_return();
         }
         else{
            while(this.device.battery<100){
               Thread.sleep(1000);
               this.device.battery=this.device.battery+4;
            }
         }
         
      }
      catch (InterruptedException e){
         //System.out.println("Timer Interrupted");
         return;
      }   
   }
}
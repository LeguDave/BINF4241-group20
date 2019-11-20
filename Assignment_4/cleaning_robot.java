import java.util.Scanner;

public class cleaning_robot extends device
{
   int timer;
   int battery; //in percent
   int done; //cleaning completion in percent
   
   
   //constructor
   public cleaning_robot(){
   
      this.turned_on=false;
      this.done=0;
      this.battery=100;
      this.timer=0;
      
      this.name="Cleaning Robot";

   }
   
   //Override
   public void switch_on(){
      System.out.println("you turned me on");
      //need 100% charged + needs to be in loading station
      if(this.battery==100 && this.turned_on){
         this.turned_on=true;
         //update done
         //update battery
      }
      else{
         if(this.battery != 100){
            System.out.println("Cleaning robot is not charged yet.");
         }
         if(turned_on == false){
            System.out.println("Cleaning robot is still cleaning.");
         }
      }
   }
   
   //Override
   public void switch_off(){}
   
   public void set_timer(){
      if(turned_on==true){
         return;
      }
      System.out.println("Cleaning Robot: Set timer to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.timer=input3;
      System.out.println("Cleaning Robot: Time set");
   }
   
   public void time_return(){
      //returns robot to charging station when time expires
   }
   
   public void check_cleaning(){
      //check percentage of cleaning
      System.out.println("Cleaning robot has done " + done + "/100 of the cleaning work.");
   }
   
   public void check_battery(){
      //check battery
      System.out.println("Cleaning robot's battery is at " + this.battery + "%.");
   }
   
   public void check_charging(){
      //check if cleaning robot is charging
      if(this.turned_on && this.battery != 100){
         System.out.println("Cleaning robot is charging.");
      }
      else{
         if(this.turned_on == false){
            System.out.println("Cleaning robot is still cleaning cleaning.");
         }
         if(this.battery == 100){
            System.out.println("Cleaning robot is full battery.");
         }
      }  
   }
   
   public void complete_cleaning(){
      //complete cleaning
      if(this.done != 100){
         this.switch_on();
      }
      else{
         System.out.println("Cleaning robot is already done cleaning.");
      }
   }
   
   public void stop_return(){
      //interrupts cleaning and returns to charging base 
      this.turned_on=false;
   }
}
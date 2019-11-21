import java.util.Scanner;

public class cleaning_robot extends device
{
   
   Thread charge = new battery(this,true);
   Thread empty = new battery(this,false);
   Thread t = new timer(this);
   int battery=100;
   int done=0;

   //constructor
   public cleaning_robot(){
   
      this.turned_on=false;
      this.name="Cleaning Robot";
      
      this.menu.add("Set timer");
      this.menu.add("Check cleaning");
      this.menu.add("Check battery");
      this.menu.add("Check charging");
      this.menu.add("Complete cleaning");
      this.menu.add("Stop and return");

   }
   
   //Override
   public void switch_on(){
      //need 100% charged + needs to be in loading station
      if(this.turned_on){
         System.out.println("Cleaning robot is already cleaning.");
         return;
      }
      
      //cleaning robot can only start if battery is full and 
      if(this.timer!=0 && this.battery==100){
         t.interrupt();
         t = new timer(this);
         this.t.start();
         
         charge.interrupt();
         empty.interrupt();
         empty = new battery(this,false);
         empty.start();
      }
   }
   
   //Override
   public void switch_off(){
   
   }
   
   public void set_timer(){
      if(turned_on){
         System.out.println("Sorry, time can only be when robot is at the station.");
         return;
      }
      System.out.println("Cleaning Robot: Set timer to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.timer=input3;
      System.out.println("Cleaning Robot: Time set.");
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
      if(charge.isAlive()){
         System.out.println("Yes, cleaning robot is charging.");
      }
      else{
         System.out.println("No, cleaning robot is not charging.");
      }
   }
   
   public void stop_return(){
      //interrupts cleaning and returns to charging base 
      if(this.turned_on){
         this.turned_on=false;
         charge.interrupt();
         charge = new battery(this,true);
         charge.start();
         
         empty.interrupt();
         
         t.interrupt();
         
         System.out.println("Cleaning robot stops cleaning and returns to station.");
      }
      System.out.println("Cleaning robot is already at station.");
   }
}
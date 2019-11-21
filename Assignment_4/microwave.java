import java.util.Scanner;

public class microwave extends device
{
   int temperature=0;
   boolean baking=false;
   
   Thread t =new timer(this);
   
   
   //constructor
   public microwave(){
      this.name="Microwave";
      this.menu.add("Switch off");
      this.menu.add("Set timer");
      this.menu.add("Set temperature");
      this.menu.add("Check timer");
      this.menu.add("Bake");
      this.menu.add("Interrupt");
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
      System.out.println("Microwave: turned on");
      
   }
   //Override
   public void switch_off(){
      this.timer=0;
      this.temperature=0;
      this.baking=false;
      this.turned_on=false;
      t.interrupt();
      System.out.println("Microwave: turned off");
   }
   public void set_timer(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Microwave: Set timer to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.timer=input3;
      System.out.println("Microwave: Time set");
   }
   public void set_temperature(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Microwave: Set temperature to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.temperature=input3;
      System.out.println("Microwave: Temperature set");
   }
   public void bake(){
      if(this.turned_on==false || this.t.isAlive()==true){
         return;
      }
      if(this.temperature>0 && this.timer>0 && this.turned_on==true){
         System.out.println("Microwave: Started baking");
         this.baking=true;
         //start thread
         this.t.interrupt();
         this.t=new timer(this);
         this.t.start();
      }
      else{
         System.out.println("Microwave: Please set time and temperature first");
      }
      
   }
   public void interrupt(){
      this.baking=false;
      System.out.println("Microwave: Interrupted");
      //cancel thread
      t.interrupt();
   }
   public void check_timer(){
      if(this.turned_on==false){
         return;
      }
      if(this.timer==0){
         System.out.println("Microwave: Set timer first");
         return;
      }
      System.out.println("Microwave: Current timer: "+this.timer);
   }
   
}
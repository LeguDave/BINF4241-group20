import java.util.ArrayList;
import java.util.*;

public class oven extends device
{
   int temperature=0;
   boolean baking=false;
   String program="";
   ArrayList<String> programs = new ArrayList();
   
   Thread t =new timer(this);
   
      
   
   //constructor
   public oven(){
      this.name="Oven";
      
      this.menu.add("Switch off");
      this.menu.add("Set timer");
      this.menu.add("Set temperature");
      this.menu.add("Set a program");
      this.menu.add("Check timer");
      this.menu.add("Bake");
      this.menu.add("Interrupt");
      
      this.programs.add("Grill");
      this.programs.add("Ventilation");
      this.programs.add("Steaming");
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
      System.out.println("Oven: turned on");
      
   }
   //Override
   public void switch_off(){
      this.timer=0;
      this.temperature=0;
      this.baking=false;
      this.turned_on=false;
      this.program="";
      System.out.println("Oven: turned off");
   }
   public void set_timer(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Oven: Set timer to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.timer=input3;
      System.out.println("Oven: Time set");
   }
   public void set_temperature(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Oven: Set temperature to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.temperature=input3;
      System.out.println("Oven: Temperature set");
   }
   public void set_program(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Oven: Choose a Program Button: ");
      for (int i = 0; i < programs.size(); i++){
         System.out.print("Program "+i+": ");
			System.out.println(programs.get(i));
		}
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.program=this.programs.get(input3);
      System.out.println("Oven: Program set to "+this.program); 
   }
   public void bake(){
      if(this.turned_on==false || this.baking==true){
         return;
      }
      if(this.temperature>0 && this.timer>0 && this.turned_on==true && this.program!=""){
         System.out.println("Oven: Started baking");
         this.baking=true;         
         //start thread
         this.t.start();
      }
      else{
         System.out.println("Oven: Please set time, temperature and program first");
      }
      
   }
   public void interrupt(){
      this.baking=false;
      System.out.println("Oven: Interrupted");
      //cancel thread
      this.t.interrupt();
      
      
   }
   public void check_timer(){
      if(this.turned_on==false){
         return;
      }
      if(this.timer==0){
         System.out.println("Oven: Set timer first");
         return;
      }
      System.out.println("Oven: Current timer: "+this.timer);
   }
}
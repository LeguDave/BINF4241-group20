import java.util.*;

public class washing_machine extends device
{
   Map<String, Integer> programs = new LinkedHashMap<>();
   List<String> program_names = null;
   List<Integer> program_timers = null;
   boolean washing=false;
   String program_name="";
   Thread t =new timer(this);
   int temperature=0;
      
   //constructor
   public washing_machine(){
      this.name="Washing Machine";
      this.menu.add("Choose program");
      this.menu.add("Set temperature");
      this.menu.add("Start washing");
      this.menu.add("Check timer");
      this.menu.add("Stop");
      this.menu.add("Switch off");
      //fill the programs hashmap
      this.programs.put("Quick", 10);
      this.programs.put("Intense", 20);
      this.programs.put("Spin", 30);
      this.programs.put("Double Rinse", 40);
      //get program_name
      this.program_names = new ArrayList<String>(programs.keySet());      
      //get program_timer
      this.program_timers = new ArrayList<Integer>(programs.values());
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
      System.out.println("Washing Machine: turned on");
   }
   //Override
   public void switch_off(){
      this.timer=0;
      this.turned_on=false;
      this.washing=false;
      this.program_name="";
      this.t.interrupt();
      System.out.println("Washing Machine: turned off");
   }
   
   public void set_temperature(){
      if(this.turned_on==false){
         return;
      }
      System.out.println("Washing Machine: Set temperature to?");
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      this.temperature=input3;
      System.out.println("Washing Machine: Temperature set");
   }
   
   public void set_program(){
   
      if(this.turned_on==false){
         return;
      }
      System.out.println("Washing Machine: Choose a Program Button: ");
      for (int i = 0; i < program_names.size(); i++){
         System.out.println("Program "+i+": "+ this.program_names.get(i)+" - "+ this.program_timers.get(i)+"Sec");
		}
      
      Scanner in3 = new Scanner(System.in);
      int input3 = Integer.parseInt(in3.nextLine().trim());
      if(input3==-1){
         System.out.println("Exit Menu");
         this.print_menu(this.menu);
         return;
      }
      
      this.program_name=this.program_names.get(input3);
      this.timer=this.program_timers.get(input3);
      
      System.out.println("Washing Machine: Program set to "+this.program_name);
   
   }
   
   public void interrupt(){
      if(this.turned_on){
         if(this.t.isAlive() == false){
            this.switch_off();
         }
         else{
            System.out.println("Washing machine is still washing.");
         }
      }
   }
   public void wash(){
      if(this.turned_on==false || this.t.isAlive()==true){
         return;
      }
      if(this.program_name!="" && this.timer>0){
         System.out.println("Washing machine: Started washing");
         this.washing=true;
         //start thread
         this.t.interrupt();
         this.t=new timer(this);
         this.t.start();
      }
      else{
         System.out.println("Washing machine: Please choose a program and temperature first");
      }
      
   }
   public void check_timer(){
      if(this.turned_on==false){
         return;
      }
      if(this.timer==0){
         System.out.println("Washing Machine: Set timer first");
         return;
      }
      System.out.println("Washing Machine: Current timer: "+this.timer);
   }
}
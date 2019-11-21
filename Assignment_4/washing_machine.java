import java.util.*;

public class washing_machine extends device
{
   Map<String, Integer> programs = new LinkedHashMap<>();
   List<String> program_names = new ArrayList<>();
   List<Integer> program_timers = new ArrayList<>();
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
      this.program_names = (ArrayList)programs.keySet();      
      //get program_timer
      this.program_timers = (ArrayList)programs.values();
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
      t.interrupt();
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
      
      this.program_name=this.program_names.get(input3);
      this.timer=this.program_timers.get(input3);
      
      System.out.println("Washing Machine: Program set to "+this.program_name);
   
   }
   
   public void stop(){
      if(this.turned_on){
         if(this.washing == false){
            this.switch_off();
         }
         else{
            System.out.println("Washing machine is still washing.");
         }
      }
   }
}
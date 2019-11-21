import java.util.*;

public class dishwasher extends device
{
   Map<String, Integer> programs = new LinkedHashMap<>();
   List<String> program_names = null;
   List<Integer> program_timers = null;
   boolean washing=false;
   String program_name="";
   Thread t =new timer(this);
   
   //constructor
   public dishwasher(){
      this.name="Dishwasher";
      this.menu.add("Start washing");
      this.menu.add("Choose program");
      this.menu.add("Check timer");
      this.menu.add("Stop");
      this.menu.add("Switch off");
      //fill the programs hashmap
      this.programs.put("Glasses", 10);
      this.programs.put("Plates", 20);
      this.programs.put("Pans", 30);
      this.programs.put("Mixed", 40);
      //get program_name
      this.program_names = new ArrayList<String>(programs.keySet());      
      //get program_timer
      this.program_timers = new ArrayList<Integer>(programs.values());
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
      System.out.println("Dishwasher: turned on");
   }
   //Override
   public void switch_off(){
      this.timer=0;
      this.turned_on=false;
      this.washing=false;
      this.program_name="";
      this.t.interrupt();
      System.out.println("Dishwasher: turned off");
   }
   public void check_timer(){
      if(this.turned_on==false){
         return;
      }
      if(this.timer==0){
         System.out.println("Dishwasher: Choose Program first");
         return;
      }
      System.out.println("Dishwasher: Current timer: "+this.timer);
   }
   public void set_program(){
   
      if(this.turned_on==false){
         return;
      }
      System.out.println("Dishwasher: Choose a Program Button: ");
      for (int i = 0; i < program_names.size(); i++){
         System.out.println("Program "+i+": "+ this.program_names.get(i)+" - " +this.program_timers.get(i)+"Sec");
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
      
      System.out.println("Dishwasher: Program set to "+this.program_name);
   
   }
   public void interrupt(){
      this.washing=false;
      System.out.println("Dishwasher: Interrupted");
      //cancel thread
      t.interrupt();
   }
   public void wash(){
      if(this.turned_on==false || this.t.isAlive()==true){
         return;
      }
      if(this.program_name!="" && this.timer>0){
         System.out.println("Dishwasher: Started washing");
         this.washing=true;
         //start thread
         this.t.interrupt();
         this.t=new timer(this);
         this.t.start();
      }
      else{
         System.out.println("Dishwasher: Please choose a program first");
      }
      
   }
}
import java.util.ArrayList;


public class smartphone
{
   private device current_device=null;
   public command c;
   //instances of devices
   public device microwave=new microwave();
   public device oven=new oven();
   public device cleaning_robot=new cleaning_robot();
   public device washing_machine=new washing_machine();
   public device dishwasher=new dishwasher();
   
   //device array
   public ArrayList<device> devices=new ArrayList();
   
   //create array of commands for each device
   private ArrayList<command> commandsMW=new ArrayList();
   private ArrayList<command> commandsO=new ArrayList();
   private ArrayList<command> commandsCR=new ArrayList();
   private ArrayList<command> commandsWM=new ArrayList();
   private ArrayList<command> commandsDW=new ArrayList();
   

   public smartphone(){
      //add devices to array
      this.devices.add(this.microwave);
      this.devices.add(this.oven);
      //this.devices.add(this.cleaning_robot);
      //this.devices.add(this.washing_machine);
      //this.devices.add(this.dishwasher);  
   
      //initiate MW commands
      commandsMW.add(new MWCommandOn((microwave)this.microwave));
      commandsMW.add(new MWCommandOff((microwave)this.microwave));
      commandsMW.add(new MWCommandSetTimer((microwave)this.microwave));
      commandsMW.add(new MWCommandSetTemperature((microwave)this.microwave));
      commandsMW.add(new MWCommandCheckTimer((microwave)this.microwave));
      commandsMW.add(new MWCommandBake((microwave)this.microwave));
      commandsMW.add(new MWCommandInterrupt((microwave)this.microwave));
      
      //initiate Oven commands
      commandsO.add(new OCommandOn((oven)this.oven));
      commandsO.add(new OCommandOff((oven)this.oven));
      commandsO.add(new OCommandSetTimer((oven)this.oven));
      commandsO.add(new OCommandSetTemperature((oven)this.oven));
      commandsO.add(new OCommandSetProgram((oven)this.oven));
      commandsO.add(new OCommandCheckTimer((oven)this.oven));
      commandsO.add(new OCommandBake((oven)this.oven));
      commandsO.add(new OCommandInterrupt((oven)this.oven));
      
      System.out.println(commandsO);

      
      //initiate CR commands
      
      //initiate WM commands
      
      //initiate DW commands
      
      
   }
   
   public void choose_device(device chosen){
      this.current_device=chosen;
      chosen.print_menu(chosen.menu);;
   }

   public void press(int i){
      if (current_device.name.equals("Microwave")){
         if(i<this.commandsMW.size()&&i>=0){
            this.c=this.commandsMW.get(i);
            this.c.execute();
         }
      }
      else if(current_device.name.equals("Dishwasher")){
      
      }
      else if(current_device.name.equals("Washing Machine")){
      
      
      }
      else if(current_device.name.equals("Cleaning Robot")){
         
      
      }
      else if(current_device.name.equals("Oven")){
         if(i<this.commandsO.size()&&i>=0){
            this.c=this.commandsO.get(i);
            this.c.execute();
         }
      }
   }
   
   public void print_devices(){
      System.out.println("---------Main Menu---------");
      System.out.println("Choose a device: ");
      for (int i = 0; i < this.devices.size(); i++){
         System.out.print("Device "+i+": ");
			System.out.println(this.devices.get(i).name);
		}
      System.out.println("\n");
   }
   	
}
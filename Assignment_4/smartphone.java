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
      this.devices.add(this.cleaning_robot);
      this.devices.add(this.washing_machine);
      this.devices.add(this.dishwasher);  
   
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
            
      //initiate CR commands
      commandsCR.add(new CRCommandOn((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandSetTimer((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandCheckCleaning((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandCheckBattery((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandCheckCharging((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandCheckCleaning((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandCompleteCleaning((cleaning_robot)this.cleaning_robot));
      commandsCR.add(new CRCommandStopReturn((cleaning_robot)this.cleaning_robot));
      
      //initiate WM commands
      commandsWM.add(new WMCommandOn((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandSetProgram((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandSetTemperature((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandWash((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandCheckTimer((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandInterrupt((washing_machine)this.washing_machine));
      commandsWM.add(new WMCommandOff((washing_machine)this.washing_machine));
      
      //initiate DW commands
      commandsDW.add(new DWCommandOn((dishwasher)this.dishwasher));
      commandsDW.add(new DWCommandWash((dishwasher)this.dishwasher));
      commandsDW.add(new DWCommandSetProgram((dishwasher)this.dishwasher));
      commandsDW.add(new DWCommandCheckTimer((dishwasher)this.dishwasher));
      commandsDW.add(new DWCommandInterrupt((dishwasher)this.dishwasher));
      commandsDW.add(new DWCommandOff((dishwasher)this.dishwasher));
      
      
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
         if(i<this.commandsDW.size()&&i>=0){
            this.c=this.commandsDW.get(i);
            this.c.execute();
         }
      }
      else if(current_device.name.equals("Washing Machine")){
         if(i<this.commandsWM.size()&&i>=0){
            this.c=this.commandsWM.get(i);
            this.c.execute();
         }
      }
      else if(current_device.name.equals("Cleaning Robot")){
         if(i<this.commandsCR.size()&&i>=0){
            this.c=this.commandsCR.get(i);
            this.c.execute();
         }
      
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
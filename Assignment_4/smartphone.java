import java.util.ArrayList;


public class smartphone
{
   private device current_device=null;
   public command c;

   public smartphone(){
      
   }
   
   public void choose_device(device chosen){
      this.current_device=chosen;
      chosen.print_menu();;
   }

   public void press(int i){
      if (current_device.name.equals("Microwave")){
         //switch on mw
         if(i==0){
            this.c=new MWCommandOn((microwave)this.current_device);
            this.c.execute();
         }
         //switch off mw
         else if(i==1){
            this.c=new MWCommandOff((microwave)this.current_device);
            this.c.execute();
         }
         //switch set timer mw
         else if(i==2){
            this.c=new MWCommandSetTimer((microwave)this.current_device);
            this.c.execute();
         }
         //switch set temperature mw
         else if(i==3){
            this.c=new MWCommandSetTemperature((microwave)this.current_device);
            this.c.execute();
         }
         //check timer mw
         else if(i==4){
            this.c=new MWCommandCheckTimer((microwave)this.current_device);
            this.c.execute();
         }
         //bake
         else if(i==5){
            this.c=new MWCommandBake((microwave)this.current_device);
            this.c.execute();
         }
         //interrupt
         else if(i==6){
            this.c=new MWCommandInterrupt((microwave)this.current_device);
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
      
      }
   }
   	
}
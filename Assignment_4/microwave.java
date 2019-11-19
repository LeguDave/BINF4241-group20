public class microwave extends device
{
   int timer=0;
   int temperature=0;
   boolean baking=false;
   
   
   //constructor
   public microwave(){
      this.name="Microwave";
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
      this.menu.add("Switch off");
      this.menu.add("Set timer");
      this.menu.add("Set temperature");
   }
   //Override
   public void switch_off(){
      this.menu.clear();
      this.menu.add("Switch on");
      this.timer=0;
      this.temperature=0;
      this.baking=false;
      this.turned_on=false;
   }
   public void set_timer(int time){
      this.timer=time;
      this.menu.add("Check timer");
   }
   public void set_temperature(int temperature){
      this.temperature=temperature;
   }
   public void start_baking(){
      this.baking=true;
      //bake until timer == 0 or interupted {decrement timer}
   }
   public void interrupt(){
      this.baking=false;
   }
   public void check_timer(){
      System.out.println("Current Time left: "+this.timer);
   }
   
}
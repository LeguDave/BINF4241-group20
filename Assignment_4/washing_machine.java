public class washing_machine extends device
{
   boolean is_washing;
   int degrees;
   int type; //1-double rins      2-intense       3-quick         4-spin
   
   //constructor
   public washing_machine(){
      this.is_washing=false;
      this.type=1;
      this.degrees=0;
   }
   //Override
   public void switch_on(){
      this.turned_on=true;
   }
   //Override
   public void switch_off(){
      this.turned_on=false;
   }
   
   public void select_degrees(){
      if(this.turned_on){
         //scan input for degrees
      }
   }
   
   public void select_type(){
      if(this.turned_on){
         //scan input for program/type
      }
   }
   
   public void timer(){
      if(this.turned_on){
         //sets timer, dependent on type/program
      }
   }
   
   public void stop(){
      if(this.turned_on){
         if(this.is_washing == false){
            this.switch_off();
         }
         else{
            System.out.println("Washing machine is still washing.");
         }
      }
      else{
         System.out.println("Washing machine is alreasy turner off.");
      }
   }
}
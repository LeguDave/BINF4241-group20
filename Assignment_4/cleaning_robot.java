public class cleaning_robot extends device
{
   //constructor
   public cleaning_robot(){
      this.name="Cleaning Robot";
      this.menu.add("Set timer");
      this.menu.add("Start vacuum cleaner");
      this.menu.add("Check cleaning completion");
      this.menu.add("Check battery status");
      this.menu.add("Check battery charging status");
      this.menu.add("Complete outstanding cleaning");
      this.menu.add("End cleaning and go charge");
   }
   
   //Override
   public void switch_on(){
      System.out.println("you turned me on");
   
   }
   //Override
   public void switch_off(){
      System.out.println("you turned me off");
   }
}
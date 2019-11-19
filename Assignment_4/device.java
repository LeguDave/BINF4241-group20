import java.util.ArrayList;
import java.util.Arrays;


public class device
{
   ArrayList<String> menu = new ArrayList<>(Arrays.asList("Switch on"));
   String name="";
   boolean turned_on=false;
   
   public device(){
      
   }

   public ArrayList get_menu(){
      return this.menu;
   }
   
   public void print_menu(){
      System.out.println("This is the menu of the device "+name);
      for (int i = 0; i < this.menu.size(); i++){
         System.out.print("Button "+i+": ");
			System.out.println(this.menu.get(i));
		}
      System.out.println("\n");
   }
   
   public void switch_on(){
   
   }
   public void switch_off(){
   
   }

}

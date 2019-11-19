import java.util.ArrayList;


public class smartphone
{
   private device current_device=null;

   public smartphone(){
   
   }
   
   public void choose_device(device chosen){
      this.current_device=chosen;
      chosen.print_menu();;
   }
   	
}
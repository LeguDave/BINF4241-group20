import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class user
{
   ArrayList<device> devices = new ArrayList<>();
   
   public user(){ 
      smartphone smartphone=new smartphone();
      device cool_microwave=new microwave();
      devices.add(cool_microwave);
      this.print_devices();
      Scanner in = new Scanner(System.in);
      int input = Integer.parseInt(in.nextLine().trim());
      
      smartphone.choose_device(devices.get(input));
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

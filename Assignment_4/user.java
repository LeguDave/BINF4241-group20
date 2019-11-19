import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class user
{
   ArrayList<device> devices = new ArrayList<>();
   
   public user(){ 
      //create instances
      smartphone smartphone=new smartphone();
      device cool_microwave=new microwave();
      devices.add(cool_microwave);
      //print
      this.print_devices();
      //get user input
      Scanner in = new Scanner(System.in);
      int input = Integer.parseInt(in.nextLine().trim());
      //chose device based on input
      smartphone.choose_device(devices.get(input));
      //get user input
      while(1==1){
         Scanner in2 = new Scanner(System.in);
         int input2 = Integer.parseInt(in2.nextLine().trim());
         smartphone.press(input2);
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class user
{
   
   public user(){ 
      //create instance
      smartphone smartphone=new smartphone();
      //print
      smartphone.print_devices();
      //get user input
      Scanner in = new Scanner(System.in);
      int input = Integer.parseInt(in.nextLine().trim());
      //chose device based on input
      smartphone.choose_device(smartphone.devices.get(input));
      //get user input
      
      
      while(1==1){
         Scanner in2 = new Scanner(System.in);
3

1         smartphone.press(input2);
      }
      
   }
   
   
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class user
{
   
   public user(){ 
      //create instance
      smartphone smartphone=new smartphone();
   
      int input;
      int input2;
      
      while(1==1){
         //print devices
         smartphone.print_devices();
         //get user input
         Scanner in = new Scanner(System.in);
         input = Integer.parseInt(in.nextLine().trim());
         //chose device based on input
         smartphone.choose_device(smartphone.devices.get(input));
         //get user input
         while(1==1){
            Scanner in2 = new Scanner(System.in);
            input2 = Integer.parseInt(in2.nextLine().trim());
            if(input2==-1){
               break;
            }
            smartphone.press(input2);
         }
      }
      
      
      
   }
   
   
}

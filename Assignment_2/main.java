public class main
{

   public static void main(String args[]){ 
      player b=new player(false);
      player w=new player(true); 
      gameboard test= new gameboard(w,b);
      
      test.print();

      while (1==1){
         System.out.println("White it's your turn!");
         w.move(test);
         test.print();
         System.out.println("Black it's your turn!");
         b.move(test);
         test.print();
      }

      
        
   }
}
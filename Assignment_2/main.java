public class main
{

   public static void main(String args[]){ 
      player b=new player(false);
      player w=new player(true); 
      gameboard gameboard= new gameboard(w,b);
      gameboard.print();
      while (1==1){
         System.out.println("White it's your turn!");
         w.move(gameboard);
         gameboard.print();
         System.out.println("Black it's your turn!");
         b.move(gameboard);
         gameboard.print();
      }  
   }
}


//unfinished: extra regeln, checkmate, finish condition
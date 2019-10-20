public class game
{

   public void run_game(){ 
      player b=new player(false);
      player w=new player(true); 
      gameboard gameboard= new gameboard(w,b);
      gameboard.print();
      while (has_king(w)&&has_king(b)){
         System.out.println("White it's your turn!");
         w.move(gameboard, b);
         gameboard.print();
         System.out.println("Black it's your turn!");
         b.move(gameboard, w);
         gameboard.print();
      }
      if(has_king(w)){
         System.out.println("GAME OVER, white player has won!");
      } 
      else{
         System.out.println("GAME OVER, black player has won!");      
      } 
   }
   public boolean has_king(player player){
      for(piece piece : player.pieces){
        if(piece instanceof king){
            return true;
        }
      }
      return false;
   }
}

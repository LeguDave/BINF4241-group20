public class pawn extends piece{

   //constructor
	public pawn(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="P";
	}
   public boolean is_legal (gameboard gameboard, String aim){
      String next_position;
      if(this.white){
         next_position=gameboard.up(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
         if(next_position.equals(aim)){return true;}
         if(gameboard.is_row(this.position)){
            next_position=gameboard.up(next_position);
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position.equals(aim)){return true;}
         }
         next_position=gameboard.up_right(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white==false){return true;}
         next_position=gameboard.up_left(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white==false){return true;}
      }
      else{
         next_position=gameboard.down(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
         if(next_position.equals(aim)){return true;}
         if(gameboard.is_row(this.position)){
            next_position=gameboard.down(next_position);
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position.equals(aim)){return true;}
         }
         next_position=gameboard.down_right(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white){return true;}
         next_position=gameboard.down_left(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white){return true;}
      }
      return false;
   }
   
   public boolean check(gameboard gameboard){
      if(this.white){
         String atk=gameboard.up_right(this.position);
         if(gameboard.is_occupied(atk) && gameboard.get_piece(atk).white!=this.white && gameboard.get_piece(atk).rank!="K"){
            return true;
         }
         atk=gameboard.up_left(this.position);
         if(gameboard.is_occupied(atk) && gameboard.get_piece(atk).white!=this.white && gameboard.get_piece(atk).rank!="K"){
            return true;
         }
      }   
      else{
         String atk=gameboard.down_right(this.position);
         if(gameboard.is_occupied(atk) && gameboard.get_piece(atk).white!=this.white && gameboard.get_piece(atk).rank!="K"){
            return true;
         }
         atk=gameboard.down_left(this.position);
         if(gameboard.is_occupied(atk) && gameboard.get_piece(atk).white!=this.white && gameboard.get_piece(atk).rank!="K"){
            return true;
         }
      }
      return false;
   }
   
   
   
   
}
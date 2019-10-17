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
         if(next_position==aim){return true;}
         next_position=gameboard.up(next_position);
         if(is_row(this.position)){
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position==aim){return true;}
         }
         next_position=gameboard.up_right(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white==false){return true;}
         next_position=gameboard.up_left(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white==false){return true;}
      }
      else{
         next_position=gameboard.down(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
         if(next_position==aim){return true;}
         next_position=gameboard.down(next_position);
         if(is_row(this.position)){
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position==aim){return true;}
         }
         next_position=gameboard.down_right(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white){return true;}
         next_position=gameboard.down_left(this.position);
         if(next_position==""){return false;}
         else if(gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white){return true;}
      }
      return false;
   }
}
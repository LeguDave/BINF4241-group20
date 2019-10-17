public class pawn extends piece{

   //constructor
	public pawn(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="P";
	}
   /*
   public boolean is_legal (gameboard gameboard, String aim){
      String next_position;
      if(this.white){
         next_position=gameboard.up(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return False;}
         else{return True;}
         next_position=gameboard.up(next_position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return False;}
         else{return True;}
         next_position=gameboard.up_right(this.position);
         if(next_position==""){return False;}
         else if{gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white==False){return True;}
         next_position=gameboard.up_left(this.position);
         if(next_position==""){return False;}
         else if{gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white==False){return True;}
      }
      else{
         next_position=gameboard.down(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return False;}
         else{return True;}
         next_position=gameboard.down(next_position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return False;}
         else{return True;}
         next_position=gameboard.down_right(this.position);
         if(next_position==""){return False;}
         else if{gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white){return True;}
         next_position=gameboard.down_left(this.position);
         if(next_position==""){return False;}
         else if{gameboard.is_occupied(next_position} && gameboard.get_piece(next_position).white){return True;}
      }
      return False;
      
   }*/
}
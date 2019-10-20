public class pawn extends piece{
   
   //constructor
	public pawn(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="P";
      this.en_passant=false;
      this.passant_killer=false;
	}
   //check whether the inputs are legal in context with this piece
   public boolean is_legal (gameboard gameboard, String aim){
      String next_position;
      String passant;
      if(this.white){
         next_position=gameboard.up(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
         if(next_position.equals(aim)){return true;}
         if(gameboard.is_row(this.position)){
            next_position=gameboard.up(next_position);
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position.equals(aim)){
               this.en_passant=true;
               return true;
            }
         }
         next_position=gameboard.up_right(this.position);
         passant=gameboard.right(this.position);
         if(next_position==""){return false;}
         if(next_position.equals(aim)){
            if(gameboard.is_occupied(next_position)==false && gameboard.is_occupied(passant) && gameboard.get_piece(passant).white!=this.white){
               this.passant_killer=true;
               return true;
            }
            else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white!=this.white){return true;}
         }
         next_position=gameboard.up_left(this.position);
         passant=gameboard.left(this.position);
         if(next_position==""){return false;}
         if(next_position.equals(aim)){
            if(gameboard.is_occupied(next_position)==false && gameboard.is_occupied(passant) && gameboard.get_piece(passant).white!=this.white){
               this.passant_killer=true;
               return true;
            }
            else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white!=this.white){return true;}
         }
      }
      else{
         next_position=gameboard.down(this.position);
         if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
         if(next_position.equals(aim)){return true;}
         if(gameboard.is_row(this.position)){
            next_position=gameboard.down(next_position);
            if(next_position=="" || gameboard.is_occupied(next_position)){return false;}
            if(next_position.equals(aim)){
               this.en_passant=true;
               return true;
            }         
         }
         next_position=gameboard.down_right(this.position);
         passant=gameboard.right(this.position);
         if(next_position==""){return false;}
         if(next_position.equals(aim)){
            if(gameboard.is_occupied(next_position)==false && gameboard.is_occupied(passant) && gameboard.get_piece(passant).white!=this.white){
               this.passant_killer=true;
               return true;
            }
            else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white!=this.white){return true;}
         }
         next_position=gameboard.down_left(this.position);
         passant=gameboard.left(this.position);
         if(next_position==""){return false;}
         if(next_position.equals(aim)){
            if(gameboard.is_occupied(next_position)==false && gameboard.is_occupied(passant) && gameboard.get_piece(passant).white!=this.white){
               this.passant_killer=true;
               return true;
            }
            else if(gameboard.is_occupied(next_position) && gameboard.get_piece(next_position).white!=this.white){return true;}
         }
      }
      return false;
   }
   //check whether this piece can attack enemy king in next turn or not
   public boolean check(gameboard gameboard){
      String atk="";
      if(this.white){
         atk=gameboard.up_right(this.position);
         if(atk!=""){
            if(gameboard.is_occupied(atk) && (gameboard.get_piece(atk)).white!=this.white && gameboard.get_piece(atk).rank!="K"){
               return true;
            }
         }
         atk=gameboard.up_left(this.position);
         if(atk!=""){
            if(gameboard.is_occupied(atk) && (gameboard.get_piece(atk)).white!=this.white && gameboard.get_piece(atk).rank!="K"){
               return true;
            }
         }
      }
      else{
         atk=gameboard.down_right(this.position);
         if(atk!=""){
            if(gameboard.is_occupied(atk) && (gameboard.get_piece(atk)).white!=this.white && gameboard.get_piece(atk).rank!="K"){
               return true;
            }
         }
         atk=gameboard.down_left(this.position);
         if(atk!=""){
            if(gameboard.is_occupied(atk) && (gameboard.get_piece(atk)).white!=this.white && gameboard.get_piece(atk).rank!="K"){
               return true;
            }
         }
      }
      return false;
   }
}
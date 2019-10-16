public class queen extends piece{

   //constructor
	public queen(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="Q";
	}
   
   public boolean is_legal (gameboard gameboard, String aim){
      int direction=8;
      boolean is_valid;
      String next_position;
      
      while(direction>0){
         if(direction==8){
            next_position=gameboard.up(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.up(next_position);
            }
            next_position=gameboard.up(temporary_position);
         }
         else if(direction==7){
            next_position=gameboard.up_right(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.up_right(next_position);
            }
            next_position=gameboard.up_right(temporary_position);
         }
         else if(direction==6){
            next_position=gameboard.right(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.right(next_position);
            }
            next_position=gameboard.right(temporary_position);
         }
         else if(direction==5){
            next_position=gameboard.down_right(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.down_right(next_position);
            }
            next_position=gameboard.down_right(temporary_position);
         }
         else if(direction==4){
            next_position=gameboard.down(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.down(next_position);
            }
            next_position=gameboard.down(temporary_position);
         }
         else if(direction==3){
            next_position=gameboard.down_left(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.down_left(next_position);
            }
            next_position=gameboard.down_left(temporary_position);
         }
         else if(direction==2){
            next_position=gameboard.left(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.left(next_position);
            }
            next_position=gameboard.left(temporary_position);
         }
         else if(direction==1){
            next_position=gameboard.up_left(temporary_position);
            //iterate in a direction until a piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.up_left(next_position);
            }
            next_position=gameboard.up_left(temporary_position);
            
         }
         //check if wall is found
         if(next_position==""){
            direction-=1;
            continue;
         }
         //check if aim field is found
         if(next_position==aim){
            //is aim field occupied by an own piece?
            if(gameboard.is_occupied(next_position) & gameboard.get_piece(next_position).white==this.white){
               direction-=1;
               continue;
            }
            return True;
         }
         direction-=1;
         continue;
      }
      return is_valid;
   }
}
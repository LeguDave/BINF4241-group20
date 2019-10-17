public  class tower extends piece
{

   //constructor
	public tower(String position, boolean colour) 
	{ 
		this.position=position;
      this.white=colour;
      this.rank="T";
	}
   public boolean is_legal (gameboard gameboard, String aim){
      int direction=4;
      String next_position;
      
      while(direction>0){
         direction-=1;
         // here we search for the aim field in all the possible moves the tower can make
         
         //north
         if(direction==3){
            next_position=gameboard.up(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && next_position!=aim){
               next_position=gameboard.up(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //east
         else if(direction==2){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && next_position!=aim){
               next_position=gameboard.right(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //south
         else if(direction==1){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && next_position!=aim){
               next_position=gameboard.down(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //west
         else if(direction==0){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && next_position!=aim){
               next_position=gameboard.left(next_position);
               if(next_position==""){continue;}
            }
         }
         
         
         //for returning True we need either the aim field to be unoccupied or the aim field to be occupied by an enemy piece
         if(next_position==""){continue;}
         //check if aim field is found
         if(next_position==aim){
            //is aim field occupied?
            if(gameboard.is_occupied(next_position)==true){
               if(gameboard.get_piece(next_position).white!=this.white){
                  return true;
               }
               else{
                  continue;
               }
            }
            //empty aim field is always legal to move on
            return true;
         }
      }
      return false;
   }

}
public class king extends piece{

   //constructor
	public king(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="K";
	}
   public boolean is_legal (gameboard gameboard, String aim){
      int direction=8;
      String next_position;
      
      while(direction>0){
         direction-=1;
         // here we search for the aim field in all the possible moves the king can make
         
         //north
         if(direction==7){
            next_position=gameboard.up(this.position);
            if(next_position==""){continue;}
         }
         
         //north east
         else if(direction==6){
            next_position=gameboard.up_right(this.position);
            if(next_position==""){continue;}
         }
         
         //east
         else if(direction==5){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
         }
         
         //south east
         else if(direction==4){
            next_position=gameboard.down_right(this.position);
            if(next_position==""){continue;}
         }
         
         //south
         else if(direction==3){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
         }
         
         //south west
         else if(direction==2){
            next_position=gameboard.down_left(this.position);
            if(next_position==""){continue;}
         }
         
         //west
         else if(direction==1){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
         }
         
         //north west
         else if(direction==0){
            next_position=gameboard.up_left(this.position);
            if(next_position==""){continue;}
         }
         
         //for returning True we need either the aim field to be unoccupied or the aim field to be occupied by an enemy piece
         
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
   }*/

}
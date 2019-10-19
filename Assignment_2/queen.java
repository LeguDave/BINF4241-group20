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
      String next_position="";
      
      while(direction>0){
         direction-=1;
         // here we search for the aim field in all the possible moves the queen can make
         
         //north
         if(direction==7){
            next_position=gameboard.up(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.up(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //north east
         else if(direction==6){
            next_position=gameboard.up_right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.up_right(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //east
         else if(direction==5){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.right(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //south east
         else if(direction==4){
            next_position=gameboard.down_right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.down_right(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //south
         else if(direction==3){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.down(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //south west
         else if(direction==2){
            next_position=gameboard.down_left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.down_left(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //west
         else if(direction==1){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.left(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //north west
         else if(direction==0){
            next_position=gameboard.up_left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false && (true != next_position.equals(aim))){
               next_position=gameboard.up_left(next_position);
               if(next_position==""){continue;}
            }
         }
         
         //for returning True we need either the aim field to be unoccupied or the aim field to be occupied by an enemy piece
         
         if(next_position==""){continue;}
         //check if aim field is found
         if(next_position.equals(aim)){
            //is aim field occupied?
            if(gameboard.is_occupied(next_position)==true){
               if(gameboard.get_piece(next_position).white!=this.white){
                  return true;
               }
               else{
                  return false;
               }
            }
            else{
               return true;
            }
         }
      }
      return false;
   }
   
   
   public boolean check(gameboard gameboard){
      int direction=8;
      String next_position="";
      while(direction>0){
         direction-=1;
         // here we search for the enemy king in all the possible moves the tower can make
         
         //north
         if(direction==7){
            next_position=gameboard.up(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.up(next_position);
            }
         }
         
         //east
         else if(direction==6){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.right(next_position);
            }
         }
         
         //south
         else if(direction==5){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.down(next_position);
            }
         }
         
         //west
         else if(direction==4){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.left(next_position);
            }
         }
         
         //north east
         if(direction==3){
            next_position=gameboard.up_right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.up_right(next_position);
            }
         }
         
         //east south
         else if(direction==2){
            next_position=gameboard.down_right(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.down_right(next_position);
            }
         }
         
         //south west
         else if(direction==1){
            next_position=gameboard.down_left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.down_left(next_position);
            }
         }
         
         //north west
         else if(direction==0){
            next_position=gameboard.up_left(this.position);
            if(next_position==""){continue;}
            while(gameboard.is_occupied(next_position)==false){
               next_position=gameboard.up_left(next_position);
            }
         }

         
         if(next_position==""){
            continue;
         }
         if(gameboard.get_piece(next_position).rank=="K" && gameboard.get_piece(next_position).white!=this.white){
            return true;
         }
      }
      return false;   
   }
}
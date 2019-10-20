public class horse extends piece{

   //constructor
	public horse(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="H";
	}
   
   //check whether the inputs are legal in context with this figure and its position
   public boolean is_legal (gameboard gameboard, String aim){
      int direction=8;
      String next_position="";
      while(direction>0){
         direction-=1;
         if(direction==7){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==6){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==5){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
         }
         if(direction==4){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
         }
         if(direction==3){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
         }
         if(direction==2){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
         }
         if(direction==1){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==0){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(next_position==""){
            continue;
         }
         //check if horse moves to aim field
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
   //check whether this piece can attack enemy king in next turn   
   public boolean check(gameboard gameboard){
      int direction=8;
      String next_position="";
      while(direction>0){
         direction-=1;
         if(direction==7){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==6){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==5){
            next_position=gameboard.right(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
         }
         if(direction==4){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.right(next_position);
            if(next_position==""){continue;}
         }
         if(direction==3){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.down(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
         }
         if(direction==2){
            next_position=gameboard.down(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
         }
         if(direction==1){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.left(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==0){
            next_position=gameboard.left(this.position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
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
public class horse extends piece{

   //constructor
	public horse(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="H";
	}
   
   public boolean is_legal (gameboard gameboard, String aim){
      int direction=8;
      String next_position;
      int upper=0;
      
      while(directions>upper){
         direction-=1;
         
         if(direction==7){
            next_position=gameboard.right(this.position);
            if(next_position==""){direction-=3;continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){upper=2;continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){upper=1;continue;}
         }
         if(direction==6){
            next_position=gameboard.right(this.position);
            next_position=gameboard.right(next_position);
            if(next_position==""){direction-=-1;continue;}
            next_position=gameboard.up(next_position);
            if(next_position==""){continue;}
         }
         if(direction==5){
            next_position=gameboard.right(this.position);
            next_position=gameboard.right(next_position);
            next_position=gameboard.down(next_position);
            if(next_position==""){direction-=3;continue;}
         }
         if(direction==4){
            next_position=gameboard.down(this.position);
            next_position=gameboard.down(next_position);
            if(next_position==""){direction-=-1;continue;}
            next_position=gameboard.right(next_position);
         }
         if(direction==3){
            next_position=gameboard.down(this.position);
            next_position=gameboard.down(next_position);
            next_position=gameboard.left(next_position);
            if(next_position==""){direction-=-3;continue;}
         }
         if(direction==2){
            next_position=gameboard.down(this.position);
            next_position=gameboard.left(next_position);
            next_position=gameboard.left(next_position);
            if(next_position==""){direction-=-1;continue;}
         }
         if(direction==1){
            next_position=gameboard.left(this.position);
            next_position=gameboard.left(next_position);
            next_position=gameboard.up(next_position);
         }
         if(direction==0){
            next_position=gameboard.left(this.position);
            next_position=gameboard.up(next_position);
            next_position=gameboard.up(next_position);
         }
      
      }//while loop end
      
    
      //check if horse moves to aim field
      if(next_position.equals(aim)){
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
      return false;
   }
}
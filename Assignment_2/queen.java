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
            //iterate in a direction until piece, a wall or aim field is found
            while(gameboard.is_occupied(next_position)==False & next_position!="" & next_position!=aim){
               next_position=gameboard.up(next_position);
            }
            //check if wall is found
            if(next_position==""){
               continue;
            }
            //check if aim field is found
            
                //check if aim field is occipied
            
                   //if occupied check if friendly piece --> continue
                   //else DESTROY THE CHILD and return true
                   
                //return true
                
            //continue because a found enemy cannot be killed if the aim is not the enemies field
         else if(direction==7){
         //lööp
         }
         else if(direction==6){
         //lööp
         }
         else if(direction==5){
         //lööp
         }
         else if(direction==4){
         //lööp
         }
         else if(direction==3){
         //lööp
         }
         else if(direction==2){
         //lööp
         }
         else if(direction==1){
         //lööp
         }
         direction-=1;
      }
      return is_valid;
   }
}
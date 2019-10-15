public class pawn extends piece{

   //constructor
	public pawn(String position, String colour) 
	{ 
		this.position = position;
		this.colour=colour;
		this.rank="pawn";
	}
   
   public boolean is_legal (String aim){
      boolean is_valid=False;
      //loop through all directions until aim is found
      //if aim is not found return false, if found return true
      return is_valid;
   }
}
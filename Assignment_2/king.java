public class king extends piece{

   //constructor
	public king(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="K";
	}
   
   public boolean is_legal (String aim){
      boolean is_valid=False;
      //loop through all directions until aim is found
      //if aim is not found return false, if found return true
      return is_valid;
   }
}
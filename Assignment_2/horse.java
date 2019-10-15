public class horse extends piece{

   //constructor
	public horse(String position, boolean colour) 
	{ 
		this.position = position;
		this.white=colour;
		this.rank="H";
	}
   
   public boolean is_legal (String aim){
      boolean is_valid=False;
      //loop through all directions until aim is found
      //if aim is not found return false, if found return true
      return is_valid;
   }
}
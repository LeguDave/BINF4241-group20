public class square
{
   boolean white;
   String coordinates;
   boolean occupied;
   piece occupied_by;
   

   //constructor of the class game
	public square(String coordinates,boolean white) 
	{ 
      this.coordinates=coordinates;
      this.white=white;
      this.occupied=false;
	}
   
   //print a square
   public void print()
   {
      System.out.print("[");
      if(this.occupied){
         if(this.occupied_by.white){
            System.out.print("W");
         }
         else{
            System.out.print("B");
         }
         
         System.out.print(this.occupied_by.rank);
      }
      else{
         System.out.print("  ");
      }
      System.out.print("]");

   }
   
   
   
}
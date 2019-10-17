public class square
{
   boolean white;
   //columns a-h, rows 1-8
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
   
   //function to add players
   public void print()
   {
      System.out.print("[");
      if(this.occupied){
         if(this.occupied_by.white){
            System.out.print("w");
         }
         else{
            System.out.print("b");
         }
         
         System.out.print(this.occupied_by.rank);
      }
      else{
         System.out.print("  ");
      }
      System.out.print("]");

   }
   
   
   
}
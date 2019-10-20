public class piece
{
   //important for en passant for pawns
   boolean en_passant=false;
   boolean passant_killer=false;
   //standard properties of any piece
	boolean white;
   String position;
   String rank;
   
   
   //here are three get methods, it is ok because the strings are returned by value and not by reference
   public String get_position(){
      String a=this.position;
      return a;
   }
   
   public String get_rank(){
      String b=this.rank;
      return b;
   }
   
   public boolean get_colour(){
      boolean c=this.white;
      return c;
   }
   public boolean is_legal(gameboard gameboard, String aim){
      return true;
   }
   public boolean check(gameboard gameboard){
      return true;
   }
}








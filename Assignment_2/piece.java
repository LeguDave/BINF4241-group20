public class piece
{
   //standard properties of any piece
	String colour;
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
   
   public String get_colour(){
      String c=this.colour;
      return c;
   }
}








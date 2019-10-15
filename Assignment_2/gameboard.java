

public class gameboard
{
   square field[][]=new square[8][8];

   //constructor of the class game
	public gameboard() 
	{  
      int i=0;
      while (i<8){
         int j=0;
         if(i%2==0){
            while(j<8){
               if(j%2==0){
                  this.field[i][j]=new square(i2c(i,j),true);
               }
               else{
                  this.field[i][j]=new square(i2c(i,j),false);
               }
               j+=1;
            }
         }
         else{
            while(j<8){
               if(j%2==0){
                  this.field[i][j]=new square(i2c(i,j),false);
               }
               else{
                  this.field[i][j]=new square(i2c(i,j),true);
               }
               j+=1;
            }
         }
         
         i+=1;
      }
		
	}
   
   //parse coordinates to integers
   public int[] c2i(String coordinates)
   {
      int indexes[]={0,0};
		char[] chars = coordinates.toCharArray();
      indexes[0]=-1*(Character.getNumericValue(chars[1])-8);
      indexes[1]=Character.getNumericValue(chars[0])-10;
      return indexes;		
   }
   //parse integers to coordinates
   public String i2c(int i, int j){
      String coordinates="";
      coordinates+=(char)(j+97);
      coordinates+=(char)((-1*(i-8))+48);
      return coordinates;
   }
   
   public void print(){
      int i=0;
      while (i<8){
         int j=0;
         while(j<8){
            this.field[i][j].print();
            j+=1;
         }
         System.out.println("\n");
         i+=1;
      }
   }
   
   public boolean is_occupied(String coordinates){
   //return if square is occupied
      boolean res;
      return res;
   }
   public boolean is_valid_piece(String coordinates, boolean white_player){
   //same color as player?
   //empty square? square coordinates not valid?
      boolean res;
      return res;
   }
   public piece get_piece(String coordinates){
   //return piece object on coordinates
      piece res;
      return res;
   }
   public void free_square(String coordinates){
   //unoccupy a square
   }
   public void occupy_square(String coordinates, piece piece){
   //occupy a square with piece object
   }
   //get adjacent squares
   public String up(String coordinates){
      String res;
      return res;
   }
   public String down(String coordinates){
      String res;
      return res;
   }
   public String left(String coordinates){
      String res;
      return res;
   }
   public String right(String coordinates){
      String res;
      return res;
   }
   public up_right(String coordinates){
      String res;
      return res;
   }
   public String up_left(String coordinates){
      String res;
      return res;
   }
   public String down_right(String coordinates){
      String res;
      return res;
   }
   public String down_left(String coordinates){
      String res;
      return res;
   }
   public square get_square(String coordinates){
      square res;
      return res;
   }
  
}

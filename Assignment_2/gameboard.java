

public class gameboard
{
   square field[][]=new square[8][8];

   //constructor of the class game
	public gameboard(player w, player b) 
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
      
      //creating the initial board state
      pawn pawn_b_1=new pawn("a7",false);
      occupy_square("a7", pawn_b_1);
      b.pieces.add(pawn_b_1);
      
      pawn pawn_b_2=new pawn("b7",false);
      occupy_square("b7", pawn_b_2);
      b.pieces.add(pawn_b_2);
      
      pawn pawn_b_3=new pawn("c7",false);
      occupy_square("c7", pawn_b_3);
      b.pieces.add(pawn_b_3);
      
      pawn pawn_b_4=new pawn("d7",false);
      occupy_square("d7", pawn_b_4);
      b.pieces.add(pawn_b_4);
      
      pawn pawn_b_5=new pawn("e7",false);
      occupy_square("e7", pawn_b_5);
      b.pieces.add(pawn_b_5);
      
      pawn pawn_b_6=new pawn("f7",false);
      occupy_square("f7", pawn_b_6);
      b.pieces.add(pawn_b_6);
      
      pawn pawn_b_7=new pawn("g7",false);
      occupy_square("g7", pawn_b_7);
      b.pieces.add(pawn_b_7);
      
      pawn pawn_b_8=new pawn("h7",false);
      occupy_square("h7", pawn_b_8);
      b.pieces.add(pawn_b_8);
      
      tower tower_b_1=new tower("a8",false);
      occupy_square("a8", tower_b_1);
      b.pieces.add(tower_b_1);
      
      tower tower_b_2=new tower("h8",false);
      occupy_square("h8", tower_b_2);
      b.pieces.add(tower_b_2);
      
      horse horse_b_1=new horse("b8",false);
      occupy_square("b8", horse_b_1);
      b.pieces.add(tower_b_1);
      
      horse horse_b_2=new horse("g8",false);
      occupy_square("g8", horse_b_2);
      b.pieces.add(horse_b_2);      
      
      runner runner_b_1=new runner("c8",false);
      occupy_square("c8", runner_b_1);
      b.pieces.add(runner_b_1);
      
      runner runner_b_2=new runner("f8",false);
      occupy_square("f8", runner_b_2);
      b.pieces.add(runner_b_2);
      
      queen queen_b=new queen("e8",false);
      occupy_square("e8", queen_b);
      b.pieces.add(queen_b);
      
      king king_b=new king("d8",false);
      occupy_square("d8", king_b);
      b.pieces.add(king_b);      
      
      //create white pieces
      pawn pawn_w_1=new pawn("a2",true);
      occupy_square("a2", pawn_w_1);
      w.pieces.add(pawn_w_1);
      
      pawn pawn_w_2=new pawn("b2",true);
      occupy_square("b2", pawn_w_2);
      w.pieces.add(pawn_w_2);
      
      pawn pawn_w_3=new pawn("c2",true);
      occupy_square("c2", pawn_w_3);
      w.pieces.add(pawn_w_3);
      
      pawn pawn_w_4=new pawn("d2",true);
      occupy_square("d2", pawn_w_4);
      w.pieces.add(pawn_w_4);
      
      pawn pawn_w_5=new pawn("e2",true);
      occupy_square("e2", pawn_w_5);
      w.pieces.add(pawn_w_5);
      
      pawn pawn_w_6=new pawn("f2",true);
      occupy_square("f2", pawn_w_6);
      w.pieces.add(pawn_w_6);
      
      pawn pawn_w_7=new pawn("g2",true);
      occupy_square("g2", pawn_w_7);
      w.pieces.add(pawn_w_7);
      
      pawn pawn_w_8=new pawn("h2",true);
      occupy_square("h2", pawn_w_8);
      w.pieces.add(pawn_w_8);
      
      tower tower_w_1=new tower("a1",true);
      occupy_square("a1", tower_w_1);
      w.pieces.add(tower_w_1);
      
      tower tower_w_2=new tower("h1",true);
      occupy_square("h1", tower_w_2);
      w.pieces.add(tower_w_2);
      
      horse horse_w_1=new horse("b1",true);
      occupy_square("b1", horse_w_1);
      w.pieces.add(tower_w_1);
      
      horse horse_w_2=new horse("g1",true);
      occupy_square("g1", horse_w_2);
      w.pieces.add(horse_w_2);      
      
      runner runner_w_1=new runner("c1",true);
      occupy_square("c1", runner_w_1);
      w.pieces.add(runner_w_1);
      
      runner runner_w_2=new runner("f1",true);
      occupy_square("f1", runner_w_2);
      w.pieces.add(runner_w_2);
      
      queen queen_w=new queen("e1",true);
      occupy_square("e1", queen_w);
      w.pieces.add(queen_w);
      
      king king_w=new king("d1",true);
      occupy_square("d1", king_w);
      w.pieces.add(king_w);
	
	}
   
   
   //parse coordinates to integers
   public int[] c2i(String coordinates)
   {
      int[] indexes=new int[]{0,0};
		char[] chars = coordinates.toCharArray();
      //System.out.println("char array:"+chars[0]+" "+chars[1]);
      indexes[0]=(-1)*(Character.getNumericValue(chars[1])-8);
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
   //print board state
   public void print(){
      int i=0;
      System.out.println("    a   b   c   d   e   f   g   h");

      while (i<8){
         System.out.print(-1*(i-8)+" ");
         int j=0;
         while(j<8){
            this.field[i][j].print();
            j+=1;
         }
         System.out.println("\n");
         i+=1;
      }
   }
   public void kill(String coordinates, player player){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      square square=this.field[i][j];
      piece piece=get_piece(coordinates);
      square.occupied=false;
      square.occupied_by=null;
      player.pieces.remove(piece);
      piece=null;
   }
   
   public boolean is_occupied(String coordinates){
   //return if square is occupied
      if(coordinates==""){
         return true;
      }
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      
      square test_this=this.field[i][j];
      if (test_this.occupied){
         return true;
      }
      else{
         return false;
      }      
   }
   public boolean is_valid_piece(String coordinates, boolean white_player){
   //same color as player?
   //empty square? square coordinates not valid?
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i,j)==false){
         return false;
      }
      if(this.field[i][j].occupied==false){
         return false;
      }
      piece test_this=this.field[i][j].occupied_by;
      if(test_this.white==white_player){
         if(is_valid_coordinates(i,j)){
            return true;
         }
         else{
            return false;
         }
      }
      else{
         return false;
      }

   }
   public boolean is_valid_coordinates(int i, int j){
      if (i<8 && i>=0 && j<8 && j>=0){
         return true;
      }
      return false;
   }
   
   public square get_square(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      return this.field[i][j];
   }
   
   public piece get_piece(String coordinates){
   //return piece object on coordinates
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      square test_this=this.field[i][j];
      return test_this.occupied_by;
   }
   public void free_square(String coordinates){
   //unoccupy a square
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      square test_this=this.field[i][j];
      test_this.occupied=false;
      test_this.occupied_by=null;
   }
   public void occupy_square(String coordinates, piece piece){
   //occupy a square with piece object
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      square test_this=this.field[i][j];
      test_this.occupied=true;
      test_this.occupied_by=piece;
   }
   //get adjacent squares
   
   public String up(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i-1,j)){
         return i2c(i-1,j);
      }
      return "";
   }
   public String down(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i+1,j)){
         return i2c(i+1,j);
      }
      return "";
   }
   public String left(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i,j-1)){
         return i2c(i,j-1);
      }
      return "";
   }
   public String right(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i,j+1)){
         return i2c(i,j+1);
      }
      return "";
   }
   public String up_right(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i-1,j+1)){
         return i2c(i-1,j+1);
      }
      return "";
   }
   public String up_left(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i-1,j-1)){
         return i2c(i-1,j-1);
      }
      return "";
   }
   public String down_right(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i+1,j+1)){
         return i2c(i+1,j+1);
      }
      return "";
   }
   public String down_left(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      if(is_valid_coordinates(i+1,j-1)){
         return i2c(i+1,j-1);
      }
      return "";
   }
   public boolean is_row(String coordinates){
      int i=c2i(coordinates)[0];
      int j=c2i(coordinates)[1];
      boolean pawn_white=this.get_piece(coordinates).white;
      if(i==6 && pawn_white){
         return true;
      }
      if(i==1 && pawn_white==false){
         return true;
      }
      return false;
      
   }
 
}

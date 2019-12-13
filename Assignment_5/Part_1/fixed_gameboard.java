import java.util.Random;

public class fixed_gameboard
{
	int squares=6;
	square[] field;
   
   //generate gameboard with fixed squares for testing
   /*
   1 start_square
 2 ladder_square
 --> +2
 3 normal_square
 4 normal_square
 5 snake_square
 --> -2
 6 end_square
   */
  
	public fixed_gameboard() 
	{
   
      this.field=new square[squares];
      
      int i=0;
      this.field[i]=new start_square();
      i++;
      this.field[i]=new ladder_square(i+1, 2);
      i++;
      this.field[i]=new normal_square(i+1);
      i++;
      this.field[i]=new normal_square(i+1);
      i++;
      this.field[i]=new snake_square(i+1, 2);
      i++;
      this.field[i]=new end_square(i+1);
      
   }
}
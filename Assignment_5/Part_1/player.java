
public class player
{
	int position;
	String name;
   
   //constructor
	public player(String name) 
	{ 
		this.name = name; 
		this.position = 1; 
	}
   
   //this function moves the player to a different position depending on the die roll
	public void move(int steps, gameboard gameboard) 
	{
      //free the square the player is on before moving
      gameboard.field[this.position-1].occupied = false;
      
      //"underflow" protection
      if(this.position+steps<1)
      {
         this.position = 1;
         return;
      }
      
      
      //"overflow" protection
      if(this.position+steps>gameboard.squares)
      {         
         this.move((((gameboard.squares-this.position)*2)-steps),gameboard);
         return;      
      }
      
      
      //Different cases for different types of squares
      //squares with no moving properties
		if (gameboard.field[this.position+steps-1].type=="snake_square") //checks if snake
      {
         this.position+=steps;
         System.out.println("Oh no, you landed on a snake! \n");
         this.move(((snake_square)(gameboard.field[this.position-1])).steps_back*(-1), gameboard);
         return;
      }
      else if (gameboard.field[this.position+steps-1].type=="ladder_square") //checks if ladder
      {
         this.position+=steps;         
         System.out.println("Good job, you landed on a ladder! \n");
         this.move(((ladder_square)(gameboard.field[this.position-1])).steps_forward, gameboard);
         return;
      }
      else
      {
         this.position+=steps;
      }
      
      
      if (gameboard.field[this.position-1].type=="normal_square"| //checks if normal or endsquare is occupied
               gameboard.field[this.position-1].type=="end_square")
      {
         if(gameboard.field[this.position-1].occupied==true) //if player x lands on another player y, player x returns to field 1
         {
            this.position=1;
            System.out.println("Oh no, you landed on another player! Back to square one! \n");
         }
         else //else the player occupies the field he/she moved on
         {
            gameboard.field[this.position-1].occupied=true;
         }
      }
      
      return;
      
	}
   //added to move on fixed gameboard
   public void move_fixed(int steps, fixed_gameboard gameboard) 
	{
      //free the square the player is on before moving
      gameboard.field[this.position-1].occupied = false;
      
      //"underflow" protection
      if(this.position+steps<1)
      {
         this.position = 1;
         return;
      }
      
      
      //"overflow" protection
      if(this.position+steps>gameboard.squares)
      {         
         this.move_fixed((((gameboard.squares-this.position)*2)-steps),gameboard);
         return;      
      }
      
      
      //Different cases for different types of squares
      //squares with no moving properties
		if (gameboard.field[this.position+steps-1].type=="snake_square") //checks if snake
      {
         this.position+=steps;
         System.out.println("Oh no, you landed on a snake! \n");
         this.move_fixed(((snake_square)(gameboard.field[this.position-1])).steps_back*(-1), gameboard);
         return;
      }
      else if (gameboard.field[this.position+steps-1].type=="ladder_square") //checks if ladder
      {
         this.position+=steps;         
         System.out.println("Good job, you landed on a ladder! \n");
         this.move_fixed(((ladder_square)(gameboard.field[this.position-1])).steps_forward, gameboard);
         return;
      }
      else
      {
         this.position+=steps;
      }
      
      
      if (gameboard.field[this.position-1].type=="normal_square"| //checks if normal or endsquare is occupied
               gameboard.field[this.position-1].type=="end_square")
      {
         if(gameboard.field[this.position-1].occupied==true) //if player x lands on another player y, player x returns to field 1
         {
            this.position=1;
            System.out.println("Oh no, you landed on another player! Back to square one! \n");
         }
         else //else the player occupies the field he/she moved on
         {
            gameboard.field[this.position-1].occupied=true;
         }
      }
      
      return;
      
	}

}

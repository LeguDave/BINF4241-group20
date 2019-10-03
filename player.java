
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
	public String move(int steps, gameboard gameboard) 
	{
      //free the square the player is on before moving
      gameboard.field[this.position].occupied = false;
      
      String message="You left the square "+ gameboard.field[this.position] +"\n";
      
      //"overflow" protection
      if(this.position+steps>gameboard.squares)
      {
         this.position += ((gameboard.squares-this.position)*2)-steps;
         //we have to call move again with step size 0 to check for snakes/ladders after moving
         move(0,gameboard);
         return("You overshoot the end! \n");
      }
      //"underflow" protection
      else if(this.position+steps<1)
      {
         this.position = 1;
         message+=("You went too far back and landed back on square one, what are you doing?! \n");
      }
      
      //Different cases for different types of squares
      //squares with no moving properties
		else if (gameboard.field[this.position+steps].type=="normal_square"|
               gameboard.field[this.position+steps].type=="end_square"|
               gameboard.field[this.position+steps].type=="start_square")
      {
         this.position+=steps;
         message+=("You advance "+ steps + " forward");
      }
      //squares that are the bottom of a ladder
      else if (gameboard.field[this.position+steps].type=="ladder_square")
      {
         this.position+=steps;
         this.position+=((ladder_square)(gameboard.field[this.position])).steps_forward;
         message+=("Good job, you landed on a ladder! \n");
      }
      //squares that are the top of a snake
      else if (gameboard.field[this.position+steps].type=="snake_square")
      {
         this.position+=steps;
         this.position-=((snake_square)(gameboard.field[this.position])).steps_back;
         message+=("Oh no, you landed on a snake! \n");

      }
      
      //after moving the player, it checks if that square is already occupied and occupies it if possible
      if (gameboard.field[this.position].occupied == true)
      {
         this.position = 1;
         message+=("Oh no, you landed on another player! Back to square one! \n");

      }
      else if (gameboard.field[this.position].type != "start_square")
      {
         gameboard.field[this.position].occupied = true;
      }
      return message+"You are now on square "+this.position+"\n";
	}

}

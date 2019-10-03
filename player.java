
public class player
{
	int position;
	String name;

	public player(String name) 
	{ 
		this.name = name; 
		this.position = 1; 
	}
	public void move(int steps, gameboard gameboard) 
	{
      if(this.position+steps>gameboard.squares)
      {
         this.position += steps-(gameboard.squares-this.position)-1;
      }
      if(this.position+steps<1)
      {
         this.position = 1;
      }
		else if (gameboard.field[this.position+steps].type=="normal_square"|gameboard.field[this.position+steps].type=="end_square"|gameboard.field[this.position+steps].type=="start_square")
      {
         this.position+=steps;
      }
      else if (gameboard.field[this.position+steps].type=="ladder_square")
      {
         this.position+=steps;
         this.position+=((ladder_square)(gameboard.field[this.position])).steps_forward;
      }
      else if (gameboard.field[this.position+steps].type=="snake_square")
      {
         this.position+=steps;
         this.position-=((snake_square)(gameboard.field[this.position])).steps_back;
      }
      if (gameboard.field[this.position].occupied == true)
      {
         this.position = 1;
      }
	}

}

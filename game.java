public class game
{
	int number_of_squares;
	int number_of_players;
	boolean win;
	gameboard my_gameboard;

	public game(int number_of_squares, int number_of_players) 
	{ 
		this.number_of_squares = number_of_squares;
		this.number_of_players = number_of_players;
		this.win = false;
		this.my_gameboard=new gameboard(20);
	}
}
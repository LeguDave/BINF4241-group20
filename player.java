public class player
{
	int position;
	string name;

	public player(string name) 
	{ 
		this.name = name; 
		this.position = 1; 
	}
	public void move(int steps) 
	{
		self.position+=steps;
	}

}
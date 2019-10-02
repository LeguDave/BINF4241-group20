public class snake_square
{
	int position;
	int steps_back;
	boolean occupied;

	public snake_square(int position, int steps_back) 
	{ 
		this.position = position;
		this.steps_back = steps_back;
		this.occupied = false;
	}
}
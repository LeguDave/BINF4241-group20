public class snake_square extends square
{
	int steps_back;

	public snake_square(int position, int steps_back) 
	{ 
		this.position = position;
		this.steps_back = steps_back;
		this.occupied = false;
		this.type="snake_square";
	}
}
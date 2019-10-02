public class ladder_square
{
	int position;
	int steps_forward;
	boolean occupied;

	public ladder_square(int position, int steps_forward) 
	{ 
		this.position = position;
		this.steps_forward = steps_forward;
		this.occupied = false;
	}
}
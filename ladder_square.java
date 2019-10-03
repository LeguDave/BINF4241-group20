public class ladder_square extends square
{
	int steps_forward;

	public ladder_square(int position, int steps_forward) 
	{ 
		this.position = position;
		this.steps_forward = steps_forward;
		this.occupied = false;
		this.type="ladder_square";
	}
	
}

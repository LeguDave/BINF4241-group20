public class tower extends piece {
	//constructor
	public tower(String position, boolean colour)
	{
		this.position=position;
		this.colour=colour;
		this.rank = "T";
	}
	//functions here; check if the input
	public boolean is_legal (gameboard gameboard, String aim){
		//check if "aim" occupied and if aimed field is "is legal" for this piece
		int direction = 8;
		boolean is_valid;
		String next_position;

		while (direction > 0) {
			direction -=1;

			if (direction==7) {
				next_position=gameboard.up(this.position);
				if(next_position==""){continue;}
				while(gameboard.is_occupied(next_position)==False & next_position!=aim){
					next_position=gameboard.up(next_position);
					if(next_position==""){continue;}
				}
				next_position=gameboard.up(this.position);
			}

			else if (direction==5) {
				next_position = gameboard.right(this.position);
				if (next_position == "") {continue;}
				while(gameboard.is_occupied(next_position)==False & next_position != aim) {
					next_position = gameboard.right(next_position);
					if (next_position == "") {continue;}
				}
				next_position=gameboard.right(this.position);
			}

			else if (direction==3) {
				next_position = gameboard.down(this.position);
				if (next_position == "") {continue;}
				while(gameboard.is_occupied(next_position)==False & next_position != aim) {
					next_position = gameboard.down(next_position);
					if (next_position == "") {continue;}
				}
				next_position=gameboard.down(this.position);
			}

			else if (direction==1) {
				next_position = gameboard.left(this.position);
				if (next_position == "") {continue;}
				while(gameboard.is_occupied(next_position)==False & next_position != aim) {
					next_position = gameboard.left(next_position);
					if (next_position == "") {continue;}
				}
				next_position=gameboard.left(this.position);
			}
			//is aim field reached?
			//code...
		}

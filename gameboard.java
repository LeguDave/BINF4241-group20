import java.util.Random;

public class gameboard
{
	int squares;
	square[] field;
   //generate map with random snakes/ladders
	public gameboard(int squares) 
	{ 
		this.squares=squares;
      
      //calculate amount A of snake/ladders as data pairs: a=(squares-2)/3
		int A=(squares-2)/3;
      field=new square[squares];
      
      //B is an array filled with positions of the upcoming squares, that we will create
		int[] B=shuffled_array(2,squares-1);
      int indexB=0;
      
		
		//loop through shuffled_array: A times we will take two elements of the array for a data pair
		//we alternately create ladders and snakes with the data pairs and add every time a snake/ladder + a normal square to field
		while(A>0){
         int a;int b;
         if(B[indexB]>B[indexB+1]){
            a=B[indexB+1];
            b=B[indexB];
         }
         else{
            b=B[indexB+1];
            a=B[indexB];
         }         
         if(A%2==1){
            //create snake_square + normal_square
            field[b-1]=new snake_square(b,(b-a));
            field[a-1]=new normal_square(a);
         }
         else{
            //create ladder_square + normal_square
            field[a-1]=new ladder_square(a,(b-a));
            field[b-1]=new normal_square(b);
         }
         indexB=indexB+2;
         A=A-1;
      }
      //then we will loop through the array with step = 1 and then we will assign normal squares to the rest of the positions
      while(indexB<squares-2){
         field[B[indexB]-1]=new normal_square(B[indexB]);
         indexB=indexB+1;
      }
      //create start_square
      field[0]=new start_square();
      
      //create end_square
      field[squares-1]=new end_square(squares);
     
      for(square s: field){
         if(s instanceof snake_square){
            snake_square a=(snake_square)s;
			   System.out.println(a.position + " " + a.type);
            System.out.println("--> -" + a.steps_back);
         }
         else if(s instanceof ladder_square){
            ladder_square a=(ladder_square)s;
            System.out.println(a.position + " " + a.type);
            System.out.println("--> +" + a.steps_forward);
         }
         else
            System.out.println(s.position + " " + s.type);
      }

   }
   
   
   
   
   
   //function that takes two integers as input and returns a shuffled array with all natural numbers between the inputs
	public static int[] shuffled_array(int a, int b) {
		Random rgen = new Random(); 	
		int size = b-a+1;
		int[] array = new int[size];
 
		for(int i=0; i< size; i++){
			array[i] = a+i;
		}
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}  
		return array;
	}
}
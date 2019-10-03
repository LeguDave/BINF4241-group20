public class main
{
   public static void main(String[] args)
	{
      //square array test
		ladder_square test=new ladder_square(2,3);
		ladder_square test2=new ladder_square(5,10);
      square[] myboard = {test,test2};
		System.out.println(((ladder_square)myboard[0]).steps_forward);
	}

}


public class die
{
    public static int roll()
    {
        //return random integer between 1 and size
        int my_roll=(int)(6*Math.random())+1;
        //prints out the outcome of the rolled die
        System.out.println("You rolled a "+my_roll+"\n");
        return my_roll;
    }
}




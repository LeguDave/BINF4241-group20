public class die
{
    int size;

    public die()
    {
        this.size = 6;
    }
    public int roll()
    {
        //return random integer between 1-size

        return (int)(this.size*Math.random())+1;
    }
}




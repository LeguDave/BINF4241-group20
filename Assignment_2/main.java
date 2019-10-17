public class main
{

   public static void main(String args[]){ 
      player b=new player(false);
      player w=new player(true); 
      gameboard test= new gameboard(b,w);

      test.print();
        
   }
}
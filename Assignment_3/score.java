import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;




public class score implements Observer{
   private ArrayList<piece> graveyard=new ArrayList<piece>();
   private int score_tracker=0;
   
   public void update(Observable o, Object graveyard){
      ArrayList<piece> my_graveyard=(ArrayList<piece>)graveyard;
      this.score_tracker=0;
      for (piece p : my_graveyard){
         if(p.rank.equals("Q")){
            this.score_tracker+=5;
         }
         else{
            this.score_tracker+=1;
         }
      }
      
      
   }
   public void print_score(){
      System.out.println((this.score_tracker));
   }
   


}
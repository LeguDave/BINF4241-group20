import java.util.ArrayList;

public class PieceIterator implements Iterator {
   ArrayList<piece> pieces = new ArrayList<piece>();
   int position = 0;

   public PieceIterator(ArrayList<piece> pieces) {
      this.pieces = pieces;
   }
   public Object next(){
      piece piece = pieces.get(position);
      this.position += 1;
      return piece;
   }
   public boolean hasNext(){
      if (position >= pieces.size() || pieces.get(position) == null){
         return false;
      }
      else {
         return true;
      }
   }
}
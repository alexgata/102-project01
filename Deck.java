import java.util.*;
import java.lang.*;
public class Deck extends CircularQueue<Card> {
     public Deck(boolean shuffle) {
      super(52);  
      int rank = 1;
      int suit = 1;

         while (suit <= 4) {
            while (rank <= 13){ 
               enqueue(new Card(rank,suit));
               rank ++;
            }
            rank = 1;
            suit ++;
         }

      if (shuffle == true){
         shuffle();
      }
   }
   
   public Card draw() {
      if (size() == 0) {
         throw new NoSuchElementException();
      }
      else {
         return dequeue();  
      }
   }

   public void shuffle() {
      int save = this.size();
      Random random = new Random();
      Card temp;

      ArrayList<Card> cards = new ArrayList<>();
      for (int i = 0; i < save; i ++) {
         Card print = this.dequeue();
         //System.out.println(print);
         cards.add(i,print);
      }

      for (int j = 0; j < save; j++) {
         int rand = random.nextInt(save-j);
         temp = cards.remove(rand);
         //System.out.println(temp);
         this.enqueue(temp);
      } 
      //System.out.println(size());
   }
}

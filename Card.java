import java.lang.IllegalArgumentException;
import java.util.Arrays;
public class Card {
   private int rank;
   private int suit;

   public Card(int rank, int suit) {
      if (rank < 1 || rank > 13 || suit < 1 || suit >4) { 
         throw new IllegalArgumentException();
      }

      else {
         this.rank = rank;
         this.suit = suit;
      }
   }

   public String getRank() {
      if (rank == 1) {
        return "Ace";
      }

      else if (rank == 11) {
         return "Jack";
      }

      else if (rank == 12) {
         return "Queen";
      }

      else if (rank == 13) {
         return  "King";
      }

      else {
         return String.valueOf(rank);
      }
   }

   public String getSuit() { 
      if (suit == 1) {
         return "Spades";
      }

      else if (suit == 2) {
         return "Hearts";
      }

      else if (suit == 3) {
         return "Diamonds";
      }

      else {
         return "Clubs";
      }
   }

   public String toString() {
      return getRank() + " of " + getSuit(); 
   }
}

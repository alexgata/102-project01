import java.util.*;
import java.lang.*;

public class Hand {
   private int handSize;
   private Deck deck;
   private ArrayList<Card> hand = new ArrayList<Card>();
   
   public Hand(Deck deck, int handSize) {
      if (handSize <= 0) {
         throw new IllegalArgumentException();
      }

      if (deck == null) {
         throw new NullPointerException();
      }

      else if (deck.size() <= handSize) {
         throw new NoSuchElementException();
      }
      else {
         this.deck = deck;
         this.handSize = handSize;
      }
      
      for (int i = 0; i < handSize; i++) {
         draw();     
      }
   }

   public void draw() {
      if (deck.size() == 0) {
         throw new NoSuchElementException();
      }
      hand.add(deck.dequeue());
   }

   public Card getCard(int cardNumber) {
      if (cardNumber < 0 || cardNumber >= hand.size()) {
         throw new IndexOutOfBoundsException();
      }
      
      return  hand.get(cardNumber); 
   }

   public Card play(int cardNumber) {
     if (cardNumber < 0 || cardNumber >= hand.size()) {
         throw new IndexOutOfBoundsException();
      }
      
      Card save = hand.get(cardNumber); 
      hand.remove(save);
      return save; 
   }

   public int size() {
      return hand.size();
   }

}

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import org.junit.rules.*;
import org.junit.runners.MethodSorters;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeckTests {
   @Test
   public void test01_Deck() {
      Deck deck = new Deck(false);
      assertEquals(new Card(1,1).toString(), deck.draw().toString());
   }
   @Test
   public void test02_Deck() {
      Deck deck = new Deck(false);
      deck.draw();
      deck.draw();
      deck.draw();
      assertEquals(new Card(4,1).toString(), deck.draw().toString());
   }

   @Test
   public void test03_Deck(){
      Deck deck = new Deck(false);
      assertEquals(deck.size(), 52);
   }

   @Test
   public void test04_Deck_Shuffled() {
      Deck deck = new Deck(true);
      System.out.println(deck);
      assertEquals(deck.size(), 52);
   }
   

}

   

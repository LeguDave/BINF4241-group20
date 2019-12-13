import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;




public class UNOTest {


  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setup() {
    game game = new game();
  }

  /**
   * This method creates several instances of the game class with varying numbers.
   * The method checkamountfplayer() should correctly return a boolean, depending on 
   * whether the amount of players is legal.
  */
  @Test
  public void TESTcheckamountofplayers() {
    Assert.assertTrue(new game(2).checkamountofplayers());
    Assert.assertTrue(new game(10).checkamountofplayers());
    Assert.assertFalse(new game(1).checkamountofplayers());
    Assert.assertFalse(new game(0).checkamountofplayers());
    Assert.assertFalse(new game(-1).checkamountofplayers());
    Assert.assertFalse(new game(11).checkamountofplayers());
  }
  
  /**
   * This method checks if the deck can detect an empty/non-empty drawpile.
   * This method also checks if the deck shuffles successfully.
  */
  @Test
  public void TESTshuffleEmptyDeck() {
    deck Deck = new deck();
    player Player = new player(Deck);
    for (int i = 0; i < 108; i++){
      Player.draw();
      Deck.addcardtodiscardpile(Player.removecardfromhand(0));
    }
    
    Assert.assertTrue(Deck.isempty());
    Deck.shuffle();
    Assert.assertFalse(Deck.isempty());
    Assert.assertEquals((Deck.discardpile).size(),1);
  }
  
  /**
   * This method checks if a player can draw a card and add it to his/her hand.
  */
  @Test
  public void TESTdraw() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertFalse(Player.checkUNO);
    Player.draw();
    Assert.assertTrue(Player.checkUNO);
  }
  
  /**
   * This method checks if a card from a players hand can successfully be transfered to the discard pile.
  */
  @Test
  public void TESTcardtransfer() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertEquals((Deck.discardpile).size(),1);
    Player.draw();
    Deck.addcardtodiscardpile(Player.removecardfromhand(0));
    Assert.assertEquals((Deck.discardpile).size(),2);
    Assert.assertEquals((Deck.drawpile).size(),106);
    Assert.assertTrue(Player.hasnocards());
  }
  
  
  /**
   * This method checks if the player can detect an empty hand.
  */  
  @Test
  public void TESTemptyhand() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertTrue(Player.hasnocards());
    Player.draw();
    Assert.assertFalse(Player.hasnocards());
  }
  
  /**
   * This method checks if a player can detect UNO in his/her hand.
  */
  @Test
  public void TESThandUNO() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertFalse(Player.checkUNO);
    Player.draw();
    Assert.assertTrue(Player.checkUNO);
    Player.draw();
    Assert.assertFalse(Player.checkUNO);
  }
  
  
  /**
   * This method checks if player and the deck can detect an illegal move.
   * Four instances of normal cards will be created and one will be played on the discardpile.
   * Now both player and deck will be checked if they can detect a move to be legal or not by a given card.
  */
  @Test
  public void TESTillegalplay() {
    deck Deck = new deck();
    player Player = new player(Deck);
    card redfive = new normalcard(5,"red");
    card redten = new normalcard(10,"red");
    card greenfive = new normalcard(5,"green");
    card greenten = new normalcard(10,"green");
    
    Deck.addcardtodiscardpile(redfive);
    Assert.assertTrue(Deck.matchingcard(redten));
    Assert.assertTrue(Deck.matchingcard(greenfive));
    Assert.assertFalse(Deck.matchingcard(greenten));
    
    Player.addtohands(greenten);
    Assert.assertFalse(Player.isplaypossible());
    Player.addtohands(greenfive);
    Assert.assertTrue(Player.isplaypossible());
    Player.addtohands(redten);
    Assert.assertTrue(Player.isplaypossible());
  }
  
  /**
   * This method checks if the getter methods of the card classs work.
  */
  @Test
  public void TESTcardgetter() {
    
    card wildnormal = new wildnormal();
    card redten = new normalcard(10,"red");
    card greenfive = new normalcard(5,"green");
    card bluedrawtwo = new drawtwo("blue");
    
    Assert.assertEquals(bluedrawtwo.getnumber(),0);
    Assert.assertEquals(wildnormal.getnumber(),0);
    Assert.assertEquals(greenfive.getcolour(),"green");
    Assert.assertEquals(redten.gettype(),"normal");
  }
  
  
  /**
   * This method checks if the draw penalty card's effect actually lets a player draw cards.
  */
  @Test
  public void TESTdrawpenalty() {
    deck Deck = new deck();
    player Player = new player(Deck);
    game game = new game();
    card bluedrawtwo = new drawtwo("blue");
    card wilddrawfour = new wilddrawfour();
    
    bluedrawtwo.effect(Player,Deck,game);
    Assert.assertEquals((Deck.drawpile).size(),105);
    Assert.assertFalse(Player.hasnocard());
    
    wilddrawfour.effect(Player,Deck,game);
    Assert.assertEquals((Deck.drawpile).size(),101); 
  }
  
  /**
   * This method checks if the effect of the changedirectioncard changes the boolean clockwise in the game class.
  */
  @Test
  public void TESTdirectioncard() {
    deck Deck = new deck();
    player Player = new player(Deck);
    game game = new game();
    card CDC = new changedirectioncard("blue");
    
    CDC.effect(Player,Deck,game);
    Assert.assertFalse(game.clockwise);
  }
  
  /**
   * This method checks if the setcolour method of the wildcards change the wild cards colour.
  */
  @Test
  public void TESTwildcardcolour() {
    deck Deck = new deck();
    player Player = new player(Deck);
    game game = new game();
    card wild = new wildnormal();
    card wilddraw = new wilddrawfour();
    
    Assert.assertEquals(wild.getcolour(),NULL);
    Assert.assertEquals(wilddraw.getcolour(),NULL);
    wild.setcolour("green");
    wilddraw.setcolour("blue");
    Assert.assertEquals(wild.getcolour(),"green");
    Assert.assertEquals(wilddraw.getcolour(),"blue");
  }
  
  
  
  
  
  
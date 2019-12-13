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

   //checks if game can check correctly the amount of players

  @Test
  public void TESTcheckamountofplayers() {
    Assert.assertTrue(new game(2).checkamountofplayers());
    Assert.assertTrue(new game(10).checkamountofplayers());
    Assert.assertFalse(new game(1).checkamountofplayers());
    Assert.assertFalse(new game(0).checkamountofplayers());
    Assert.assertFalse(new game(-1).checkamountofplayers());
    Assert.assertFalse(new game(11).checkamountofplayers());
  }

   //checks if deck detects an empty drawpile, shuffles correctly and if deck detects a not empty deck

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
  
  
  //check if a card can be drawn from deck
  
  @Test
  public void TESTdraw() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertFalse(Player.checkUNO);
    Player.draw();
    Assert.assertTrue(Player.checkUNO);
  }
  
   //check if cards can be successfully added from hand to discard pile
  
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
  
  
  //checks if player can detect empty hand correctly
  
  @Test
  public void TESTemptyhand() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertTrue(Player.hasnocards());
    Player.draw();
    Assert.assertFalse(Player.hasnocards());
  }
  
  //check if player can detect UNO in his hand
  
  @Test
  public void TESThandUNO() {
    deck Deck = new deck();
    player Player = new player(Deck);
    
    Assert.assertFalse(Player.checkUNO);
    Player.draw();
    Assert.assertTrue(Player.checkUNO);
    Player.draw()
    Assert.assertFalse(Player.checkUNO);
  }
  
  
  //check if player and deck can detect an illegal play (not matching cards)
  //checking on colour and number
  
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
  
   //checks getter methods of card class

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
  
  
  //check effect of draw penalty cards
  
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
  
  
  //checks effect of changedirectioncard
  
  @Test
  public void TESTdirectioncard() {
    deck Deck = new deck();
    player Player = new player(Deck);
    game game = new game();
    card CDC = new changedirectioncard("blue");
    
    CDC.effect(Player,Deck,game);
    Assert.assertFalse(game.clockwise);
  }
  
  //checks if colour can be set successfully of wildcards
  
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
  
  
  
  
  
  
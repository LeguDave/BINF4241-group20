# BINF4241-group20
Group 20

Sadly we saw the exact requirements for the interface of the game too late.
Here is a list of all the things we display/handle differently, as discussed in class.

If you want to decide, what size the game board should
have, you can change the number X in the first line
in the main class. The number X must be at least 2.
The default number for X is 15:

         game testgame = new game(X);

You can add players by adding the following line
into the main class where it is marked:

         testgame.add_player("Player Name");

Then you can run the main class to start the game.
When the game starts, the program prints the randomly generated board layout.
Turn order is the same as the order of the added players.
A player has to press the enter button to take his turn.
The game rolls a d6 and tells the user in the output what happens to that player.
If a player lands on another player (except start square), he will be sent back to square one.

The program does NOT print the board state after every turn, but it tells the player exactly what happens.
So in theory it should not be too much of a problem to verify the correctness of the game implementation.

Thanks a lot and sorry for any inconveniences caused

Tim, David and Ashly



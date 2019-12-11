Answers to Software Construction assignment 5 part 2:

GameBoardTest failed tests:

1. getOpenPositions: Fails because getOpenPositions() method in the GameBoard class starts iterating at the second column (int col = 1) instead of the first column (int col=0). 
Changed starting column of iteration to int col = 0. 

2. getOpenPositionsAll: same reason to fail and same fix as for "getOpenPositions" test.

3. markOnBoard: Tests if the empty position [0][0] on the board can be marked for player 0. 
The test fails because the mark() method says that the position can only be marked if it is not null, meaning if it is occupied.
Otherwise it will not be marked. To fix this problem, we modified the if... else... clause in the mark() function (GameBoard class) by reversing the condition.
The if... else... clause needs to be in a way that a player can only mark a position if it is unoccupied (==null) and not otherwise.

4. markTwice: Checks if the position can be marked if it is already occupied. This is also fixed by modifying the mark() function as explained for the "markBoard" test.
 

TicTacToeGameStateTest failed tests:

1. startingPlayerIsX: this test failed because in the method getCurrentPlayer() the default was set to Player.0. 
By fixing the getCurrentPlayer() as explained for the "switchPlayer" test, the test passes.

2. switchPlayer: The test fails because the method getCurrentPlayer() is defined wrongly. 
The method should simply return the currentPlayer variable instead of assigning it to another variable randomPlayer first. 
The past passes after removing the lines where randomPlayer is created and currentPlayer is assigned to it.

3. getAvailableStatesEmptyBoard: checks if a new empty gameboard has 9 unoccupied positions. 
The test fails because the getOpenPositions() method (in GameBoard class) which is called by the availableStates() method (in TicTacToeGameState class) 
starts iterating at the second column (int col = 1) instead of the first column (int col = 0). To fix this, the column count was set to 0 in the for loop. (int col = 0)

4. getAvailableStatesLastOne: Like the "switchplayer" test, this test also fails in the line where getCurrentPlayer() is called. 
By fixing the getCurrentPlayer() method as described before, this test passes.

5. hasWinRow & hasWinCol: Check if there is either a row or a column that is marked by the same player. Fails because the hasWin() boolean returns false, if this condition was met.
Changed to return true.

7. isOverWin: failed because the winning condition for a complete row or column returned false. Was also fixed by the same change as for hasWinRow() and hasWinColumn().

8. hasWinDiagonal: failed because completeDiagonal() method was not defined correctly. Fixed by changing (board.getMark(0, 0) == center && center == board.getMark(1, 2)) in the 
second return statement to (board.getMark(0, 0) == center && center == board.getMark(2, 2)).


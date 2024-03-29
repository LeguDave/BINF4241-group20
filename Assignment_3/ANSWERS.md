**Assignment 3 Answers**

**Part I**

**Making the game a Singleton**

_why?_
You don't want multiple games running at the same time.

_how?_
We set the constructor in the game class private and added a public static getinstance method to get the instance,
which is only creatable once as a private variable in the game class itself.-->singleton

Class and Sequence Diagram can be found in the folder "Diagrams"

**Adding an Iterator to the player**

_why?_
In the player we found it more convenient to use an iterator than using indexes, when checking check by iterating through your pieces.

_how?_
We created the Iterator interface and the class PieceIterator to give the player class the possibility to create a PieceIterator instance.
Then we deleted the is_check method and replaced it with check and check2. The check method creates an instance of the PieceIterator and 
calls check2, which uses the iterator to return a boolean whether the enemy is check.

Class and Sequence Diagram can be found in the folder "Diagrams"

**Part II**

Sequence Diagram considering all methods that change the gameboard state can be found in the folder "Diagrams"

**Part III**

_Make a Scoreboard using an Observer of the player class_

_Describe implementation choices_

For this implementation, we had to add a "graveyard" variable to our player class, where all the killed pieces go.
Since we also used "kill" for a promoting pawn, we had to modify the kill function to act differently on friendly targets.
Otherwise the enemy would get a point whenever a pawn is promoted.
Next we implemented the player class as an observable and a score_board class as an observer of the player class with the graveyard.
Everytime a piece is killed, the score class gets an update of the new graveyard and calculates the score a new.


_Describe valid inputs for game_
The Inputs for the game stayed the same as in the README of Assignment 2:
You have to input the field of the piece,
that you want to move and then without whitespace the field where the piece should go.
The program will check whether the move is legal depending on the rank of the piece,
the position of the piece and the field, that you want to move on. If you enter an 
invalid input, the program needs you to reenter the new valid inputs.
The castling is the only move, where you have to enter a special input:
	For the short castling, the input is "0-0".
	For the long castling, the input is "0-0-0".
   
Example: 
   a b c  d e f g h
 8 [][][][][][][BH][]
 7 [][][][][][][][]
 6 [][][][][][][][]
 5 [][][][][][][][]
 4 [][][][][][][][]
 3 [][][][][][][][]
 2 [][][][][][][][]
 1 [][][][][][][][WT]


The white player wants to move his white tower from h1 to h5. The input is "h1h5".
The black player wants to move his black horse from g8 to f6. The input is "g8f6".
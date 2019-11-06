**Assignment 3 Answers**

**Part I**

Making the game a Singleton

_why?_
You don't want multiple games running at the same time.

_how?_
We set the constructor in the game class private and added a public static getinstance method to get the instance,
which is only creatable once as a private variable in the game class itself.-->singleton

_Class Diagram_

_Sequence Diagram_

Adding an Iterator to the player

_why?_
In the player we found it more convenient to use an iterator than using indexes, when checking check by iterating through your pieces.

_how?_
We created the Iterator interface and the class PieceIterator to give the player class the possibility to create a PieceIterator instance.
Then we deleted the is_check method and replaced it with check and check2. The check method creates an instance of the PieceIterator and 
calls check2, which uses the iterator to return a boolean whether the enemy is check.

_Class Diagram_

_Sequence Diagram_

**Part II**

_Sequence Diagram considering all methods that change its state_

**Part III**

_Make a Scoreboard using an Observer of the player class_

_Describe implementation choices_

_Describe valid inputs for game_
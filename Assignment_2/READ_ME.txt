Hello players,

this is a working chess game including the rules of en_passant, castling and promotion.
However, the inputs are slightly different. You have to input the field of the piece,
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
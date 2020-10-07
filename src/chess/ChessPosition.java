package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column <'a' || column > 'h' || row <1 || row >8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		/*matrix_row=8-chess_row  (Coluna da matriz � igual a 8 menos a coluna do xadrez - F�rmula)
		 matrix_column=chess_column-'a' (Coluna da matriz � igual a coluna do xadrez menos caractere a - F�rmula)
		a=0
		b=1
		c=2
		'a'-'a'=0  (c�digo do caractere a menos ele mesmo, como � o mesmo codigo, vai dar 0)
		'b'-'a'=1
		'c'-'a'=2 
		*/
		return new Position(8-row,column-'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition()
	}
}

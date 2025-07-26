package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece [] [] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("É necessário ter pelo menos 1 coluna e uma tabelas!!");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];		
	}

	public int getRows() {
		return rows;
	}

	
	public int getColumns() {
		return columns;
	}

	
	public Piece piece(int row,int column) {
		if (!positionExists(row,column)) {
			throw new BoardException("Position not on the board ");
		}
		return pieces[row][column];
	}
	
	public Piece picece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board ");
		}
		return pieces[position.getRows()][position.getCollumn()];
	}
	
	public void placePiece(Piece piece,Position position) {
		if (thereIsApice(position)) {
			throw new BoardException("There is already a peice on position "+ position);

		}
		pieces[position.getRows()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row,int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRows(),position.getCollumn());
	}
	
	public boolean thereIsApice(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board ");
		}
		return picece(position) != null;
	}
	
}

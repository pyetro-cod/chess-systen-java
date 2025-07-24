package boardgame;

public class Position {
	
	private int rows;
	private int collumn;
	
	public Position(int rows, int collumn) {
		this.rows = rows;
		this.collumn = collumn;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}
	
	@Override
	public  String toString(){
		return rows + ", " + collumn;
	}
}

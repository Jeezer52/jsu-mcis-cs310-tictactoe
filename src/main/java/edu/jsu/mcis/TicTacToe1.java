package edu.jsu.mcis;


public class TicTacToe {
	private String[][] grid;
	private boolean xTurn;
	
	public TicTacToe() {
		grid = new String[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] = " ";
			}
		}
		xTurn = true;
	}
	
    public String getMark(int i, int j) {
		return grid[i][j];
	}
	
	public void setMark(int i, int j) {
		if(xTurn) grid[i][j] = "X";
		else grid[i][j] = "O";
		xTurn = !xTurn;
	}
}













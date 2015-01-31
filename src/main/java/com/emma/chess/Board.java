package com.emma.chess;

public class Board {
	private Pawn[][] board;
	private int count = 0;
	public Board() {
		board = new Pawn[8][8];
	}
	
	public boolean IsEmpty(){
		for (int i=0 ; i<8; i++){
			for (int j=0; j<8; j++){
				if(board[i][j] != null){
					return false;
				}
			}
		}
		return true;
	}
	
	public void addPawn(Pawn pawn, int col, int row ){
		board[col][row] = pawn;
	}
	public Pawn getPawn(int col, int row ){
		return board[col][row];
	}

}

package Assignments;

public class Gameboard {
	public char[][] board = new char[8][8];
	public Gameboard(boolean setup) {
		if(setup == false) {
			for(int r = 0; r<board.length;r++) {
				for(int c = 0;c<board[0].length;c++) {
					board[r][c] = '-';
				}
			}
		}
		if(setup == true) {
			for(int r = 0; r<3;r++) {
				for(int c = 0;c<board[0].length;c++) {
					board[r][c] = '-';
					board[r][c+1] = 'r';
				}
			}
			for(int r = 5; r<8;r++) {
				for(int c = 0;c<board[0].length;c++) {
					board[r][c] = '-';
					board[r][c+1] = 'w';
				}
			}
		}
	}
	boolean move(int x, int y, boolean left) {
		
	}
	boolean jump(int x, int y) {
		if(board[x][y] == 'w' && board[x-1][y-1] == 'r' && board[x-2][y-2] == '-') {
			board[x-2][y-2] = 'w';
			board[x-1][y-1] = '-';
			board[x][y] = '-';
			return true;
		}
		if(board[x][y] == 'r' && board[x+1][y+1] == 'w' && board[x-2][y-2] == '-') {
			board[x-2][y-2] = 'r';
			board[x-1][y-1] = '-';
			board[x][y] = '-';
			return true;
		}
		else {
			return false;
		}
	}
	boolean kingMe(int x, int y) {
		if(board[x][y] == 'w' && x == 0) {
			board[x][y] = 'W';
			return true;
		}
		if(board[x][y] == 'r' && x == 7) {
			board[x][y] = 'R';
			return true;
		}
		else {
			return false;
		}
		
	}
	String toString() {
		
	}
}

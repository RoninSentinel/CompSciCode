package Sudoku;
import java.lang.Math;
import java.util.ArrayList;

public class games {

		if(scan.equals("easy")) {
			int x = Math.random()*4+1;
			return x;
		}
		else if(scan.equals("medium")) {
			int y = Math.random()*7+3;
			return y;
		}
		else if(scan.equals("hard")) {
			int z = Math.random()*10+6;
			return z;
		}
	
//basic board full of nulls

ArrayList <integers>board[][] = new ArrayList<integers> [9][9];
for(int r = 0; r < 9; r++) {
	for(int c = 0; c < 9; c++) {
		board[r][c] = null;
	}
}
}
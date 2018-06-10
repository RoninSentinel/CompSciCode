package Sudoku;

public class sudoku extends games{

    public static void main(String args[]) {
        new sudoku(new int[][] {
            {2, 5, 0, 0, 0, 0, 1, 0, 3},
            {0, 0, 7, 5, 0, 0, 0, 0, 0},
            {0, 0, 6, 1, 0, 4, 2, 0, 5},
            {7, 3, 0, 9, 1, 0, 6, 0, 0},
            {0, 0, 5, 8, 0, 7, 0, 0, 0},
            {6, 9, 0, 2, 0, 0, 0, 0, 8},
            {0, 0, 4, 3, 0, 9, 1, 0, 0},
            {9, 1, 2, 0, 7, 8, 0, 0, 4},
            {8, 0, 3, 4, 0, 0, 0, 2, 6}
        }).solve();
    }

    private int sud[][];
    private int max = 9;

    public sudoku(int sudoku[][]) {
        this.sud = sud;
    }

    public void solve() {

        if (!backtrackSolve()) {
            System.out.println("Not Solvable.");
        }

        for (int r = 0; r < max; r++) {
            for (int c = 0; c < max; c++) {
                System.out.print(sud[r][c] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSuitableToPutXThere(int i, int j, int x) {

        for (int js = 0; js < max; js++) {
            if (sud[i][js] == x) {
                return false;
            }
        }
        for (int is = 0; is < max; is++) {
            if (sud[is][j] == x) {
                return false;
            }
        }
        int boxRow = i - i % 3;
        int boxColumn = j - j % 3;

        for (int is = 0; is < 3; is++) {
            for (int js = 0; js < 3; js++) {
                if (sud[boxRow + is][boxColumn + js] == x) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean backtrackSolve() {
        int r = 0, c = 0;
        boolean isThereEmptyCell = false;

        for (int z = 0; z < max && !isThereEmptyCell; z++) {
            for (int y = 0; y < max && !isThereEmptyCell; y++) {
                if (sud[z][y] == 0) {
                    isThereEmptyCell = true;
                    r = z;
                    c = y;
                }
            }
        }
        if (!isThereEmptyCell) {
            return true;
        }

        for (int x = 1; x < 10; x++) {

            if (isSuitableToPutXThere(r, c, x)) {
                sud[r][c] = x;

                if (backtrackSolve()) {
                    return true;
                }

                sud[r][c] = 0;
            }

        }

        return false; 
    }
}




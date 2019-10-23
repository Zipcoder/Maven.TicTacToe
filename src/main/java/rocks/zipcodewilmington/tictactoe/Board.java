package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private static Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean checkRowWin(char piece) {
        boolean row_win = false;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] != piece) {
                    row_win = false;
                    break;
                } else {
                    row_win = true;
                }
            }
            if (row_win) {break;}
        }
        return row_win;
    }

    public Boolean checkColWin(char piece) {
        boolean col_win = false;
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[0].length; j++) {
                if (matrix[i][j] != piece) {
                    col_win = false;
                    break;
                } else {
                    col_win = true;
                }
            }
            if (col_win) {break;}
        }
        return col_win;
    }

    public Boolean checkDiagonalWin(char piece) {
        boolean diag_win = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != piece) {
                diag_win = false;
                break;
            } else {
                diag_win = true;
            }
        }
        return diag_win;
    }

    public Boolean checkAntiDiagonalWin(char piece) {
        boolean adiag_win = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix.length-1-i] != piece) {
                adiag_win = false;
                break;
            } else {
                adiag_win = true;
            }
        }
        return adiag_win;
    }

    public Boolean isInFavorOfX() {
        return checkColWin('X') || checkRowWin('X')
                || checkDiagonalWin('X') || checkAntiDiagonalWin('X');
    }

    public Boolean isInFavorOfO() {
        return checkColWin('O') || checkRowWin('O')
                || checkDiagonalWin('O') || checkAntiDiagonalWin('O');
    }

    public Boolean isTie() {
        return !(isInFavorOfO()^isInFavorOfX());
    }

    public String getWinner() {
        String winner = "";
        if (!isTie()) {
            if (isInFavorOfX()) {
                winner = "X";
            } else if (isInFavorOfO()) {
                winner = "O";
            }
        }
        return winner;
    }

}

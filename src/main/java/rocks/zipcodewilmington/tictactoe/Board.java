package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if (horizontalCheck('X') || diagonalCheck('X') || verticalCheck('X')){
            return true;
    }
    return false;
}

    public Boolean isInFavorOfO() {
        if (horizontalCheck('O') || diagonalCheck('O') || verticalCheck('O')){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        }
        if (isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }

    public Boolean verticalCheck(Character x0){
    for (int i = 0; i <= 2; i++) {
        if ((board[0][i] == x0) && (board[1][i] == x0) && (board[2][i] == x0)){
            return true;
        }
    }
    return false;
}

    public Boolean horizontalCheck(Character x0) {
        for (int i = 0; i <= 2; i++) {
            if ((board[i][0] == x0) && (board[i][1] == x0) && (board[i][2] == x0)) {
                return true;
            }
        }
        return false;
    }

    public Boolean diagonalCheck(Character x0) {
        if ((board[0][0] == x0 && board[1][1] == x0 && board[2][2] == x0) || (board[2][0] == x0 && board[1][1] == x0 && board[0][2] == x0)) {
            return true;

        }
        return false;
    }
}



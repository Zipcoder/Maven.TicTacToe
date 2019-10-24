package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }
    public Boolean checkHorizontal(Character hT){
        for (int i = 0; i <= 2; i++){
            if (board[i][0] == hT && board[i][1] == hT && board[i][2] == hT){
                return true;
            }
        }
        return false;
    }
    public Boolean checkVertical(Character hT){
        for (int i = 0; i <= 2; i++){
            if (board[0][i] == hT && board[1][i] ==hT && board[2][i] == hT){;
            return true;
            }
        }
        return false;
    }
    public Boolean checkDiagonal(Character hT){
        if ((board[0][0] == hT && board[1][1] == hT && board[2][2] == hT) ||
        (board[2][0] == hT && board[1][1] == hT && board[0][2] == hT)){
                return true;
            }

        return false;
    }
    public Boolean isInFavorOfX() {

        if (checkHorizontal(('X')) || checkVertical('X') || checkDiagonal('X')){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {

        if (checkHorizontal(('O')) || checkVertical('O') || checkDiagonal('O')){
            return true;
        }

            return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()){
           return "X";
        }
        if (isInFavorOfO()){
            return "O";
        }
        return "";
    }

}

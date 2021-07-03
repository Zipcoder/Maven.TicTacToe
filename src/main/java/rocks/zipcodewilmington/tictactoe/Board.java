package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] board;

    public Board(Character[][] matrix) {this.board = matrix;}

    public boolean checkHorizontal(Character xo) {
        for (int i = 0; i < 3; i++){
            if (board[0][i] == xo && board[1][i] ==xo && board[2][i] == xo){return true;}
        }
        return false;
    }

    public boolean checkVertical(Character xo) {
        for (int i = 0; i < 3; i++){
            if (board[i][0] == xo && board[i][1] ==xo && board[i][2] == xo){return true;}
        }
        return false;
    }

    public boolean checkDiagnal1(Character xo) {
            if (board[0][0] == xo && board[1][1] ==xo && board[2][2] == xo){return true;}
            return false;
    }

    public boolean checkDiagnal2 (Character xo) {
        boolean ans = false;
        if (board[2][0] == xo && board[1][1] ==xo && board[0][2] == xo){return true;}
     return false;
    }


    public Boolean isInFavorOfX() {
        if (checkHorizontal('X') || checkVertical('X') || checkDiagnal1('X') || checkDiagnal2('X')){return true;}
        return false;
    }

    public Boolean isInFavorOfO() {
        if (checkHorizontal('O') || checkVertical('O') || checkDiagnal1('O') || checkDiagnal2('O')){return true;}
        return false;
    }

    public Boolean isTie() {
        return isInFavorOfX() == isInFavorOfO();
    }

    public String getWinner() {
        if(isInFavorOfO() == true){return "O";}
        if(isInFavorOfX() == true){return "X";}
        return "";
    }

}

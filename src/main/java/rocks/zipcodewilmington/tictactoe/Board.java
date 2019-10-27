package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    private Character[][] board;
    private boolean leftVerticalXWin = board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X';
    private boolean centerVerticalXWin =board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X';
    private boolean rightVerticalXWin = board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X';

    private boolean topHorizontalXWin = board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X';
    private boolean middleHorizontalXWin = board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X';
    private boolean bottomHorizontalXWin = board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X';

    private boolean leftVerticalYWin = board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X';
    private boolean centerVerticalYWin;
    private boolean rightVerticalYWin;

    private boolean topHorizontalYWin;
    private boolean middleHorizontalYWin;
    private boolean bottomHorizontalYWin;

    private boolean diagonalDownToRightXWin = board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X';
    private boolean diagonalUpToLeftXWin;

    private boolean diagonalDownToRightYWin;
    private boolean diagonalUpToLeftYWin;

    public Boolean isInFavorOfX() {
        return leftVerticalXWin || centerVerticalXWin || rightVerticalXWin || topHorizontalXWin || middleHorizontalXWin || bottomHorizontalXWin;

    }


    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}

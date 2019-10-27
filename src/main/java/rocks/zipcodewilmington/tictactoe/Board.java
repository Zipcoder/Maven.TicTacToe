package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    private Character[][] board;


    private boolean xLeftVerticalWin = board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X';
    private boolean xCenterVerticalWin = board[0][0] == 'X' && board[1][1] == 'X' && board[2][1] == 'X';
    private boolean xRightVerticalWin = board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X';

    private boolean xTopHorizontalWin = board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X';
    private boolean xMiddleHorizontalWin = board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X';
    private boolean xBottomHorizontalWin = board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X';

    private boolean oLeftVerticalWin = board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O';
    private boolean oCenterVerticalWin = board[0][0] == 'O' && board[1][1] == 'O' && board[2][1] == 'O';
    private boolean oRightVerticalWin = board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O';

    private boolean oTopHorizontalWin = board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O';
    private boolean oMiddleHorizontalWin = board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O';
    private boolean oBottomHorizontalWin = board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O';

    private boolean xDiagonalDownToRightWin = board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X';
    private boolean xDiagonalUpToLeftWin = board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X';

    private boolean oDiagonalDownToRightWin = board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O';
    private boolean oDiagonalUpToLeftWin = board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O';

    public Boolean isInFavorOfX() {

        for(int row = 0; row <= 2; row++)   {
            for(int column = 0; column <= 2; column++)  {

            }
        }

        return xLeftVerticalWin || xCenterVerticalWin || xRightVerticalWin || xTopHorizontalWin ||
                xMiddleHorizontalWin || xBottomHorizontalWin || xDiagonalDownToRightWin || xDiagonalUpToLeftWin;
    }

    public Boolean isInFavorOfO() {
        return oLeftVerticalWin || oCenterVerticalWin || oRightVerticalWin || oTopHorizontalWin ||
                oMiddleHorizontalWin || oBottomHorizontalWin || oDiagonalDownToRightWin || oDiagonalUpToLeftWin;
    }

    public Boolean isTie() {
        return (!isInFavorOfX() && isInFavorOfO());
    }

    public String getWinner() {
        return null;
    }

}

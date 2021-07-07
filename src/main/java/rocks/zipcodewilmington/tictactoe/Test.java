package rocks.zipcodewilmington.tictactoe;

public class Test {

    private Character[][] board;
    private Boolean victory;


    public Boolean isInFavorOfX() {

        return checkRows('X') || checkColumns('X') || checkDiagonals('X');
    }

    public Boolean isInFavorOfO() {

        return checkRows('O') || checkColumns('O') || checkDiagonals('O');
    }

    public Boolean isTie() {
        return !checkDiagonals('X') && !checkDiagonals('O') && !checkColumns('X') && !checkColumns('O') && !checkRows('X') && !checkRows('O');
    }

    public String getWinner() {
        if(!isInFavorOfX() && !isInFavorOfO())  {
            return "";
        }   return isInFavorOfX() ? "X" : "O";
    }

    public Boolean checkRows(char winner) {
        for (int row = 0; row <= 2; row++) {
            victory = (board[row][0] == winner && board[row][1] == winner) & (board[row][2] == winner);
        }
        return victory;
    }

    public Boolean checkColumns(char winner) {
        for (int column = 0; column <= 2; column++) {
            victory = (board[0][column] == winner && board[1][column] == winner) && (board[2][column] == winner);
        }
        return victory;
    }

    public Boolean checkDiagonals(char winner) {
        return victory = (board[0][0] == winner && board[1][1] == winner) && (board[2][2] == winner) ||
                (board[2][0] == winner && board[1][1] == winner) && (board[0][2] == winner);
    }
}

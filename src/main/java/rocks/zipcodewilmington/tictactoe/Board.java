package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix = new Character[3][3];

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean isInFavorOfX = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == ('X') && matrix[i][1] == ('X') && matrix[i][2] == ('X')) {
                isInFavorOfX = true;
            }
            else if (matrix[0][i] == ('X') && matrix[1][i] == ('X') && matrix[2][i] == ('X')) {
                isInFavorOfX = true;
            }
            else if ((matrix[0][0] == ('X') && matrix[1][1] == ('X') && matrix[2][2] == ('X'))
                    || (matrix[0][2] == ('X') && matrix[1][1] == ('X') && matrix[2][0] == ('X'))) {
                isInFavorOfX = true;
            }
        }
        return isInFavorOfX;
    }

    public Boolean isInFavorOfO() {
        boolean isInFavorOfO = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == ('O') && matrix[i][1] == ('O') && matrix[i][2] == ('O')) {
                isInFavorOfO = true;
            }
            else if (matrix[0][i] == ('O') && matrix[1][i] == ('O') && matrix[2][i] == ('O')) {
                isInFavorOfO = true;
            }
            else if ((matrix[0][0] == ('O') && matrix[1][1] == ('O') && matrix[2][2] == ('O'))
                    || (matrix[0][2] == ('O') && matrix[1][1] == ('O') && matrix[2][0] == ('O'))) {
                isInFavorOfO = true;
            }
        }
        return isInFavorOfO;
    }

    public Boolean isTie() {
        if (getWinner().equals("X")) {
            return false;
        }
        else if (getWinner().equals("O")) {
            return false;
        }
        else {
            return true;
        }
    }

    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        }
        else if (isInFavorOfX()) {
            return "X";
        }
        else {
            return "";
        }
    }

}

package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public String getWinner() {
        if (isInFavorOfO())
        {
            return "O";
        }
        else if (isInFavorOfX())
        {
            return "X";
        }
        else { return ""; }
    }

    public Boolean isInFavorOfX() {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            //checks row wise
            if (matrix[i][0] == ('X') && matrix[i][1] == ('X') && matrix[i][2] == ('X')) {
                result = true;
            }
            //checks column wise
            else if (matrix[0][i] == ('X') && matrix[1][i] == ('X') && matrix[2][i] == ('X')) {
                result = true;
            }
            //checks diagonal wise
            else if ((matrix[0][0] == ('X') && matrix[1][1] == ('X') && matrix[2][2] == ('X'))
                    || (matrix[0][2] == ('X') && matrix[1][1] == ('X') && matrix[2][0] == ('X'))) {
                result = true;
            }
        }
        return result;
    }

    public Boolean isInFavorOfO() {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            //checks row wise
            if (matrix[i][0] == ('O') && matrix[i][1] == ('O') && matrix[i][2] == ('O')) {
                result = true;
            }
            //checks column wise
            else if (matrix[0][i] == ('O') && matrix[1][i] == ('O') && matrix[2][i] == ('O')) {
               result = true;
            }
            //checks diagonal wise
            else if ((matrix[0][0] == ('O') && matrix[1][1] == ('O') && matrix[2][2] == ('O'))
                    || (matrix[0][2] == ('O') && matrix[1][1] == ('O') && matrix[2][0] == ('O'))) {
                result = true;
            }
        }
        return result;
    }

    public Boolean isTie() {
        if (getWinner().equals("X"))
        { return false; }
        else if (getWinner().equals("O"))
        { return false; }
        else { return true; }
    }



}

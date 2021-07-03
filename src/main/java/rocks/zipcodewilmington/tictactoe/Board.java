package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {this.matrix = matrix;}

    public Boolean isInFavorOfX() {
        int xCount = 0;
        int oCount = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    xCount++;
                } else if (matrix[i][j] == 'O') {
                    oCount++;
                }
            }
        }
        if(isTie().equals(true)){
            return false;
        } else if(xCount > oCount) {
            return true;
        } return false;
    }

    public Boolean isInFavorOfO() {
        int xCount = 0;
        int oCount = 0;

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    xCount++;
                } else if (matrix[i][j] == 'O') {
                    oCount++;
                }
            }
        }
        if(isTie().equals(true)){
            return false;
        } else if(xCount < oCount) {
            return true;
        } return false;
    }

    public Boolean isTie() {
        if(getWinner().equals("")){
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        int row = 0;
        int column = 0;
        int k = 0; //next row or column
        boolean xIsWinner = true;
        boolean oIsWinner = true;
        for (int i = 0; i < 3; i++) {
            //rows
            if(matrix[i][0].equals('X') && matrix[i][1].equals('X') && matrix[i][2].equals('X')) {
                winner = "X";
                break;
            } else if(matrix[i][0].equals('O') && matrix[i][1].equals('O') && matrix[i][2].equals('O')) {
                winner = "O";
                break;
            //columns
            } else if(matrix[0][i].equals('X') && matrix[1][i].equals('X') && matrix[2][i].equals('X')) {
                winner = "X";
                break;
            } else if(matrix[0][i].equals('O') && matrix[1][i].equals('O') && matrix[2][i].equals('O')) {
                winner = "O";
                break;
            //forward diagonal
            } else if(matrix[0][0].equals('X') && matrix[1][1].equals('X') && matrix[2][2].equals('X')) {
                winner = "X";
                break;
            } else if(matrix[0][0].equals('O') && matrix[1][1].equals('O') && matrix[2][2].equals('O')) {
                winner = "O";
                break;
            //reverse diagonal
            } else if(matrix[0][2].equals('X') && matrix[1][1].equals('X') && matrix[2][0].equals('X')) {
                winner = "X";
                break;
            } else if(matrix[0][2].equals('O') && matrix[1][1].equals('O') && matrix[2][0].equals('O')) {
                winner = "O";
                break;
            //tie
            } else winner = "";
        }
        return winner;
    }
}


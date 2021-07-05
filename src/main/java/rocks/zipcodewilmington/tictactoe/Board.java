package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
   // String winner = "";
    private Character[][] matrix;
    int xCounter = 0;
    int oCounter = 0;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        int xFirstRowCounter = 0;
        int xSecondRowCounter = 0;
        int xThirdRowCounter = 0;
        int xFirstColCounter = 0;
        int xSecondColCounter = 0;
        int xThirdColCounter = 0;

        String whoWins = "";
        //iterate through each element of array
        for (int row = 0; row < 3; row++) {
            if (matrix[0][row] == 'X') {
                xFirstRowCounter++;
            }
        }
        for (int row = 0; row < 3; row++) {
            if (matrix[1][row] == 'X') {
                xSecondRowCounter++;
            }
        }
        for (int row = 0; row < 3; row++) {
            if (matrix[2][row] == 'X') {
                xThirdRowCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][0] == 'X') {
                xFirstColCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][1] == 'X') {
                xSecondColCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][2] == 'X') {
                xThirdColCounter++;
            }
        }

        int[] determineWinner = {xFirstRowCounter, xSecondRowCounter, xThirdRowCounter, xFirstColCounter, xSecondColCounter, xThirdColCounter};
        for (int i = 0; i < determineWinner.length; i++) {
            if (determineWinner[i] == 3) {
                return true;
            }
            if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
                return true;
            } else if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
                return true;
            }
        }
        return false;
    }

      /*  if(getWinner() == "X")
        return false;
        for (int i = 0; i < matrix.length; i++) {
        if (matrix[i].equals("X")) {
            xCounter++;
        } else {
            oCounter++;
        }

    }
        return xCounter > oCounter; } */

    public Boolean isInFavorOfO() {
        int oFirstRowCounter = 0;
        int oSecondRowCounter = 0;
        int oThirdRowCounter = 0;
        int oFirstColCounter = 0;
        int oSecondColCounter = 0;
        int oThirdColCounter = 0;

        String whoWins = "";
        //iterate through each element of array
        for (int row = 0; row < 3; row++) {
            if (matrix[0][row] == 'O') {
                oFirstRowCounter++;
            }
        }
        for (int row = 0; row < 3; row++) {
            if (matrix[1][row] == 'O') {
                oSecondRowCounter++;
            }
        }
        for (int row = 0; row < 3; row++) {
            if (matrix[2][row] == 'O') {
                oThirdRowCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][0] == 'O') {
                oFirstColCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][1] == 'O') {
                oSecondColCounter++;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (matrix[col][2] == 'O') {
                oThirdColCounter++;
            }
        }

        int[] determineWinner = {oFirstRowCounter, oSecondRowCounter, oThirdRowCounter, oFirstColCounter, oSecondColCounter, oThirdColCounter};
        for (int i = 0; i < determineWinner.length; i++) {
            if (determineWinner[i] == 3) {
                return true;
            }
            if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
                return true;
            } else if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
                return true;
            }
        }
        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        String winner = "";
       if (isInFavorOfO()) {
            winner = "O";
        }
       if(isInFavorOfX()){
            winner = "X";
        }

            return winner;
        }
    }


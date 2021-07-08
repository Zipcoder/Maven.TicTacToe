package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] matrix;


    /* 00  01  02
       10  11  12
       20  21  22
    Column wins: 00 10 20, 01 11 21, 02 12 22
    Row wins: 00 01 02, 10 11 12, 20 21 22
    Diagonal wins: 00 11 22, 20 11 02

     */

    public Board(Character[][] matrix) {
       this.matrix = matrix;
        }


    public Boolean isInFavorOfX() {

        boolean isInFavorOfX = false;
        for (int row = 0; row < 3; row++) { //row, cycle through 3 rows
            for (int column = 0; column < 3; column++) { //column cycle through 3 columns
                if (matrix[0][column] == 'X' && matrix[1][column] == 'X' && matrix[2][column] == 'X') { //column wins
                    isInFavorOfX = true;

                } else if (matrix[row][0] == 'X' && matrix[row][1] == 'X' && matrix[row][2] == 'X') { //row wins
                    isInFavorOfX = true;

                } else if ((matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X')
                        || (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X')) { //diagonal wins
                    isInFavorOfX = true;

                }

            }

        }
        return isInFavorOfX;
    }


    public Boolean isInFavorOfO() {
        boolean isInFavorOf0 = false;
        for (int row = 0; row < 3; row++) { //row, cycle through 3 rows
            for (int column = 0; column < 3; column++) { //column cycle through 3 columns
                if (matrix[0][column] == 'O' && matrix[1][column] == 'O' && matrix[2][column] == 'O') { //column wins
                    isInFavorOf0 = true;

                } else if (matrix[row][0] == 'O' && matrix[row][1] == 'O' && matrix[row][2] == 'O') { //row wins
                    isInFavorOf0 = true;

                } else if ((matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O')
                        || (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O')) { //diagonal wins
                    isInFavorOf0 = true;

                }

            }

        }
        return isInFavorOf0;
    }

    public Boolean isTie() {
        if (isInFavorOfX() == isInFavorOfO()) { // if the favors are equivalent then it results in a tie, if they are not then there should not be a tie
            return true;
        }
        return false;
    }


    public String getWinner() {
       if (this.isInFavorOfO()) { //was able to call the isInFavorOf methods to simply say, if this one is in favor then that character will be the winner
           return "O";
       }

       else if (this.isInFavorOfX()) {
           return "X";
        }
       return "";
    }
} // final brace
//if (xCount == 3 || oCount == 3);














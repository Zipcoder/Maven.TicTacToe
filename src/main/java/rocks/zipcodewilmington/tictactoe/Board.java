package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        // need to set values for 'X' and 'O'
        // evaluate the total board state to identify who is "in favor" (more values on the board)

        // at this point in the code, I need to figure out the name of the arrays so I can properly iterate through them
        // to figure out what values are in each position -- I also need to change the inner for-loops iteration value(I think)
        int counterX = 0;
        int counterY = 0;
        int numberOfSpaces = 0;
        for (int currentIndexRow = 0; currentIndexRow < this.matrix.length; currentIndexRow++) {
            for (int currentIndexCol = 0; currentIndexCol < this.matrix.length; currentIndexCol++) {
                if (this.matrix[currentIndexCol][currentIndexRow] == 'X') {
                    counterX++;
                } else if (this.matrix[currentIndexCol][currentIndexRow] == ' ') {
                    numberOfSpaces++;
                } else {
                    counterY++;
                }
            }
        }
        if (counterX == 5 || counterY == 5) {
            return false;
        } else if (counterY < counterX) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
        int counterX = 0;
        int counterY = 0;
        int numberOfSpaces = 0;
        for (int currentIndexRow = 0; currentIndexRow < this.matrix.length; currentIndexRow++) {
            for (int currentIndexCol = 0; currentIndexCol < this.matrix.length; currentIndexCol++) {
                if (this.matrix[currentIndexCol][currentIndexRow] == 'X') {
                    counterX++;
                } else if (this.matrix[currentIndexCol][currentIndexRow] == ' ') {
                    numberOfSpaces++;
                } else {
                    counterY++;
                }
            }
        }
        if (counterX == 5 || counterY == 5) {
            return false;
        } else if (counterY > counterX) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
        // same setup for getWinner though it will evaluate to false because in TicTacToe if you dont win its a tie
        Integer theWinnerIsX = 0;
        Integer theWinnerIsO = 0;
        for (int currentIndexRow = 0; currentIndexRow < this.matrix.length; currentIndexRow++) {
            for (int currentIndexCol = 0; currentIndexCol < this.matrix.length; currentIndexCol++) {
                if (this.matrix[currentIndexRow][0] == 'X' && this.matrix[currentIndexRow][1] == 'X' &&
                        this.matrix[currentIndexRow][2] == 'X' || this.matrix[0][currentIndexCol] == 'X' &&
                        this.matrix[1][currentIndexCol] == 'X' && this.matrix[2][currentIndexCol] == 'X') {
                    theWinnerIsX++;
                } else if (this.matrix[currentIndexRow][0] == 'O' && this.matrix[currentIndexRow][1] == 'O' &&
                        this.matrix[currentIndexRow][2] == 'O' || this.matrix[0][currentIndexCol] == 'O' &&
                        this.matrix[1][currentIndexCol] == 'O' && this.matrix[2][currentIndexCol] == 'O') {
                    theWinnerIsO++;
                } else if (this.matrix[0][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][2] == 'X' ||
                        this.matrix[0][2] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][0] == 'X') {
                    theWinnerIsX++;
                } else if (this.matrix[0][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][2] == 'O' ||
                        this.matrix[0][2] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][0] == 'O') {
                    theWinnerIsO++;
                }
            }
        }
        if (theWinnerIsO > theWinnerIsX || theWinnerIsO < theWinnerIsX) {
            return false;
        } else {
            return true;
        }
    }

    public String getWinner() {
        // need to identify the position of X's and O's to see if they match...
        // 3 in a row for columns/rows/diagonally/opposite diagonally
        // iterate through each array looking to confirm the win conditions
        // maybe if i generate an if statement for each column and row position? I should be able to iterate per array
        Integer theWinnerIsX = 0;
        Integer theWinnerIsO = 0;
        for (int currentIndexRow = 0; currentIndexRow < this.matrix.length; currentIndexRow++) {
            for (int currentIndexCol = 0; currentIndexCol < this.matrix.length; currentIndexCol++) {
                if (this.matrix[currentIndexRow][0] == 'X' && this.matrix[currentIndexRow][1] == 'X' &&
                        this.matrix[currentIndexRow][2] == 'X' || this.matrix[0][currentIndexCol] == 'X' &&
                        this.matrix[1][currentIndexCol] == 'X' && this.matrix[2][currentIndexCol] == 'X') {
                    theWinnerIsX++;
                } else if (this.matrix[currentIndexRow][0] == 'O' && this.matrix[currentIndexRow][1] == 'O' &&
                        this.matrix[currentIndexRow][2] == 'O' || this.matrix[0][currentIndexCol] == 'O' &&
                        this.matrix[1][currentIndexCol] == 'O' && this.matrix[2][currentIndexCol] == 'O') {
                    theWinnerIsO++;
                } else if (this.matrix[0][0] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][2] == 'X' ||
                        this.matrix[0][2] == 'X' && this.matrix[1][1] == 'X' && this.matrix[2][0] == 'X') {
                    theWinnerIsX++;
                } else if (this.matrix[0][0] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][2] == 'O' ||
                        this.matrix[0][2] == 'O' && this.matrix[1][1] == 'O' && this.matrix[2][0] == 'O') {
                    theWinnerIsO++;
                }
            }
        }
        if (theWinnerIsO > theWinnerIsX) {
            return "O";
        } else if (theWinnerIsO < theWinnerIsX) {
            return "X";
        } else {
            return "";
        }
    }
}


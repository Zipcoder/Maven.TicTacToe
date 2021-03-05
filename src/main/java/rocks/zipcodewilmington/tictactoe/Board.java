package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */


public class Board {

    Character[][] playerChoice;
    public Board(Character[][] matrix) {
        playerChoice = matrix;

    }

    public Boolean isInFavorOfX() {
        if (playerChoice[0][0]== 'X' && playerChoice[0][1] == 'X' && playerChoice[0][2] == 'X'){
            return true;
        } else if (playerChoice[1][0] == 'X' && playerChoice[1][1] == 'X' && playerChoice[1][2] == 'X') {
            return true;
        } else if (playerChoice[2][0] == 'X' && playerChoice[2][1] == 'X' && playerChoice[2][2] == 'X') {
            return true;
        } else if (playerChoice[0][0] == 'X' && playerChoice[1][0] == 'X' && playerChoice[2][0] == 'X') {
            return true;
        } else if (playerChoice[0][1] == 'X' && playerChoice[1][1] == 'X' && playerChoice[2][1] == 'X') {
            return true;
        } else if (playerChoice[0][2] == 'X' && playerChoice[1][2] == 'X' && playerChoice[2][2] == 'X') {
            return true;
        } else if (playerChoice[0][0] == 'X' && playerChoice[1][1] == 'X' && playerChoice[2][2] == 'X') {
            return true;
        } else if (playerChoice[0][2] == 'X' && playerChoice[1][1] == 'X' && playerChoice[2][0] == 'X'){
            return true;
        } else {
            return false;
        }



    }

    public Boolean isInFavorOfO() {
        if (playerChoice[0][0] == 'O' && playerChoice[0][1] == 'O' && playerChoice[0][2] == 'O') {
            return true;
        } else if (playerChoice[1][0] == 'O' && playerChoice[1][1] == 'O' && playerChoice[1][2] == 'O') {
            return true;
        } else if (playerChoice[2][0] == 'O' && playerChoice[2][1] == 'O' && playerChoice[2][2] == 'O') {
            return true;
        } else if (playerChoice[0][0] == 'O' && playerChoice[1][0] == 'O' && playerChoice[2][0] == 'O') {
            return true;
        } else if (playerChoice[0][1] == 'O' && playerChoice[1][1] == 'O' && playerChoice[2][1] == 'O') {
            return true;
        } else if (playerChoice[0][2] == 'O' && playerChoice[1][2] == 'O' && playerChoice[2][2] == 'O') {
            return true;
        } else if (playerChoice[0][0] == 'O' && playerChoice[1][1] == 'O' && playerChoice[2][2] == 'O') {
            return true;
        } else if (playerChoice[0][2] == 'O' && playerChoice[1][1] == 'O' && playerChoice[2][0] == 'O'){
            return true;
        } else {
            return false;
        }


    }

    public Boolean isTie() {
        if (isInFavorOfO() == isInFavorOfX()) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if (this.isInFavorOfO()) {
            return "O";
        } else if (this.isInFavorOfX()) {
            return "X";
        }else {
            return "";
        }
    }

}

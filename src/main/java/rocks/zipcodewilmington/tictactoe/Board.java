package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    char x = 'X';
    char o = 'O';
    String winner = "";
    public Board(Character[][] matrix) {
        //X wins rows
        if (matrix[0][0] == x && matrix[0][1] == x && matrix[0][2] == x) {
            winner = winner.concat("X");
        } else if (matrix[1][0] == x && matrix[1][1] == x && matrix[1][2] == x) {
            winner = winner.concat("X");
        } else if (matrix[2][0] == x && matrix[2][1] == x && matrix[2][2] == x) {
            winner = winner.concat("X");
        }
        //X wins columns
        else if (matrix[0][0] == x && matrix[1][0] == x && matrix[2][0] == x) {
            winner = winner.concat("X");
        }else if (matrix[0][1] == x && matrix[1][1] == x && matrix[2][1] == x) {
            winner = winner.concat("X");
        }else if (matrix[0][2] == x && matrix[1][2] == x && matrix[2][2] == x) {
            winner = winner.concat("X");
        }
        //X wins diagonal
        else if (matrix[0][0] == x && matrix[1][1] == x && matrix[2][2] == x) {
            winner = winner.concat("X");
        }else if (matrix[0][2] == x && matrix[1][1] == x && matrix[2][0] == x) {
            winner = winner.concat("X");
        }
        // O wins rows
        else if (matrix[0][0] == o && matrix[0][1] == o && matrix[0][2] == o) {
            winner = winner.concat("O");
        } else if (matrix[1][0] == o && matrix[1][1] == o && matrix[1][2] == o) {
            winner = winner.concat("O");
        } else if (matrix[2][0] == o && matrix[2][1] == o && matrix[2][2] == o) {
            winner = winner.concat("O");
        }
        //O wins columns
        else if (matrix[0][0] == o && matrix[1][0] == o && matrix[2][0] == o) {
            winner = winner.concat("O");
        }else if (matrix[0][1] == o && matrix[1][1] == o && matrix[2][1] == o) {
            winner = winner.concat("O");
        }else if (matrix[0][2] == o && matrix[1][2] == o && matrix[2][2] == o) {
            winner = winner.concat("O");
        }
        //O wins diagonal
        else if (matrix[0][0] == o && matrix[1][1] == o && matrix[2][2] == o) {
            winner = winner.concat("O");
        }else if (matrix[0][2] == o && matrix[1][1] == o && matrix[2][0] == o) {
            winner = winner.concat("O");
        } else {
            winner = "";
        }
    }

    public Boolean isInFavorOfX() {
        boolean xWins = false;
        if (winner.equals("X")) {
            xWins = true;
        }
        return xWins;
    }

    public Boolean isInFavorOfO() {
        Boolean oWins = false;
        if (winner.equals("O")) {
            oWins = true;
        }
        return oWins;
    }

    public Boolean isTie() {
        Boolean tieGame = false;
        if (winner.equals("")) {
            tieGame = true;
        }
        return tieGame;
    }

    public String getWinner() {
        String whoWins = winner;
        System.out.println(whoWins);
        return whoWins;
    }


}

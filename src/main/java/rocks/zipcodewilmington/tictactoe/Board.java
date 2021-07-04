package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    private String winner = "";

    public Board(Character[][] matrix) { this.matrix = matrix;}
    public Character[][] getBoard() { return this.matrix; }

    public boolean isInFavorOfX() {
        return getWinner() == "X";
    }

    public boolean isInFavorOfO() {
        return getWinner() == "O";
    }

    public boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() {


        if ((this.matrix[0][0] == this.matrix[0][1]) && (this.matrix[0][0] == this.matrix[0][2])) {
            getCharAndSetInFavor(this.matrix[0][0]);
        } else if ((this.matrix[1][0] == this.matrix[1][1]) && (this.matrix[1][0] == this.matrix[1][2])) {
            getCharAndSetInFavor(this.matrix[1][0]);
        } else if ((this.matrix[2][0] == this.matrix[2][1]) && (this.matrix[2][0] == this.matrix[2][2])) {
            getCharAndSetInFavor(this.matrix[2][0]);
        } else if ((this.matrix[0][0] == this.matrix[1][0]) && (this.matrix[0][0] == this.matrix[2][0])) {
            getCharAndSetInFavor(this.matrix[0][0]);
        } else if ((this.matrix[0][1] == this.matrix[1][1]) && (this.matrix[0][1] == this.matrix[2][1])) {
            getCharAndSetInFavor(this.matrix[0][1]);
        } else if ((this.matrix[0][2] == this.matrix[1][2]) && (this.matrix[0][2] == this.matrix[2][2])) {
            getCharAndSetInFavor(this.matrix[0][2]);
        } else if ((this.matrix[0][0] == this.matrix[1][1]) && (this.matrix[0][0] == this.matrix[2][2])) {
            getCharAndSetInFavor(this.matrix[0][0]);
        } else if ((this.matrix[0][2] == this.matrix[1][1]) && (this.matrix[0][2] == this.matrix[2][0])) {
            getCharAndSetInFavor(this.matrix[0][2]);
        }
        System.out.println(this.winner);
        return this.winner;
    }

    public void getCharAndSetInFavor(Character c) {
        switch(c) {
            case 'X':
                this.winner = "X";
                break;
            case 'O':
                this.winner = "O";
                break;
            default:
                System.out.println(this.winner);
                return;
        }
    }

}

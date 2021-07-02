package rocks.zipcodewilmington.tictactoe;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        Character[] rowOfX = {'X', 'X', 'X'};
        Character[] horizontal = new Character[3];
        Character[] vertical = new Character[3];
        Character[] diagonal = new Character[3];
        //Testing horizontally
        for (int i = 0; i < 3; i++) {
            horizontal = this.matrix[i];
            if(Arrays.equals(horizontal,rowOfX)) {
                return true;
            }
        }

        //Testing vertically
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vertical[j] = this.matrix[j][i];
            }
            if(Arrays.equals(vertical,rowOfX)){
                return true;
            };
        }
        //Testing diagonally forward
        for (int i = 0; i < 3; i++) {
            diagonal[i] = this.matrix[i][i];
        }
        if(Arrays.equals(diagonal,rowOfX)) {
            return true;
        }
        //Testing diagonally backward
        for (int i = 0; i < 3; i++) {
            diagonal[i] = this.matrix[i][2-i];
        }
        if(Arrays.equals(diagonal,rowOfX)){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        Character[] rowOfO = {'O', 'O', 'O'};
        Character[] horizontal = new Character[3];
        Character[] vertical = new Character[3];
        Character[] diagonal = new Character[3];

        //Testing horizontally
        for (int i = 0; i < 3; i++) {
            horizontal = this.matrix[i];
            if(Arrays.equals(horizontal,rowOfO)) {
                return true;
            }
        }

        //Testing vertically
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vertical[j] = this.matrix[j][i];
            }
            if(Arrays.equals(vertical,rowOfO)){
                return true;
            };
        }

        //Testing diagonally forward
        for (int i = 0; i < 3; i++) {
            diagonal[i] = this.matrix[i][i];
        }
        if(Arrays.equals(diagonal,rowOfO)) {
            return true;
        }
        //Testing diagonally backward
        for (int i = 0; i < 3; i++) {
            diagonal[i] = this.matrix[i][2-i];
        }
        if(Arrays.equals(diagonal,rowOfO)){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        return this.isInFavorOfO() == this.isInFavorOfX();
    }

    public String getWinner() {
        if (this.isInFavorOfX()){
            return "X";
        } else if(this.isInFavorOfO()){
            return "O";
        } else {
            return "";
        }
    }

}

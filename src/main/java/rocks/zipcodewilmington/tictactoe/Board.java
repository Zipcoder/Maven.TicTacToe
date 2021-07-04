package rocks.zipcodewilmington.tictactoe;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] matrix;
    public Board(Character[][] matrix) { this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        int xWins= 0;
        int xWinsRow2= 0;
        int xWinsRow3 = 0;
        int xWinsColumn = 0;
        int xWinsColumn2 = 0;
        int xWinsColumn3 = 0;

        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == 'X') {
                xWins++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(matrix[1][i] == 'X') {
                xWinsRow2++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(matrix[2][i] == 'X') {
                xWinsRow3++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if(matrix[i][0] == 'X') {
                xWinsColumn++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(matrix[i][1] == 'X') {
                xWinsColumn2++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(matrix[i][2] == 'X') {
                xWinsColumn3++;
            }
        }

        int[] checkFor3 = {xWins,xWinsRow2,xWinsRow3,xWinsColumn,xWinsColumn2,xWinsColumn3};
        for (int i = 0; i < 6 ; i++) {
            if (checkFor3[i] == 3){
                return true;
            }
        }
        //had to repeat getWinner Code here or else the method returns 'false' for diagonal wins
        if (matrix [0][0]== 'X' && matrix[1][1] =='X' && matrix[2][2] == 'X'){
            return true;
        } else if (matrix [0][2]== 'X' && matrix[1][1] =='X' && matrix[2][0] == 'X') {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        return !isTie() && !isInFavorOfX();
    }

    public Boolean isTie() {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X'){
                    xCount++;
                }else if (matrix[i][j]== 'O'){
                    oCount++;
                }
            }
        }
        return xCount==5;
    }

    public String getWinner() {
        // O 1 2  ----
        // 3 4 5 ----- 4 = i[1] j[1]
        // 6 7 8 ----- 7 = i[2]  j[1]
        String winner = "";
        if (isInFavorOfX()){
            winner = "X";
        }
        if (isInFavorOfO()){
            winner = "O";
        }
        if (matrix [0][0]== 'X' && matrix[1][1] =='X' && matrix[2][2] == 'X'){
             winner = "X";
        }
        if (matrix [0][2]== 'X' && matrix[1][1] =='X' && matrix[2][0] == 'X'){
            winner = "X";
        }
        if (matrix [0][0]== 'O' && matrix[1][1] =='O' && matrix[2][2] == 'O'){
            winner = "O";
        }
        if (matrix [0][2]== 'O' && matrix[1][1] =='O' && matrix[2][0] == 'O'){
            winner = "O";
        }
        return winner;
    }

}

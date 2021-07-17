package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix; //initalize matrix as 2d array

    public Board(Character[][] matrix) {
        this.matrix = matrix; //construct board for game
        //matrix example
        /*                 [row, column]
        {'X', 'O', 'X'}, [0,0] [0,1] [0,2]
        {'O', 'O', 'X'}, [1,0] [1,1] [1,2]
        {'X', 'X', 'O'}, [2,0] [2,1] [2,2]
        */
    }

    public Boolean isInFavorOfX() {
        Boolean isInFavorOfX = false; //set initial value to false cuz requires boolean
        Character[][] board = this.matrix;  //create board
        Integer countX = 0;
        Integer countO = 0;

        if (isTie())
            return false;

        for (int i = 0; i < 3; i++) { // iterate thru tic tac toe board 3x3 horizontal
            for (int j = 0; j < 3; j++) { //iterate thru vertically
                if (board[i][j] == 'X' )
                    countX++;
                else if (board[i][j] == 'O')
                    countO++;
            }

        }return countX > countO;
    }


    public Boolean isInFavorOfO() {
        return !isTie() && !isInFavorOfX();  //if it is not tie and not infavorofx it is in favor of O
    }

    public Boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() {
        Boolean isInFavorOfX = false; //set initial value to false cuz requires boolean
        Character[][] board = this.matrix;  //create board

        for (int i = 0; i < 3; i++) { // iterate thru tic tac toe board 3x3 horizontal


                if      (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X' ||
                        (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') ||
                        board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                        board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                    return "X";

                } else if
                        (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O' ||
                        (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') ||
                        board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                        board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                    return "O";
                }
        }
        return "";
    }
}

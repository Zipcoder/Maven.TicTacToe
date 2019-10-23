package rocks.zipcodewilmington.tictactoe;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * @author leon on 6/22/18.
 */

public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
    this.board = matrix;


    boolean hCheck = checkHorizontal();
    boolean vCheck = checkVertical();
        System.out.println(hCheck);
        System.out.println(vCheck);

    }
//Should be able to simply this and stop repeating*******************
    //***************************************************************
    public boolean checkHorizontal(/*char checker*/)
    {
        for( int i = 0; i <=2; i++) {
            if (board[i][0] ==  board[i][1] && board[i][0] == board[i][2]) {
//                if(board[i][i] == checker){ // pass in char and check
                    return true;
//                }
            }
        }
        return false;
    }

    public boolean checkVertical()
    {
        for( int i = 0; i <=2; i++) {
            if (board[0][i] ==  board[1][i] && board[0][i] == board[2][i]) {
//                if(board[i][i] == checker) { // pass in char and check
                    return true;
//                }
            }
        }
        return false;
    }


    public Boolean isInFavorOfX() {
        for (int i = 0; i <= 2; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[i][i] == 'X') { // pass in char and check
                    return true;
                }

            }
        }
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][i] == 'X') { // pass in char and check
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i <= 2; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (board[i][i] == 'O') { // pass in char and check
                    return true;
                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (board[i][i] == 'O') { // pass in char and check
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean isTie() {
     return(!checkVertical() && !checkHorizontal());
    }

    public String getWinner() {
        String winner = "";
        for( int i = 0; i <=2; i++) {
            if (board[i][0] ==  board[i][1] && board[i][0] == board[i][2]) {
                if(board[i][i] == 'X'){
                    winner = "X";
                }else if (board[i][i] == 'O'){
                    winner = "O";
                }
            }
        }
        for( int i = 0; i <=2; i++) {
            if (board[0][i] ==  board[1][i] && board[0][i] == board[2][i]) {
                if(board[i][i] == 'X') { // pass in char and check
                    winner = "X";
                }else if (board[i][i] == 'O'){
                winner = "O";
            }
            }
        }
        return winner;
    }

}

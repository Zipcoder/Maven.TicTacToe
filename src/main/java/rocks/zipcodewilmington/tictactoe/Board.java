package rocks.zipcodewilmington.tictactoe;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * @author leon on 6/22/18.
 */

public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
    this.board = matrix;

    }
//Should be able to simply this and stop repeating*******************
    //***************************************************************
    public  boolean checkHorizontal(Character checker) {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] == checker && board[i][1] == checker && board[i][2] == checker ){
                return true;
                }
            }
        return false;
    }

    public boolean checkVertical(Character checker) {
            for (int i = 0; i <= 2; i++) {
                if (board[0][i] == checker && board[1][i] == checker  && board[2][i] == checker) {
                    return true;
                    }
                }
            return false;
        }

    public boolean checkDiag(Character checker){
            if (board[0][0] == checker && board[1][1] == checker && board[2][2] == checker ){
                return true;
            }
            if(board[0][2] == checker && board[1][1] == checker &&  board[2][0] == checker ) {
                return true;
            }
        return false;
    }


    public Boolean isInFavorOfX() {
        return (getWinner().equals("X"));
    }

    public Boolean isInFavorOfO() {
        return (getWinner().equals("O"));
    }

    public Boolean isTie() { return (getWinner().equals("")); }

    public String getWinner() {
//        String winner = "";
//        for( int i = 0; i <=2; i++) {
//            if (board[i][0] ==  board[i][1] && board[i][0] == board[i][2]) {
//                if(board[i][i] == 'X'){
//                    winner = "X";
//                }else if (board[i][i] == 'O'){
//                    winner = "O";
//                }
//            }
//        }
//        for( int i = 0; i <=2; i++) {
//            if (board[0][i] ==  board[1][i] && board[0][i] == board[2][i]) {
//                if(board[i][i] == 'X') { // pass in char and check
//                    winner = "X";
//                }else if (board[i][i] == 'O'){
//                winner = "O";
//            }
//            }
//        }
////        if (isInFavorOfO()){
////            winner = "O";
////        }
////        else if(isInFavorOfX()){
////            winner = "X";
////        }

        if (checkDiag('X') || checkVertical('X') || checkHorizontal('X')) {
            return ("X");
        }
        if (checkDiag('O') || checkVertical('O') || checkHorizontal('O')) {
            return ("O");
        }
        return "";
    }
}

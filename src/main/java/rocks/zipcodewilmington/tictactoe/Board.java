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

        int trackerO = 0;
        int trackerX = 0;
        Character[][] board = this.matrix;
        if(isTie()){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'O') {
                    trackerO++;
                } else if (board[i][j] == 'X') {
                    trackerX++;
                }
            }
        }
        return trackerO < trackerX;
    }

    public Boolean isInFavorOfO() {
        int trackerO = 0;
        int trackerX = 0;
        Character[][] board = this.matrix;
        if(isTie()){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'O') {
                    trackerO++;
                } else if (board[i][j] == 'X') {
                    trackerX++;
                }
            }
        }
        return trackerX < trackerO;
    }

    public Boolean isTie() {
        boolean isTie = false;
        if(!getWinner().equals("X") && !getWinner().equals("O")) {
            isTie = true;
        }
        return isTie;
    }

    public String getWinner() {

        Character[][] board = this.matrix;
        String winner = "";
        //Check horizontals (i = outer) (j = inner)
        // 0 [ 0  1  2 ],
        // 1 [ 0  1  2 ],
        // 2 [ 0  1  2 ]

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') { // row0 O wins
                    winner = "O";
                } else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') { // row1 O wins
                    winner = "O";
                } else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {  // row2 O wins
                    winner = "O";
                } if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') { // row0 X wins
                    winner = "X";
                } else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') { // row1 X wins
                    winner = "X";
                } else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') { // row2 X wins
                    winner = "X";
                } if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') { // left to right diagonal "O"
                    winner = "O";
                } else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') { //right to left diagonal "O"
                    winner = "O";
                } if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') { // left to right diagonal "X"
                    winner = "X";
                } else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') { //right to left diagonal "X"
                    winner = "X";
                } if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') { // column0 O wins
                    winner = "O";
                } else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') { // column1 O wins
                    winner = "O";
                } else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') { // column2 O wins
                    winner = "O";
                } if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') { // column0 x wins
                    winner = "X";
                } else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') { // column1 X wins
                    winner = "X";
                } else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') { // column2 X wins
                    winner = "X";
                }
            }
        }
        //System.out.println(winner);
        return winner;
    }

}

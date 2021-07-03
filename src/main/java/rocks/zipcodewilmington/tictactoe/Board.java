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
        Boolean result=false;
        int countOfX = 0;
        int countOfO = 0;
        Character[][] board = this.matrix;

        if(isTie()==true){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    countOfX++;
                }
                if (board[i][j]=='O') {
                    countOfO++;
                }

            }
        }
        if (countOfX > countOfO) {
            result = true;
        }
        return result;
    }


    public Boolean isInFavorOfO() {
        Boolean result=false;
        int countOfX = 0;
        int countOfO = 0;
        Character[][] board = this.matrix;
        if(isTie()==true){
            return false;
        }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j].toString().toLowerCase().equals("x")) {
                            countOfX++;
                        }
                        if (board[i][j].toString().toLowerCase().equals("o")) {
                            countOfO++;
                        }

                    }
                }
        if (countOfO > countOfX) {
            result = true;
        }
        return result;
    }

    public Boolean isTie() {
        Boolean result=false;
        if(getWinner()!="X"&& getWinner()!="O"){
            result=true;
        }
        return result;
    }

        public String getWinner () {
            String result="";
            int countOfX = 0;
            int countOfO = 0;
            Character[][] board = this.matrix;
            if (board[0][0] =='X' && board[1][1] == 'X' && board[2][2]=='X') {
                result = "X";
            }
                if(board[0][2] =='X' && board[1][1]=='X' && board[2][0]=='X'){
                    result="X";
                }

            if (board[0][0] =='O' && board[1][1] == 'O' && board[2][2]=='O') {
                result = "O";
            }
                if(board[0][2] =='O' && board[1][1]=='O' && board[2][0]=='O'){
                    result="O";
                }

            for (int i = 0; i < 3; i++) {
                //for (int j = 0; j < 3; j++) {
                    //diagonal test

                    //horizontal test
                    if(board[i][0]=='X'&& board[i][1]=='X'&& board[i][2]=='X') {
                        result = "X";
                    }
                    //vertical test
                    if(board[0][i]=='X'&& board[1][i]=='X'&& board[2][i]=='X'){
                        result="X";
                    }
                    if(board[i][0]=='O'&& board[i][1]=='O'&& board[i][2]=='O') {
                        result = "O";
                    }
                    if(board[0][i]=='O'&& board[1][i]=='O'&& board[2][i]=='O') {
                        result = "O";
                    }

                }


            return result;
        }

    }
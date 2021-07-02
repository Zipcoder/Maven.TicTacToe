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
        int xCount = 0;
        int yCount = 0;
        Character[][] board = this.matrix;

        if(isTie()){
            return false;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //Check Rows
                if(board[i][j] == 'X'){
                    xCount++;
                } else if(board[i][j] == 'O'){
                    yCount++;
                }
            }
        }
        return xCount > yCount;
    }

    public Boolean isInFavorOfO() {
        return !isTie() && isInFavorOfX() == false;
    }

    public Boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() {
        Character[][] board = this.matrix;


        //Check Diagonal
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            return "X";
        } else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X'){
            return "X";
        } else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            return "O";
        } else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O'){
            return "O";
        }

        //Check Horizontal
        for(int i = 0; i < 3; i++){
                //Check Horizontal, Then Vertical
                if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X'){
                    return "X";
                } else if(board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O'){
                    return "O";
                }
        }

        //Check Vertical
        for(int i = 0; i < 3; i++){
            if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X'){
                return "X";
            } else if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O'){
                return "O";
            }
        }
        return "";
    }

}

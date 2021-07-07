package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] boardState;

    public Board(Character[][] matrix) {
        boardState = matrix;
    }

    public Boolean isInFavorOfX() {
        return (colWin('X') || rowWin('X') || diagWin('X'));
    }

    public Boolean isInFavorOfO() {
        return (colWin('O') || rowWin('O') || diagWin('O'));
    }

    public Boolean isTie() {
        if(isInFavorOfO()){
            return false;
        }
        else if(isInFavorOfX()){
            return false;
        }
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (boardState[i][j].equals(' ')) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }
        else if(isInFavorOfO()){
            return "O";
        }
        else{
            return "";
        }
    }

    private Boolean colWin(Character player){
        Boolean win = false;
        for(int i = 0; i < 3; i++){
            if(boardState[0][i].equals(player) && boardState[1][i].equals(player) && boardState[2][i].equals(player)){
                win = true;
                break;
            }
        }
        return win;
    }

    private Boolean rowWin(Character player){
        Boolean win = false;
        for(int i = 0; i < 3; i++){
            if(boardState[i][0].equals(player) && boardState[i][1].equals(player) && boardState[i][2].equals(player)){
                win = true;
                break;
            }
        }
        return win;
    }

    private Boolean diagWin(Character player){
        if(boardState[0][0].equals(player) && boardState[1][1].equals(player) && boardState[2][2].equals(player)){
            return true;
        }
        else if(boardState[0][2].equals(player) && boardState[1][1].equals(player) && boardState[2][0].equals(player)){
            return true;
        }
        else{
            return false;
        }
    }

}

package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] map;

    // constructor
    public Board(Character[][] matrix) {
        this.map = matrix;

    }

    public Boolean isInFavorOfX() {
        // loop through each
        for(int i = 0; i < map.length; i++){
            if(map[i][0] == 'X' && map[i][1] == 'X' && map[i][2] == 'X'){
                return true;
            }
            if(map[0][i] == 'X' && map[1][i] == 'X' && map[2][i] == 'X'){
                return true;
            }

        }
        // diagnol
        if(map[0][0] == 'X' && map[1][1] == 'X' && map[2][2] == 'X') {
            return true;
        }
        if(map[0][2] == 'X' && map[1][1] == 'X' && map[2][0] == 'X') {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        for(int i = 0; i < map.length; i++){
            if(map[i][0] == 'O' && map[i][1] == 'O' && map[i][2] == 'O'){
                return true;
            }
            if(map[0][i] == 'O' && map[1][i] == 'O' && map[2][i] == 'O'){
                return true;
            }
        }
        // diagnol
        if(map[0][0] == 'O' && map[1][1] == 'O' && map[2][2] == 'O') {
            return true;
        }
        if(map[0][2] == 'O' && map[1][1] == 'O' && map[2][0] == 'O') {
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        for(int i = 0; i < map.length; i++){
            for(int y = 0; y < map.length; y++){
                if(map[i][y] == ' '){
                    return false;
                }
            }

        }
        return true;
    }

    public String getWinner() {
        if(isInFavorOfO() == true){
            return "O";

        }
        if(isInFavorOfX() == true){
            return "X";

        }

        // this is a tie!
        return "";
    }

}

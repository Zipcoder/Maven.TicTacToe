package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] boardMap;

    public Board(Character[][] matrix) {
        this.boardMap = matrix;
    }

    private String checkRows() {
        for (int i = 0; i < boardMap.length; i++) {
            if(boardMap[i][0] == 'X' && boardMap[i][1] == 'X' && boardMap[i][2] == 'X') return "X";
            if(boardMap[i][0] == 'O' && boardMap[i][1] == 'O' && boardMap[i][2] == 'O') return "O";
        }
        return " ";
    }

    private String checkColumns() {
        for (int i = 0; i < boardMap.length; i++) {
            if(boardMap[0][i] == 'X' && boardMap[1][i] == 'X' && boardMap[2][i] == 'X') return "X";
            if(boardMap[0][i] == 'O' && boardMap[1][i] == 'O' && boardMap[2][i] == 'O') return "O";
        }
        return " ";
    }

    private String checkDiagnals() {
        if(boardMap[0][0] == 'X' && boardMap[1][1] == 'X' && boardMap[2][2] == 'X') return "X";
        if(boardMap[0][2] == 'X' && boardMap[1][1] == 'X' && boardMap[2][0] == 'X') return "X";

        if(boardMap[0][0] == 'O' && boardMap[1][1] == 'O' && boardMap[2][2] == 'O') return "O";
        if(boardMap[0][2] == 'O' && boardMap[1][1] == 'O' && boardMap[2][0] == 'O') return "O";

        return " ";
    }


    public Boolean isInFavorOfX() {
        if(checkDiagnals().equals("X") || checkRows().equals("X") || checkColumns().equals("X")){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if(checkDiagnals().equals("O") || checkRows().equals("O") || checkColumns().equals("O")){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if(isInFavorOfX()) return "X";
        if(isInFavorOfO()) return "O";
        return "";
    }
}

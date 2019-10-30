package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] xO;


    public Board(Character[][] matrix) {
        this.xO = matrix;
    }


    public Boolean isInFavorOfX() {

        return (checkHorizontal().equals("X") || checkVertical().equals("X") || checkDiagonal().equals("X"));
    }

    public Boolean isInFavorOfO() {
        return (checkHorizontal().equals("O") || checkVertical().equals("O") || checkDiagonal().equals("O"));
    }


    public Boolean isTie() {

        if (checkHorizontal().equals(' ') && checkVertical().equals(' ') && checkDiagonal().equals(' ')){
            return true;
        }
        else if(!isInFavorOfO() && !isInFavorOfX()){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        }

        if (isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }


    public String checkHorizontal() {
        String symbol = "";


        for (int row = 0; row < xO.length; row++) {

            if (xO[row][0].equals(xO[row][1]) && xO[row][0].equals(xO[row][2]) && (!xO[row][0].equals(' '))) {
                symbol = xO[row][0].toString();
                break;
            }
        }
        return symbol;
    }


    public String checkVertical() {
        String symbol = "";


        for (int col = 0; col < xO.length; col++) {

            if (xO[0][col].equals(xO[1][col]) && xO[0][col].equals(xO[2][col]) && (!xO[0][col].equals(' '))) {
                symbol = xO[0][col].toString();
                break;
            }
        }
        return symbol;
    }


    public String checkDiagonal() {
        String symbol = "";

        if (xO[0][2].equals(xO[1][1]) && xO[0][2].equals(xO[2][0]) && !xO[2][0].equals(' ')) {
            symbol = xO[1][1].toString();

        }
        else if (xO[0][0].equals(xO[1][1]) && xO[0][0].equals(xO[2][2]) && !xO[0][0].equals(' ')) {
            symbol = xO[1][1].toString();

        }
        return symbol;
    }
}

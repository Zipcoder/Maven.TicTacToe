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
        int countOfX = 0;
        int countOfO = 0;
        Character[][] board = this.matrix;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 'X'){
                    countOfX++;
                } else if(board[i][j] == 'O'){
                    countOfX++;
                }
            }
        }
        return countOfX > countOfO;
    }


    public Boolean isInFavorOfO() {
        int countOfX = 0;
        int countOfO = 0;
        Character[][] board = this.matrix;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 'X'){
                    countOfX++;
                } else if(board[i][j] == 'O'){
                    countOfX++;
                }
            }
        }
        return countOfO > countOfX;
    }

    public Boolean isTie() {
        Character[][] board = this.matrix;
        //Board board = new Board(new Character[3][3]);

//       for(int i=0;i<3;i++) {
//           for (int j = 0; j < 3; j++){
//
//               if (board[i][0]&&[i][1]&&[i][2])
//
//
//           if ([0][j]&&[1][j]&&[2][j])
//
//
//           if ([i][j]==[j][i]){
//
//       }
        return true;
    }

    public String getWinner() {
        return null;
    }

}

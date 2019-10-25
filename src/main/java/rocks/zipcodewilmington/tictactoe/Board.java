package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] boardSetup;

    public Board(Character[][] matrix) {
        boardSetup = matrix;

    }


    // This method should be capable of say whether X
    public Boolean isInFavorOfX()
    {

        if (checkRows() == 'X') return true;

        else if (checkColumns() == 'X') return true;

        else if (checkDiagonals() == 'X') return true;

            else return false;

    }

    //should return true if its is in fav
    public Boolean isInFavorOfO()
    {
        if (checkRows() == 'O') return true;

        else if (checkColumns() == 'O') return true;

        else if (checkDiagonals() == 'O') return true;

        else return false;
    }

    // should return true if its a tie else return false
    public Boolean isTie()
    {
       //if (checkRows() == '\0' && checkColumns() == '\0' && checkDiagonals() == '\0')

        if (!isInFavorOfX() && !isInFavorOfO())
            return true;
        else
            return false;


    }

    //if X is winner return "X" if O is winner return "O" .. if tie return ""
    public String getWinner()
    {

        if(isInFavorOfX()) return "X";
        else if(isInFavorOfO()) return "O";
        else return "";

    }

    //method to check if the values in array is equal or not
    public boolean checkEqual(Character[] charArray)
    {
            if(charArray[0]== charArray[1] && charArray[1] == charArray[2] && charArray[0] != ' ') //checking if all the values are equal (X or O)

            {
                return true;
            }
            else
            {
                return false;
            }

    }

    public char checkRows()
    {
        char favor = '\0';

        //each row
        for(int i = 0; i<=2;i++)

        {
            //Boolean flag = checkEqual(boardSetup[i]);
            if (checkEqual(boardSetup[i]))
            {
                favor = boardSetup[i][0];
                break;
            }

        }
        return favor;
    }

    public char checkColumns()
    {
        char favor = '\0';

        //each column
        for(int i = 0; i<=2;i++)

        {
            Character[] charArray = {boardSetup[0][i], boardSetup[1][i], boardSetup[2][i]};
            if (checkEqual(charArray))
            {
                favor = boardSetup[0][i];
                break;
            }

        }
        return favor;
    }

    public char checkDiagonals()
    {
        char favor = '\0';

            Character[] charArray1 = {boardSetup[0][0], boardSetup[1][1], boardSetup[2][2]}; //diagonal1
            Character[] charArray2 = {boardSetup[0][2], boardSetup[1][1], boardSetup[2][0]}; //diagonal2
            if (checkEqual(charArray1) || checkEqual(charArray2))
            {
                favor = boardSetup[1][1];

            }

        return favor;
    }




}

public class MagicSquares {
    public static boolean isMagic(int[][] squar){

        for (int r = 0; r < squar.length; r++){
            if (squar.length != squar[r].length){
                return false;
            }
        }

        int magicNum = 0;
        int newNum = 0;


        for (int c = 0; c < squar.length; c++){
            magicNum += squar[0][c];
        }

        for(int r = 0; r < squar.length; r++){
            for (int c = 0; c < squar[r].length; c++){
                newNum+=squar[r][c];
            }
            if (newNum != magicNum){
                return false;
            }
            newNum = 0;
        }

        for (int c = 0; c < squar.length; c++){
            for (int r = 0; r < squar.length; r++){
                newNum += squar[r][c];
            }
            if (newNum != magicNum){
                return false;
            }
            newNum = 0;
        }

        for (int r = 0; r < squar.length; r++)
        {
            newNum += squar[r][r];
        }
        if (newNum != magicNum){
            return false;
        }
        newNum = 0;

        for (int r = squar.length-1; r >= 0; r--)
        {
            newNum += squar[r][r];
        }
        if (newNum != magicNum){
            return false;
        }
        newNum = 0;


        return true;
    }
}
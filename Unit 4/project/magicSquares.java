import java.util.Arrays;

public class magicSquares {
    public static boolean isMagic(int[][] squar){

        for (int r = 0; r < squar.length; r++){
            if (squar.length != squar[r].length){
                return false;
            }
        }

        int magicNum = 0;
        int newNum = 0;

        for(int r = 0; r < squar.length; r++){
            for (int c = 0; c < squar[r].length; c++){
                magicNum+=squar[r][c];
            }
        }

        for (int c = 0; c < squar.length; c++){
            for (int r = 0; r < squar.length; r++){
                newNum += squar[r][c];
            }
        }
        if (newNum != magicNum){
            return false;
        }
        newNum = 0;

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


    public static void main(String[] args) {
        int [][] ints1 = {{2},{4}};
        int[][] ints2 = {{3}};
        int[][] ints3 = {{2,4},{3,1}};
        int[][] ints4 = {{2,7,6},{}}

        System.out.println(isMagic(ints1));
        System.out.println(isMagic(ints2));
        System.out.println(isMagic(ints3));
    }
}
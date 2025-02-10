import java.util.Arrays;
public class ArraysBut2D{
    public static void main(String[] args) {
        int[][] matrices = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        //                              row 1   row 2   row 3
        for(int r = 0; r < matrices.length; r++){
            for(int c = 0; c<matrices[r].length; c++){
                System.out.print(matrices[r][c]+"\t");
            }
        System.out.println();
        }
        System.out.println(Arrays.deepToString(matrices));
    }
}
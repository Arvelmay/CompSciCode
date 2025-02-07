import java.util.*;

public class Game {
    public static void main(String[] args) {
        
    }

    public void printGrid(String[][] grid) {
        String[][] gameGrid = grid;
        for (int r = 0; r < gameGrid.length; r++){
            for (int c = 0; c < gameGrid[r].length; c++){
                System.out.print(gameGrid[r][c]);
            }
            System.out.println();
        }
    }
}

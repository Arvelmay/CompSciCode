import java.util.*;

public class Game {
    public static void main(String[] args) {
        Cell[][] mainGrid= new Cell[10][10];

        fillGrid(mainGrid);
        printGrid(mainGrid);
    }

    public static void fillGrid(Cell[][] grid) {
        Random randyboi = new Random();
        int[] randomSpots = new int[10];

        for(int i = 0; i < randomSpots.length; i++){
            int[] spot = new int[2];

            do{
                spot[0] = randyboi.nextInt(9);
                spot[1] = randyboi.nextInt(9);
            }while(grid[spot[0]][spot[1]] != null && spot[1] != 9 && !(spot[0] == 0 && spot[1] == 9));

            randomSpots[i] = randyboi.nextInt(4);

            switch(randomSpots[i]){
                case 0: grid[spot[0]][spot[1]] = new CaveTroll();
                break;
                case 1: grid[spot[0]][spot[1]] = new Goblin();
                break;
                case 2: grid[spot[0]][spot[1]] = new MountainTroll();
                break;
                case 3: grid[spot[0]][spot[1]] = new Hobgoblin();
                break;
            }
        }

        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if (grid[r][c] == null){
                    grid[r][c] = new Cell();
                }
            }
        }
    }

    public static void printGrid(Cell[][] grid){
        for(int r = 0; r<grid.length;r++){
            for(int c = 0; c < grid[r].length; c++){
                if (grid[r][c].isVisisble()){
                    System.out.print(grid[r][c].getVis());
                }
                else{
                    System.out.print("--");
                }
            }
            System.out.println();
        }
    }
}

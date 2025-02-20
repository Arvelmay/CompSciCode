import java.util.*;

public class Game {
    public static void main(String[] args) {
        //-1 = lose, 0 = playing, 1 = win
        int win = 0;
        Cell[][] mainGrid= new Cell[10][10];
        int[] plCell = new int[]{0,9};
        int[] move = new int[2]; 

        fillGrid(mainGrid);
        do {
            printGrid(mainGrid);
            move = mainGrid[plCell[0]][plCell[1]].move();
            if(mainGrid[plCell[0]+move[0]][plCell[1]+move[1]].isMonster() == false){
                mainGrid[plCell[0]+move[0]][plCell[1]+move[1]] = new Player(mainGrid[plCell[0]][plCell[1]].getHealth(), mainGrid[plCell[0]][plCell[1]].getAttack(), mainGrid[plCell[0]][plCell[1]].getMagic());
                mainGrid[plCell[0]][plCell[1]] = new Cell();
                mainGrid[plCell[0]][plCell[1]].setVisable(true);
                plCell[] = [plCell[0]+move[0], plCell[1]+move[1]];
            }
        } while (win == 0);
        if (win == -1){
            System.out.println("YOU LOSE");
        }
        else if(win == 1){
            System.out.println("YOU WIN");
        }
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

        grid[0][9] = new Player();

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

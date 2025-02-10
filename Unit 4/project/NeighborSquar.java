public class NeighborSquar {
    public static void main(String[] args){
        String[][] grid = new String[8][8];
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid.length; c++){
                if (Math.random() <= 0.40){
                    grid[r][c] = "*";
                }
                else{
                    grid[r][c] = "_";
                }
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
        int isolatedCount = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid.length; c++){
                if (grid[r][c].equals("*")){
                    //Checks main grid
                    if ((r != 0 && grid[r-1][c].equals("_")) && (r != 7 && grid[r+1][c].equals("_")) && (c != 0 && grid[r][c-1].equals("_")) && (c != 7 && grid[r][c+1].equals("_"))){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    //Checks sides
                    else if (r == 0 && c != 0 && grid[r+1][c].equals("_") && (c != 0 && grid[r][c-1].equals("_")) && (c != 7 && grid[r][c+1].equals("_"))){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (r == 7 && c != 0 && grid[r-1][c].equals("_") && (c != 0 && grid[r][c-1].equals("_")) && (c != 7 && grid[r][c+1].equals("_"))){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (c == 0 && r != 0 && grid[r][c+1].equals("_") && (r != 0 && grid[r+1][c].equals("_")) && (r != 7 && grid[r-1][c].equals("_"))){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (c == 7 && r != 0 && grid[r][c-1].equals("_") && (r != 0 && grid[r+1][c].equals("_")) && (r != 7 && grid[r-1][c].equals("_"))){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    //Checks corners
                    else if (r == 0 && c == 0 && grid[r+1][c].equals("_") && grid[r][c+1].equals("_")){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (r == 7 && c == 0 && grid[r-1][c].equals("_") && grid[r][c+1].equals("_")){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (r == 0 && c == 7 && grid[r+1][c].equals("_") && grid[r][c-1].equals("_")){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                    else if (r == 7 && c == 7 && grid[r-1][c].equals("_") && grid[r][c-1].equals("_")){
                        System.out.println(r+","+c+" is isolated");
                        isolatedCount++;
                    }
                }
            }
        }
        System.out.println("There are "+isolatedCount+" isolated cells");
    }
}

import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Enter the name of the first bowler");
        String n = scannyboi.nextLine();
        Bowler human1 = new Bowler(n+", the one who spares");
        System.out.println("Enter the name of the second bowler");
        n = scannyboi.nextLine();
        Bowler human2 = new Bowler(n+", the one who splits");

        //Game 1
        System.out.println("\n----------\nGame 1\n----------");
        System.out.println("Enter the score for the first bowler: ");
        int score = scannyboi.nextInt();
        human1.changeGame(1, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        human2.changeGame(1, score);
        System.out.println("The score is "+human1.getName()+" with a score of "+human1.getGame(1)+" vs. "+human2.getName()+" with a score of "+human2.getGame(1));

        //Game 2
        System.out.println("----------\nGame 2\n----------");
        System.out.println("Enter the score for the first bowler: ");
        score = scannyboi.nextInt();
        human1.changeGame(2, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        human2.changeGame(2, score);
        System.out.println("The score is "+human1.getName()+" with a score of "+human1.findSeries()+" and an average of "+human1.getAverage()+" and a high game of "+human1.highGame()+" vs. "+human2.getName()+" with a score of "+human2.findSeries()+" and an average of "+human2.getAverage()+" and a high game of "+human2.highGame());

        //Game 3
        System.out.println("----------\nGame 3\n----------");
        System.out.println("Enter the score for the first bowler: ");
        score = scannyboi.nextInt();
        human1.changeGame(3, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        human2.changeGame(3, score);
        System.out.println("The score is "+human1+"\nvs.\n"+human2);
        if (human1.findSeries() > human2.findSeries()){
            System.out.println("\n"+human1.getName().toUpperCase()+", WINS!");
        }
        else if (human2.findSeries() > human1.findSeries()){
            System.out.println("\n"+human1.getName().toUpperCase()+", WINS!");
        }
        else{
            System.out.println("TIE GAME");
        }
        scannyboi.close();
    }
}

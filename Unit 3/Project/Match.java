import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Enter the name of the first bowler");
        String n = scannyboi.nextLine();
        Bowler man1 = new Bowler(n+", the one who spares");
        System.out.println("Enter the name of the second bowler");
        n = scannyboi.nextLine();
        Bowler man2 = new Bowler(n+", the one who splits");

        //Game 1
        System.out.println("\n----------\nGame 1\n----------");
        System.out.println("Enter the score for the first bowler: ");
        int score = scannyboi.nextInt();
        man1.changeGame(1, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        man2.changeGame(1, score);
        System.out.println("The score is "+man1.getName()+" with a score of "+man1.getGame(1)+" vs. "+man2.getName()+" with a score of "+man2.getGame(2));

        //Game 2
        System.out.println("----------\nGame 2\n----------");
        System.out.println("Enter the score for the first bowler: ");
        score = scannyboi.nextInt();
        man1.changeGame(2, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        man2.changeGame(2, score);
        System.out.println("The score is "+man1.getName()+" with a score of "+man1.findSeries()+" and an average of "+man1.getAverage()+" and a high game of "+man1.highGame()+" vs. "+man2.getName()+" with a score of "+man2.findSeries()+" and an average of "+man2.getAverage()+" and a high game of "+man2.highGame());

        //Game 3
        System.out.println("----------\nGame 3\n----------");
        System.out.println("Enter the score for the first bowler: ");
        score = scannyboi.nextInt();
        man1.changeGame(3, score);
        System.out.println("Enter the score for the second bowler: ");
        score = scannyboi.nextInt();
        man2.changeGame(3, score);
        System.out.println("The score is "+man1+" vs. "+man2);
        if (man1.findSeries() > man2.findSeries()){
            System.out.println("\n"+man1.getName().toUpperCase()+" WINS !");
        }
    }
}

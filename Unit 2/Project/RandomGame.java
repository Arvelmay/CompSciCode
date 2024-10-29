import java.util.*;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);
        Random randyboi = new Random();
        String playAgain = "";
        do{
            //loop for the game
            int random1 = randyboi.nextInt(50)+1;
            int random2 = randyboi.nextInt(50)+1;
            String operation = "";
            int useranswer = 0;
            int realanswer;
            System.out.print("Here are two numbers, "+random1+" and "+random2+".\nEnter add, sub, mult, or div: ");
            operation = scannyboi.nextLine();
            switch (operation){
                //calculating and input :)
                case "add": System.out.print("Enter the answer to "+random1+" + "+random2+": ");
                    useranswer = scannyboi.nextInt();
                    scannyboi.nextLine();
                    realanswer = random1 + random2;
                    if (useranswer == realanswer){
                        System.out.println("Correct!");
                    }
                    else{
                        System.out.println("Incorrect. The real answer was "+realanswer);
                    }
                    break;
                case "sub": System.out.print("Enter the answer to "+random1+" - "+random2+": ");
                    useranswer = scannyboi.nextInt();
                    scannyboi.nextLine();
                    realanswer = random1 - random2;
                    if (useranswer == realanswer){
                        System.out.println("Correct!");
                    }
                    else{
                        System.out.println("Incorrect. The real answer was "+realanswer);
                    }
                    break;
                case "mult": System.out.print("Enter the answer to "+random1+" * "+random2+": ");
                    useranswer = scannyboi.nextInt();
                    scannyboi.nextLine();
                    realanswer = random1 * random2;
                    if (useranswer == realanswer){
                        System.out.println("Correct!");
                    }
                    else{
                        System.out.println("Incorrect. The real answer was "+realanswer);
                    }
                    break;
                case "div": System.out.print("Enter the answer to "+random1+" / "+random2+": ");
                    useranswer = scannyboi.nextInt();
                    scannyboi.nextLine();
                    realanswer = random1 / random2;
                    if (useranswer == realanswer){
                        System.out.println("Correct!");
                    }
                    else{
                        System.out.println("Incorrect. The real answer was "+realanswer);
                    }
                    break;
            }
            System.out.print("Play again (y/n): ");
            playAgain = scannyboi.nextLine().toLowerCase();
        } while(playAgain.equals("y"));
        scannyboi.close();
    }
}
import java.util.Scanner;

public class PhoneClient{
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);


        int[] numList = new int[100]; 
        boolean keepGoing = true;
        int preChoice = 0;
        int userInput = 0;
        do { 
            if (preChoice ==1){
                userInput = 1;
            }
            else {
                System.out.println("What would you like to do?\n1\tEnter a number\n2\tQuit");
                userInput = scannyboi.nextInt();
            }
            switch(userInput){
                case 1: System.out.println("Enter a new number that is different from the previous ones:");
                int numInput = scannyboi.nextInt();
                for (int i = 0; i<numList.length; i++){
                    if (numInput == numList[i]){
                        System.out.println("This was already entered.");
                        preChoice = 1;
                        break;
                    }
                }
                PhoneNumber newPhone = new PhoneNumber(userInput);
                break;

                case 2: keepGoing = false;
                break; 
            }
        } while (keepGoing);
    }
}
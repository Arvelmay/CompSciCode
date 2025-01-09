import java.util.Scanner;

public class PhoneClient{
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);


        int[] numList = new int[100]; 
        boolean keepGoing = true;
        do { 
            System.out.println("What would you like to do?\n1\tEnter a number\n2\tQuit");
            int userInput = scannyboi.nextInt();
            switch(userInput){
                case 1: System.out.println("Enter a new number that is different from the previous ones:");
                int numInput = scannyboi.nextInt();
                for (int i = 0; i<numList.length; i++){

                }

                case 2: 
            }
        } while (keepGoing);
    }
}
import java.util.Scanner;

/**
 * Write a description of class HomeClient here.
 *
 * @author Alfonso M
 * @version 1.0
 */
public class HomeClient
{
    public static void main(){
        Scanner scannyboi = new Scanner(System.in);
        boolean keepGoing = true;

        //Asks the user to input the details of the home and creates a home with it
        System.out.println("Enter the address of the home: ");
        String address = scannyboi.nextLine();
        System.out.println("Enter the city of the home: ");
        String city = scannyboi.nextLine();
        System.out.println("Enter the zip code of the home: ");
        int zipCode = scannyboi.nextInt();
        scannyboi.nextLine();
        System.out.println("Enter the square feet of the home: ");
        int squareFt = scannyboi.nextInt();
        scannyboi.nextLine();
        System.out.println("Enter the value of the home: ");
        double value = scannyboi.nextDouble();
        scannyboi.nextLine();
        Home userHome = new Home(address, city, zipCode, squareFt, value);
        do{
            System.out.println("What would you like to do?\n1\tView all property details\n2\tChange the square footage\n3\tFind the appreciation value\n4\tFind the monthly payment\n5\tFind the price per square foot\n6\tCreate a new property\n7\tQuit");
            int choice = scannyboi.nextInt();
            switch(choice){
                //Shows user all property details
                case 1: System.out.println(userHome+"\n"+squareFt);
                    break;
                case 2: System.out.println("What would you like to change the square footage to? ");
                    userHome.updateSF(scannyboi.nextInt());
                    scannyboi.nextLine();
                    break;
                case 3: System.out.println("How many years in advance do you want to check? ");
                    int y = scannyboi.nextInt();
                    scannyboi.nextLine();
                    System.out.println("What, in decimals, is the rate of appreciation? ");
                    double r = scannyboi.nextDouble();
                    scannyboi.nextLine();
                    System.out.println("Your homes appreciation in "+y+" years at a rate of "+r*100+"% is "+userHome.appreciation(r, y));
                    break;
                case 4: System.out.println("What was your down payment? ");
                    double dp = scannyboi.nextDouble();
                    scannyboi.nextLine();
                    System.out.println("What is the annual rate? ");
                    double rate = scannyboi.nextDouble();
                    scannyboi.nextLine();
                    System.out.println("Enter the total amount of payments: ");
                    int p = scannyboi.nextInt();
                    scannyboi.nextLine();
                    System.out.println("Your monthly payments will be: "+userHome.monthlyPay(dp,rate,p));
                    break;
                case 5: System.out.println("Your home's price per square foot is: "+ userHome.pricePerSq());
                    break;
                case 6: System.out.println("Enter the address of the home: ");
                    address = scannyboi.nextLine();
                    System.out.println("Enter the city of the home: ");
                    city = scannyboi.nextLine();
                    System.out.println("Enter the zip code of the home: ");
                    zipCode = scannyboi.nextInt();
                    scannyboi.nextLine();
                    System.out.println("Enter the square feet of the home: ");
                    squareFt = scannyboi.nextInt();
                    scannyboi.nextLine();
                    System.out.println("Enter the value of the home: ");
                    value = scannyboi.nextDouble();
                    scannyboi.nextLine();
                    userHome = new Home(address, city, zipCode, squareFt, value);
                    break;
                case 7: keepGoing = false;
                    break;
                default: System.out.println("Error reading choice, enter again.");
            }
        }while(keepGoing);
        scannyboi.close();
    }
}

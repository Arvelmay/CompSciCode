import java.util.Scanner;

public class University
{
    public static void main(String[] args){
        Scanner scannyboi = new Scanner(System.in);
        System.out.println("Welcome to Java University!\n\n");
        System.out.println("Enter the number of credit hours.");
        int creditHrs = scannyboi.nextInt();
        System.out.println("Are you true-Graduate false-Undergraduate?");
        boolean underGrad = scannyboi.nextBoolean();
        System.out.println("Are you true-in state false-out of state");
        boolean inState = scannyboi.nextBoolean();
        System.out.println("Will you park? (true/false)");
        boolean parkStat = scannyboi.nextBoolean();
        System.out.println("Will you pay monthly(true/false)");
        boolean monthly = scannyboi.nextBoolean();
        double total;
        int rate;
        if (underGrad){
            if (inState){
                rate = 450;
            }
            else{
                rate = 675;
            }
        }
        else{
            if (inState){
                rate = 700;
            }
            else{
                rate = 980;
            }
        }
        if (parkStat){
            rate += 40;
        }
        if (monthly){
             rate *= 1.08;
        }
        total = rate*creditHrs;
        System.out.println("Your total is: "+total+"\nMonthly payment is:"+rate+"\nHave a nice day");scannyboi.close();
    }
}
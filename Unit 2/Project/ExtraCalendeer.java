import java.util.Scanner;

public class ExtraCalendeer {
    public static void main(String[] args){
        Scanner scannyboi = new Scanner(System.in);

        //collect input
        int startday;
        do{
        System.out.println("What day does the year start on (1-sunday, 2-monday... )?");
        startday = scannyboi.nextInt()-1;
        }while(startday < 0 || startday > 6);
        boolean leap;
        System.out.println("Is it a leap year? (true/false)");
        leap = scannyboi.nextBoolean();
        scannyboi.close();
        month(startday, "Jan", leap);
        month(startday+3, "Feb", leap);
        month(startday+4, "Mar", leap);
        month(startday, "Apr", leap);
        month(startday+2, "May", leap);
        month(startday+5, "Jun", leap);
        month(startday, "Jul", leap);
        month(startday+3, "Aug", leap);
        month(startday-1, "Sep", leap);
        month(startday+1, "Oct", leap);
        month(startday+4, "Nov", leap);
        month(startday-1, "Dec", leap);
    }

    public static void month(int startday, String month, boolean leap){
        int days = 0;
        //Days at top
        System.out.println("\t\t\t"+month);
        System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
        //casing
        switch(month){
            case "Jan": days = 31; break;
            case "Feb":
            if (leap){
                days = 29;
            }
            else{
                days = 28;
            } break;
            case "Mar": days = 31; break;
            case "Apr": days = 30; break;
            case "May": days = 31; break;
            case "Jun": days = 30; break;
            case "Jul": days = 31; break;
            case "Aug": days = 31; break;
            case "Sep": days = 30; break;
            case "Oct": days = 31; break;
            case "Nov": days = 30; break;
            case "Dec": days = 31; break;
        }
        //LOOPIN TIMEEMEMEM
        for (int ii = 0; ii < startday; ii++){
            System.out.print("\t");
        }
        for (int i = 1; i <= 7-startday; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 8-startday; i <= days; i++){
            System.out.print(i+"\t");
            if((i+startday)%7 == 0){
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}
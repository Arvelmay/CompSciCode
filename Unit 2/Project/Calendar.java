import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        Scanner scannyboi = new Scanner(System.in);

        //collect input
        int startday;
        do{
        System.out.println("What day does the month start on (1-sunday, 2-monday... )?");
        startday = scannyboi.nextInt()-1;
        }while(startday < 0 || startday > 6);
        int days;
        do{
        System.out.println("How many days are in the month (28-31)?");
        days = scannyboi.nextInt();
        }while(days > 31 || days < 28);

        //Days at top
        System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
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
        scannyboi.close();
    }
}

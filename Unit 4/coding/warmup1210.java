import java.util.Scanner;

public class warmup1210 {
    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);

        //problem 1
        double[] randArray = new double[10];
        for (int i = 0; i < randArray.length; i++){
            randArray[i] = Math.random()*5+5;
            System.out.println(randArray[i]);
        }

        //problem 2
        System.out.println("How many Strings do you want to enter?");
        int userNum = scannyboi.nextInt();
        scannyboi.nextLine();
        String[] strang = new String[userNum];
        for (int i = 0; i < strang.length; i++){
            System.out.print("Enter string #"+(i+1)+":\t");
            strang[i] = scannyboi.nextLine();
        }

        //problem 3
        int goofyArrayWithTheBracketsBehindAndAReallyLongNameAndMinorSpelingMistakesToMessWithMR_Troy [] = new int[7];
        System.out.println(goofyArrayWithTheBracketsBehindAndAReallyLongNameAndMinorSpelingMistakesToMessWithMR_Troy[0]);
    }
}

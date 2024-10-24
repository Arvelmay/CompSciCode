import java.util.Scanner;
/*
    Write a static method that takes
    an int number of seconds
    and prints how many minutes and seconds that is
    
    e.g. ExtraWork.convertSexs(100)
    100 seconsd is 1 minute and 40 seconds
*/
public class XtraWrk
{
    public static void convertSecs(int secs){
        int minutes = secs/60;
        int newSecs = secs%60;
        System.out.println(secs+" seconds is "+minutes+" minutes and "+newSecs+" seconds");
    }
    
    public static void main(String[] args){
        Scanner scannyBoi = new Scanner(System.in);
        
        System.out.print("Give a number of seconds: ");
        int seccccss = scannyBoi.nextInt();
        XtraWrk.convertSecs(seccccss);scannyBoi.close();
    }
}

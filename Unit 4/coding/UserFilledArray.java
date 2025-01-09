// used for scanner and arrays
import java.util.*;

public class UserFilledArray {
    public static int getTotalHappiness(Emotion[] arr){
        int totalHappiness=0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] != null){
                totalHappiness += arr[i].getHappiness();
            }
        }
        return totalHappiness;
    }

    public static void main(String[] args) {
        Scanner scannyboi = new Scanner(System.in);
        Emotion[] emos = new Emotion[10];
        int thisEmotion = 0;
        int logicalSize = 0;

        for (int i = 0; i<emos.length && thisEmotion!=-1; i++){
            System.out.println("Please provide an emotion on a scale of 1-7");
            System.out.println("Enter -1 to quit");
            thisEmotion = scannyboi.nextInt();
            if (thisEmotion != -1){
                emos[i] = new Emotion(thisEmotion);
                logicalSize++;
            }
            System.out.println(Arrays.toString(emos));
        }
        System.out.println("Logical Size is "+logicalSize);
        for (Emotion emo: emos){
            if(emo != null){

            }
        }
    }
}
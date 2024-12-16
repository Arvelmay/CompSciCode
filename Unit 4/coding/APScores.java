
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class APScores
{
    public static int generateScore(){
        double prob = Math.random();
        if (prob >= .732){ return 5;}
        else if (prob>= .508) { return 4;}
        else if (prob>= .32) { return 3;}
        else if (prob>= .225) { return 2;}
        else { return 1; }
        }
    public static int[] generateArray(int size){
        int[] scores = new int[size];
        for (int i = 0;i<scores.length;i++){
            scores[i] = generateScore();}
        return scores;}
    
    public static void writeToFile(int[] scores) throws IOException{
    
        int n = scores.length;
        PrintWriter writer = new PrintWriter(n+"scores.txt");
        
        
        for (int i = 0; i<scores.length-1;i++){
            writer.print(scores[i] +", ");}
        writer.print(scores[scores.length-1]);
         
        writer.close();
    }
    public static int[] readFromFile(String filepath) throws IOException{
        Scanner reader = new Scanner(new File(filepath));
        reader.useDelimiter(", ");
        String cap = filepath.replace("scores.txt","");
        int size = Integer.parseInt(cap);
        int [] scores = new int[size];
        for (int i = 0; i<size; i++){
        
            scores[i] = Integer.parseInt(reader.next());
        
        }
        return scores;
        }
    public static void main(String[] args) throws IOException{
        
        //int[] scoresForFile = generateArray(90000);
        //writeToFile(scoresForFile);
        int[] scoresFromFile = readFromFile("90000scores.txt");
        //System.out.println(Arrays.toString(scoresForFile));
        System.out.println(Arrays.toString(scoresFromFile));
        
        int[] counter = new int[6];
        //Remember, counter starts out as
        //[0,0,0,0,0,0]
        
        for (int i = 0; i< scoresFromFile.length; i++){
            //Say the current scores is a 5
            //Go to counter[5] and increment that
            counter[ scoresFromFile[i]  ]++;
        }
        //for (int score: scoresFromFile){
        //    counter[score]++;}
        System.out.println(Arrays.toString(counter));
        
        System.out.println();
        System.out.println("Score Report");
        System.out.println("____________");
        System.out.println("Score\tNumber");
        System.out.println("____________");
        for (int i = counter.length-1;i>0;i--){
        System.out.println(i +"\t"+counter[i]);}
        
        
        
       
        
        
    
    }
}

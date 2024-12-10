public class LinearSearch {
    public static void main(String[] args){
        int[] secretNums = new int[100];

        for (int i = 0; i<secretNums.length; i++){
            secretNums[i] = (int) Math.random()*99+1;
        }
    }
}

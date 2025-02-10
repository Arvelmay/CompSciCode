
/**
 * Write a description of class MultTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultTable
{
    public static void main(String[] args)
    {
        int tableSize = 10;
        MultTable.level1(tableSize);
        MultTable.level2(tableSize);
    }
    public static void level1(int size)
    {
        int row = 1;
        int colum = 1;
        int currentNum = 1;
        for (int i=1; i<(size*size); i++)
        {
            if (i%size==0){
                System.out.println();
                row++;
                colum = 1;
            }
            currentNum = row*colum;
            System.out.print(currentNum+"\t");
            colum++;
        }
    }
    public static void level2(int size)
    {
        System.out.print("x\t");
        for (int i= 1; i <= size; i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 1; i <= size; i++){
            System.out.print(i+"\t");
            if (i%10 == 0){
                System.out.println();
            }
        }
    }
}

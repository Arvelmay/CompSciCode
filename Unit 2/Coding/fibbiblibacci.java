public class fibbiblibacci
{
    public static void main(String[] args)
    {
        int pre1 = 1;
        int pre2 = 0;
        for (int i=0; i<100; i=pre1+pre2)
        {
            System.out.println(i);pre2 = pre1;pre1 = i;
        }
    }
}
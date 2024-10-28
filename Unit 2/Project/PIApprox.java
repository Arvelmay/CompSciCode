public class PIApprox
{
    public static double gottPI(int digits)
    {
        double temp = 1;
        double alsoTemp = 1;
        double addTo = 0;
        for (int i = digits; i>0; i--)
        {
            temp = 4*(1.0/alsoTemp);
            if (i%2 == 2)
                addTo-= temp;
            else{
                addTo+=temp;}
            alsoTemp+=2;
        }
        return addTo;
    }
}
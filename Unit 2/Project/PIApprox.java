public class PIApprox
{
    public static double gottPi(int digits)
    {
        double temp = 1;
        double alsoTemp = 1;
        double addTo = 0;
        for (int i = digits; i>0; i--)
        {
            temp = 1/alsoTemp;
            addTo+= 4*temp;
            alsoTemp+=2;
        }
        return addTo;
    }
}
public class StarFigure
{
    public static void main(String[] args)
    {
        String tempStars = "";
        String tempForward = "";
        String tempBackward = "";
        for(int i = 1; i<=5; i++)
        {
            for (int ii=0; ii<=(1+i*4); ii++){
                tempStars+="*";
            }
            for (int ii = ((5-i)*4); ii>0; ii--)
            {
                tempForward+="/";
                tempBackward+="\\";
            }
            System.out.println(tempForward+tempStars+tempBackward);
            tempStars = "";
            tempForward = "";
            tempBackward = "";
        }
        
    }
}
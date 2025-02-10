
/**
 * Write a description of class MyMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMethods
{
    public static int addTen(int original){
        return original+10;
    }
    
    public static int multByTwo(int original){
        return 2*original;
    }
    
    public static void goofy(){
        System.out.println("Goofy goobers");
    }
    
    public static String rapName(String realName){
        return "Li'l " + realName.charAt(0);
    }

    
    public static void main(String[] args){
        System.out.println(MyMethods.addTen(15));
        System.out.println(MyMethods.multByTwo(43));
    }
}

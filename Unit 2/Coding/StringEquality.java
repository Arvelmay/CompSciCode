public class StringEquality {
    public static void main(String[] args)
    {
        String name = "Murphy";
        System.out.println(name == "Murphy");
        System.out.println(name == "Mur"+"phy");
        System.out.println(name == new String("Murphy"));
        System.out.println(name == "Murphy"+"");
        System.out.println(name == name+"");
    }
}

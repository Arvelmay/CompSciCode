public class RectClient
{
    public static void main(String[] args) {
        Rectangle recty = new Rectangle(3,7);
        Rectangle waitAMinuteThatsNotActuallyARectangleIThinkThatIsActuallyASquare = new Rectangle(4,4);
        Rectangle whatWhyIsThereNoParamsINeedParamsWHEREARETHEPARAMS = new Rectangle();
        System.out.println(whatWhyIsThereNoParamsINeedParamsWHEREARETHEPARAMS.diagonal());
        System.out.println(recty.area());
        System.out.println(waitAMinuteThatsNotActuallyARectangleIThinkThatIsActuallyASquare.getLength());
    }
}
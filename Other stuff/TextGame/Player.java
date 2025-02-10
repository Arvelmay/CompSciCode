public class Player {
    private int health;
    private String name;

    public void damage(int damage){
        health-=damage;
    }
}

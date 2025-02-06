public class Card {
    private String suit;
    private int value;
    private boolean isRed;

    public Card(int v){
        this.value = v;
    }

    //Setter methods
    public void setSuit(String s){
        this.suit = s;
    }

    public void setValue(int v){
        this.value = v;
    }

    public void setRed(boolean b){
        this.isRed = b;
    }

    //Getter methods
    public String getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    public boolean getRed(){
        return this.isRed;
    }

    @Override
    public String toString(){
        return this.value + this.suit;
    }
}

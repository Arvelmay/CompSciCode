public class Card {
    private String suit;
    private String value;
    private boolean isRed;

    public Card(String v){
        this.value = v;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getValue(){
        return this.value;
    }

    public void setSuit(String s){
        this.suit = s;
    }

    public void setValue(String v){
        this.value = v;
    }

    public void setRed(boolean b){
        this.isRed = b;
    }

    public String toString(){
        return this.value + this.suit;
    }
}

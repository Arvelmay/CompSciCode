import java.util.*;

public class Deck {
    private Card[] cards = new Card[52];

    public Deck(){
        for (int i = 0; i < 4; i++){
            for (int n = 0; n < 13; n++){
                this.cards[i*13+n].setValue(n);

                switch(i) {
                    case 0: this.cards[i*13+n].setSuit(" of Hearts");
                    this.cards[i*13+n].setRed(true);
                    break;

                    case 1: this.cards[i*13+n].setSuit(" of Diamonds");
                    this.cards[i*13+n].setRed(true);
                    break;

                    case 2: this.cards[i*13+n].setSuit(" of Clubs");
                    this.cards[i*13+n].setRed(false);
                    break;

                    case 3: this.cards[i*13+n].setSuit(" of Spades");
                    this.cards[i*13+n].setRed(false);
                    break;
                }
            }
        }
    }

    public void shuffle(){
        Arrays.shuffle(this.cards);
    }    


    @Override
    public String toString(){
        return Arrays.toString(this.cards);
    }
}
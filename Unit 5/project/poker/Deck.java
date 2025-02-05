import java.util.*;


public class Deck {
    private Card[] cards = new Card[52];

    public Deck(){
        Random randyboi = new Random();
        for (int i = 0; i < 4; i++){
            for (int n = 0; n < 13; n++){
                switch(n){
                    case 0: cards[i*13+n] = new Card("Ace of ");
                    break;

                    case 10: cards[i*13+n] = new Card("Jack of ");
                    break;

                    case 11: cards[i*13+n] = new Card("Queen of ");
                    break;

                    case 12: cards[i*13+n] = new Card("King of ");
                    break;

                    default: cards[i*13+n] = new Card(n+1 + " of ");
                    break;
                }

                switch(i) {
                    case 0: cards[i*13+n].setSuit("Hearts");
                    cards[i*13+n].setRed(true);
                    break;

                    case 1: cards[i*13+n].setSuit("Diamonds");
                    cards[i*13+n].setRed(true);
                    break;

                    case 2: cards[i*13+n].setSuit("Clubs");
                    cards[i*13+n].setRed(false);
                    break;

                    case 3: cards[i*13+n].setSuit("Spades");
                    cards[i*13+n].setRed(false);
                    break;
                }
            }
        }
    }

    


    @Override
    public String toString(){
        return Arrays.toString(cards);
    }
}
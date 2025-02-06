public class Hand {
    private Card[] cards = new Card[2];

    public Hand(Card[] h){
        cards = h;
    }

    public int getRank(Card[] board){
        //totHand is the players cards plus the board
        Card[] totHand = new Card[7];
        
        totHand[0] = cards[0];
        totHand[1] = cards[1];
        
        for(int i = 0; i < board.length; i++){
            totHand[2+i] = board[i];
        }

        boolean ordered = false;
        do { 
            if()
        } while (!ordered);
    }
}

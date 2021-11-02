import java.util.ArrayList;
import java.util.Random;

public class DealOfCards {

    public static ArrayList<Card> myDeck(int a){
        ArrayList<Card> deck = SaveDeckOfCards.saveDeck();
        ArrayList<Card> newDeck = new ArrayList<>();
        for (int i=0; i<a; i++){
            newDeck.add(RandomCard.getCard(deck));
        }
        return newDeck;
    }
}

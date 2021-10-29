import java.util.ArrayList;
import java.util.Random;

public class RandomCard {

    public static Card getCard (ArrayList<Card> deck) {
        ArrayList<Card> newDeck = new ArrayList<>();
        Random generator = new Random();
        int r = generator.nextInt(deck.size());
        newDeck.add(deck.get(r));
        deck.remove(r);
        return newDeck.get(0);
    }
}

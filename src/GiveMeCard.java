import java.util.ArrayList;

public class GiveMeCard {

    public static void main(String[] args) {
        PrisonerSays.introductorySpeech();
        FromCons.fromConsString();
        PrisonerSays.letsPlay();
        FromCons.fromConsInt();

        DealOfCards.myDeck(FromCons.fromConsInt());

//ArrayList<Card> deck = SaveDeckOfCards.saveDeck();
        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck = DealOfCards.myDeck(FromCons.fromConsInt());
//newDeck.add(RandomCard.getCard(deck));
        System.out.println(newDeck.toString());

    }
}

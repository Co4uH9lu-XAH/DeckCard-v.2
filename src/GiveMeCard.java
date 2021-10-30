import java.util.ArrayList;

public class GiveMeCard {

    public static void main(String[] args) {
        PrisonerSays.introductorySpeech();
        FromCons.fromConsString();
        PrisonerSays.letsPlay();
        FromCons.fromConsInt();

        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck = DealOfCards.myDeck(FromCons.saidInt);
        System.out.println(newDeck.toString());

    }
}

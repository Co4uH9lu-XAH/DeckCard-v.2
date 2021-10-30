import java.util.ArrayList;

public class GiveMeCard {

    public static void main(String[] args) throws InterruptedException {
        PrisonerSays.introductorySpeech();
        FromCons.fromConsString();
        PrisonerSays.letsPlay();
        FromCons.fromConsInt();

        ArrayList<Card> newDeck = new ArrayList<>();
        newDeck = DealOfCards.myDeck(FromCons.saidInt);
        for (Card cardFoPrint: newDeck){
            System.out.println(cardFoPrint.toString());
            Thread.sleep(1000);
        }

    }
}

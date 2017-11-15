package Game;

import java.util.Scanner;

import static java.lang.System.*;

public class CardPicker {

    public static void main(String[] args) {
        int numCards;
        Scanner in = new Scanner(System.in);
        do {
            out.print("Enter cards per suit");
            numCards = in.nextInt();
        } while (numCards <= 0 || numCards > CardDeck.CARDS_PER_SUITS);

        CardDeck cards = new CardDeck();
        CardDeck result = new CardDeck();

        cards.fill();
        int pickCount = 0;
        while (!hasCardsFromEachSuit(numCards)) {
            Card card = cards.take();
            pickCount++;
            if (!hasCardsFromSuit((numCards), card.getSuit())) {
                result.add(card);
            }

        }
    }
}

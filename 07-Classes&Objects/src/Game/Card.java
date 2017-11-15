package Game;

import java.util.Random;

public class Card {

    private int value;
    private CardDeck.Suit suit;

    public Card(int value, CardDeck.Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardDeck.Suit getSuit() {
        return suit;
    }

    public String toString() {
        String output;
        switch (value) {
            case 1:
                output = "Ace";
                break;

            case 11:
                output = "Jack";
                break;

            case 12:
                output = "Queen";
                break;

            case 13:
                output = "King";
                break;

            default:
                output = "" + value;
                break; // break here not mandatory
        }
        output += " of " + suit;
        return output;
    }
}

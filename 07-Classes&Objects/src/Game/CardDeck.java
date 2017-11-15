package Game;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {


    public static final int CARDS_PER_SUITS = 13;
    public enum Suit {SPADE, HEART, CLUB, DIAMOND}

    private ArrayList<Card> deck;
    private Random rd = new Random();

    public CardDeck() {
        deck = new ArrayList<>();
    }

    public void fill() {
        for (Suit s : Suit.values()) {
            for(int j = 1; j <= CARDS_PER_SUITS; j++) {
                deck.add(new Card(j, s));
                shuffle();
            }
        }
    }

    private void shuffle() {
//        Collections.shuffle(deck); DOES A BETTER JOB THAN THE WRITTEN COMMAND UNDERNEATH
        ArrayList<Card> shuffleDeck = new ArrayList<>();
        while (deck.size() > 0) {
            shuffleDeck.add(deck.remove(rd.nextInt(deck.size())));
        }
        while (shuffleDeck.size() > 0) {
           deck.add(shuffleDeck.remove(rd.nextInt(shuffleDeck.size())));
        }
    }

    public  Card take() {
        return deck.remove(0);
    }

    public void add(Card card) {
        deck.add(card);
    }

    public boolean hasCardsFromSuit(int n, Suit suit) {
        int count = 0;
        for (Card c : deck) {
            if(c.getSuit() == suit) count++;
        }
        return count >= n;
    }

    public boolean hasCardsFromEachSuit(int n) {
        for (Suit s : Suit.values()) {
            if (!hasCardsFromSuit(n, s)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        for (Card c : deck) {
            s += c + "\n";
        }
        return s;
    }
}

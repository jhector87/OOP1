import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BulgarianSolitaire {

    private static final int NUM_OF_CARDS = 45;
    private ArrayList<Integer> piles;

    public BulgarianSolitaire() {
        Random rd = new Random();
        piles = new ArrayList<>();
        int numOfCards = NUM_OF_CARDS;
        while (numOfCards > 0) {
            int pileHeight = rd.nextInt(numOfCards) + 1;
            piles.add(pileHeight);
            numOfCards -= pileHeight;
        }
    }

    public void play() {
        System.out.println("Initial piles: " + piles);
        while (!gameOver()) {
            draw();
            System.out.println("New piles: " + piles);
        }
    }

    private boolean gameOver() {
        Collections.sort(piles);
        for(int i = 0; i < piles.size(); i++) {
            if (piles.get(i) != i + 1) {
                return false;
            }
        }
            return true;
    }

    private void draw(){
        int newPile = piles.size();
        int ix = 0;
        while (ix < piles.size()) {
            if (piles.get(ix) > 1) {
                piles.set(ix, piles.get(ix) - 1);
                ix++;
            } else {
                piles.remove(ix);
            }
        }
        piles.add(newPile);
    }

    public static void main(String[] args) {
        BulgarianSolitaire solitaire = new BulgarianSolitaire();
        solitaire.play();
    }
}

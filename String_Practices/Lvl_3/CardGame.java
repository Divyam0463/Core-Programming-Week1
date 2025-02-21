import java.util.Arrays;
import java.util.Random;

public class CardGame {

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int NUM_CARDS = SUITS.length * RANKS.length;

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        int numPlayers = 4; 
        int cardsPerPlayer = 5; 

        if (NUM_CARDS < numPlayers * cardsPerPlayer) {
            System.out.println("Not enough cards to distribute.");
            return;
        }


        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        printPlayersCards(players);
    }

    private static String[] initializeDeck() {
        String[] deck = new String[NUM_CARDS];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < NUM_CARDS; i++) {
            int randomIndex = i + random.nextInt(NUM_CARDS - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    private static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }
}
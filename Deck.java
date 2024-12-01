import java.util.Random;

public class Deck {
    private LinkList cardDeck;

    public Deck() {
        cardDeck = new LinkList();
        initializeDeck();
        shuffleDeck();
    }

    // Initialize the deck with 52 cards
    private void initializeDeck() {
        String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11}; // Values for cards

        for (String suit : SUITS) {
            for (int i = 0; i < RANKS.length; i++) {
                Card card = new Card(suit, RANKS[i], VALUES[i], RANKS[i].toLowerCase() + suit.substring(0, 1).toLowerCase() + ".gif");
                cardDeck.add(card);
            }
        }
    }

    // Shuffle the deck
    public void shuffleDeck() {
        Random rand = new Random();
        Card[] cardsArray = new Card[52];
        int index = 0;

        // Transfer cards to an array
        while (cardDeck.getFirst() != null) {
            cardsArray[index++] = cardDeck.getFirst();
        }

        // Shuffle the array
        for (int i = cardsArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cardsArray[i];
            cardsArray[i] = cardsArray[j];
            cardsArray[j] = temp;
        }

        // Rebuild the deck from the shuffled array
        for (Card card : cardsArray) {
            cardDeck.add(card);
        }
    }

    public LinkList getDeck() {
        return cardDeck;
    }
}

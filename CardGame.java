public class CardGame {

    private static final int CARDS_PER_PLAYER = 5;

    public static void main(String[] args) {
        Deck deck = new Deck(); // Create and shuffle the deck
        LinkList shuffledDeck = deck.getDeck();

        // Deal cards to 2 players
        Card[] player1Hand = dealCards(shuffledDeck, CARDS_PER_PLAYER);
        Card[] player2Hand = dealCards(shuffledDeck, CARDS_PER_PLAYER);

        // Display each player's hand
        System.out.println("Player 1's Hand:");
        displayHand(player1Hand);
        System.out.println("\nPlayer 2's Hand:");
        displayHand(player2Hand);

        // Compare cards and determine the winner
        int player1Score = calculateHandScore(player1Hand);
        int player2Score = calculateHandScore(player2Hand);

        System.out.println("\nGame Result:");
        if (player1Score > player2Score) {
            System.out.println("Player 1 Wins with a score of " + player1Score);
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 Wins with a score of " + player2Score);
        } else {
            System.out.println("It's a tie with both players scoring " + player1Score);
        }
    }

    private static Card[] dealCards(LinkList deck, int numCards) {
        Card[] hand = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            hand[i] = deck.getFirst(); // Remove and return the first card from the deck
        }
        return hand;
    }

    private static void displayHand(Card[] hand) {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    private static int calculateHandScore(Card[] hand) {
        int score = 0;
        for (Card card : hand) {
            score += card.getCardValue();
        }
        return score;
    }
}

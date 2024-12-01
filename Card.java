public class Card {
    private String cardSuit;
    private String cardName;
    private int cardValue;
    private String cardPic;

    // Constructor with all attributes
    public Card(String suit, String name, int value, String pic) {
        cardSuit = suit;
        cardName = name;
        cardValue = value;
        cardPic = pic;
    }

    // Getter methods
    public String getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardPic() {
        return cardPic;
    }

    // toString method for printing the card
    @Override
    public String toString() {
        return cardName + " of " + cardSuit + " (Value: " + cardValue + ", Picture: " + cardPic + ")";
    }
}

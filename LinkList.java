public class LinkList {
    private Link first; // Reference to the first link in the list

    // Constructor
    public LinkList() {
        first = null; // No links in the list initially
    }

    // Add a new card to the front of the list
    public void add(Card card) {
        Link newLink = new Link(card);
        newLink.next = first; // Point to the old first link
        first = newLink; // Update first to the new link
    }

    // Remove and return the first card in the list
    public Card getFirst() {
        if (first == null) {
            throw new IllegalStateException("The list is empty!");
        }
        Card card = first.cardLink; // Retrieve the card
        first = first.next; // Move to the next link
        return card;
    }

    // Display all cards in the list
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}

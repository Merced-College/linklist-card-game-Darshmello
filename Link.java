//package linkedLists;
//linkList2.java
//demonstrates linked list
//to run this program: C>java LinkList2App
////////////////////////////////////////////////////////////////
public class Link {
    public Card cardLink; // Card object stored in this link
    public Link next; // Next link in the list

    // Constructor
    public Link(Card card) {
        cardLink = card;
    }

    // Display the card in this link
    public void displayLink() {
        System.out.println(cardLink);
    }
}

//package linkedLists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;



public class CardGame {
    private static final int CARDS_PER_PLAYER = 5;

    public static void main(String[] args) {
        Deck deck = new Deck();
        LinkList shuffledDeck = deck.getDeck();

        // Deal cards to 2 players
        Card[] player1Hand = dealCards(shuffledDeck, CARDS_PER_PLAYER);
        Card[] player2Hand = dealCards(shuffledDeck, CARDS_PER_PLAYER);

        // Display hands
        System.out.println("Player 1's Hand:");
        displayHand(player1Hand);
        System.out.println("\nPlayer 2's Hand:");
        displayHand(player2Hand);

        // Compare cards (simple highest-value card wins)
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


	}//end main

}//end class

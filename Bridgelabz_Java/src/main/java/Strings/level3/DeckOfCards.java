
/*
 * Program 10: Create a deck of 52 playing cards,
 * shuffle the deck using the Fisher-Yates algorithm,
 * and distribute cards equally among players.
 */
package Strings.level3;

import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize a deck of 52 cards
    public static String[] initializeDeck() {
        String[] suits = {
                "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck using Fisher-Yates
    public static void shuffleDeck(String[] deck) {
        int numberOfCards = deck.length;

        for (int i = 0; i < numberOfCards; i++) {
            int randomIndex = i +
                    (int) (Math.random() * (numberOfCards - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards among players
    public static String[][] distributeCards(
            String[] deck, int players, int cardsPerPlayer) {

        String[][] distributedCards =
                new String[players][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < players; j++) {
                distributedCards[j][i] = deck[index];
                index++;
            }
        }

        return distributedCards;
    }

    // Method to display cards received by each player
    public static void displayCards(String[][] distributedCards) {

        for (int i = 0; i < distributedCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < distributedCards[i].length; j++) {
                System.out.println(
                        (j + 1) + ". " + distributedCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        int totalCards = players * cardsPerPlayer;

        // Validate input
        if (players <= 0 || cardsPerPlayer <= 0 ||
                totalCards > 52) {
            System.out.println(
                    "Invalid input! Total cards must not exceed 52.");
            sc.close();
            return;
        }

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute cards among players
        String[][] distributedCards =
                distributeCards(deck, players, cardsPerPlayer);

        // Display the distributed cards
        displayCards(distributedCards);

        sc.close();
    }
}

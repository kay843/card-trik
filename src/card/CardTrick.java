/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        // Create an array to hold 7 random cards
        Card[] magicHand = new Card[7];
        Random randGen = new Random();

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(randGen.nextInt(13) + 1); // values 1 to 13
            c.setSuit(Card.SUITS[randGen.nextInt(4)]); // random suit
            magicHand[i] = c;
        }

        // Hardcoded lucky card (not used in search, just for reference)
        Card lu_Card = new Card();
        lu_Card.setValue(2);
        lu_Card.setSuit("Clubs");

        // Ask user for card input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = input.nextInt();
        input.nextLine(); // clear newline
        System.out.print("Enter card suit (Hearts,  Clubs, Spades, Diamonds): ");
        String suit = input.nextLine();

        // Search for the card in magic hand
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == value &&
                magicHand[i].getSuit().equalsIgnoreCase(suit)) {
                found = true;
                break;
            }
        }

        // Report result
        if (found) {
            System.out.println("Card found in magic hand.");
        } else {
            System.out.println("Card not found.");
        }
    }
}

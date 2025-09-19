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
 * @author Kainat Imran - 991721311
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = input.nextInt();
        input.nextLine();
        System.out.print("Enter card suit: ");
        String suit = input.nextLine();

        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == value &&
                magicHand[i].getSuit().equalsIgnoreCase(suit)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Card found!" : "Card not found.");
        System.out.println("Lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
    }
}

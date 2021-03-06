/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridan.parkdy.dylan_park_ice1;

import ca.sheridan.parkdy.dylan_park_ice1.Card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Dylan Park
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.random()*14);
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
        }
         for (int i=0; i<magicHand.length; i++){
             System.out.println(c.setSuit() + " " + c.setValue());
         }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}

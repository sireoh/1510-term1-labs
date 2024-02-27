package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
* Makes random dice things.
*
* @author Vincent Fung
* @version 0.1
*/

public class CardGame {
    enum Rank {
        /**
        * Ace.
        */
        ace,
        /**
         * Two.
         */
        two,
        /**
         * Three.
         */
        three,
        /**
         * Four.
         */
        four,
        /**
         * Five.
         */
        five,
        /**
         * Six.
         */
        six,
        /**
         * Seven.
         */
        seven,
        /**
         * Eight.
         */
        eight,
        /**
         * Nine.
         */
        nine,
        /**
         * Ten.
         */
        ten,
        /**
         * Jack.
         */
        jack,
        /**
         * Queen.
         */
        queen,
        /**
         * King.
         */
        king
    }
    
    enum Suit {
        /**
         * Heart.
         */
        heart,
        /**
         * Diamond.
         */
        diamonds,
        /**
         * Clubs.
         */
        clubs,
        /**
         * Spades.
         */
        spades
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        int randomRankChoice = random.nextInt(Rank.values().length);
        int randomSuitChoice = random.nextInt(Suit.values().length);
        
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("Random Rank: " + randomRank
                + "; " + "Random Suit: " + randomSuit
                + ".");
    }
}

package com.wilmotbroswordpress.mckinleytaire;

/**
 * Created by Tristan on 8/14/2017.
 * Card class, it should be pretty apparent what it does
 */

public class Card {
    private final int rank;
    private final int suit;

    public final static int CLUBS = 1;
    public final static int DIAMONDS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank(){return rank;}
    public int getSuit(){return suit;}

    private String suitToString(){
        switch (this.rank){
            case 1: return "Clubs";
            case 2: return "Diamonds";
            case 3: return "Hearts";
            case 4: return "Spades";
            default: return null;
        }
    }

    private String rankToString(){
        switch (this.suit){
            case 1: return "Ace";
            case 2: return "Deuce";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return null;
        }
    }

    @Override
    public String toString(){
        return this.rankToString() + " of " + this.suitToString();
    }

}

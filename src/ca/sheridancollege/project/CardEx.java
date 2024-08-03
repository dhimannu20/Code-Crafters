/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * Concrete implementation of the Card class. This class is a part of the Factory pattern to create card instances.
 *
 *  @author Nupur Dhiman,Sahil Bedi ,Labeeque Ahmad ,Kashvi Tewari
 */
public class CardEx extends Card {
    private String suit;
    private String rank;
    private int value;

    public CardEx(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

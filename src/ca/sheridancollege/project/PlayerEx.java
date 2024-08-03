/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Concrete implementation of the Player class.
 * Uses Factory Method pattern to create player instances.
 *
 *  @author Nupur Dhiman,Sahil Bedi ,Kashvi Tewari
 */
public class PlayerEx extends Player {

    public PlayerEx(String name) {
        super(name);
    }

    public int getDeckSize() {
        return getCards().size();
    }

    public Card drawCard() {
        if (getDeckSize() > 0) {
            return getCards().remove(0);
        }
        return null;
    }

    public void addCards(ArrayList<Card> cards) {
        getCards().addAll(cards);
    }

    @Override
    public void play() {
        // Game logic specific to PlayerEx
    }
}

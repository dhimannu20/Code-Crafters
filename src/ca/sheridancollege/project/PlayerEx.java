/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 *  @author Nupur Dhiman,Sahil Bedi ,Labeeque Ahmad ,Kashvi Tewari
 */
import java.util.ArrayList;

public class PlayerEx extends Player {

    private ArrayList<Card> cards; 

    public PlayerEx(String name) {
        super(name);
        
        cards = new ArrayList<>();
    }

    @Override
    public void play() {
        
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0); 
    }

    public void addCards(ArrayList<Card> wonCards) {
        cards.addAll(wonCards); 
    }

    

    public int getDeckSize() {
        return cards.size();
    }
}

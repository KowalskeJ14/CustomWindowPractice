/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumbergui;

/**
 *
 * @author JKowalske2
 */

public class GuessService {
    // Starting out simple with the magic number...
    private int correctNumber = 10;
    private String guess;
    int intGuess;
    
    public void setGuessedNumber(String guess) {
        this.guess = guess;
    }
    
    public String checkGuess() {
        int intGuess = Integer.valueOf(guess.trim());
        return guess;
    }
}

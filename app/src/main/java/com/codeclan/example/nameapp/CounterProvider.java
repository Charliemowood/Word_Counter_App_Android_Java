package com.codeclan.example.nameapp;

/**
 * Created by home on 5/23/17.
 */

public class CounterProvider {
    private String userInput;
    private String[] wordArray;


    public CounterProvider(String userInput) {
        this.userInput = userInput;
        this.wordArray = userInput.split(" ");

    }

    public int countsWords() {
        return this.wordArray.length;
    }
}

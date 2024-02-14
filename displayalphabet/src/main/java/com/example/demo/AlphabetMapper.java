package com.example.demo;
public class AlphabetMapper {
    private char input;

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public String mapAlphabetToWord() {
        switch (input) {
            case 'a':
                return "apple";
            case 's':
                return "satish";
            case 'b':
            	return "boll";
            case 'c':
            	return "cool";
            case 'd':
            	return "dog";
            default:
                return "Unknown";
        }
    }
}

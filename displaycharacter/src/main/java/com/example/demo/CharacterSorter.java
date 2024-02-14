package com.example.demo;

import java.util.Arrays;

public class CharacterSorter {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String sortCharactersInDescendingOrder() {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}

package com.example.demo;
public class desc {
	private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
    
public void display() {
    // Sort the characters in descending order
	char[] characters = message.toCharArray();
    for (int i = 0; i < characters.length - 1; i++) {
        for (int j = i + 1; j < characters.length; j++) {
            if (characters[i] < characters[j]) {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
            }
        }
    }

    // Print the characters in descending order
    System.out.print("Characters in descending order: ");
    for (char character : characters) {
        System.out.print(character);
    }
}

}
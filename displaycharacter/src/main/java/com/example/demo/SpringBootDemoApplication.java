package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootDemoApplication {

    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the CharacterSorter bean
        CharacterSorter characterSorter = (CharacterSorter) context.getBean("characterSorter");

        // Sort and display characters in descending order
        String sortedCharacters = characterSorter.sortCharactersInDescendingOrder();
        System.out.println("Characters in Descending Order: " + sortedCharacters);
    }
}

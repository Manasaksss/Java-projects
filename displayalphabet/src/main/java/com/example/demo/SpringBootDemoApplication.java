package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootDemoApplication {

    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the AlphabetMapper bean
        AlphabetMapper alphabetMapper = (AlphabetMapper) context.getBean("alphabetMapper");

        // Map the alphabet to a word and display it
        String mappedWord = alphabetMapper.mapAlphabetToWord();
        System.out.println("Mapped Word: " + mappedWord);
    }
}

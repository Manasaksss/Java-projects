package com.example.demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyApp {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        TrigonometricSeries obj = (TrigonometricSeries) factory.getBean("trigonometricSeries");
        obj.printSinSeries(8);
    }
}
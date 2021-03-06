package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

    public static void main(String[] args) {
        System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main methodgit
        System.out.println(checkGreaterThan10(11));
        SpringApplication.run(DemoJenkinsApplication.class, args);
    }
    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
    public static boolean checkGreaterThan10(int number){
        System.out.println("This is check 1");
        System.out.println("This is check 2");
        return number >10;
    }

}

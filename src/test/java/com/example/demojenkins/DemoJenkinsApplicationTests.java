package com.example.demojenkins;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testInputIsEven(){
        assertTrue(DemoJenkinsApplication.checkIfInputIsAnEvenNumber(22)); // Assertion
    }

}

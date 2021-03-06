package com.example.demojenkins;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

    @Test
    public void testInputIsEven(){
        assertTrue(DemoJenkinsApplication.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
    @Test
    public void testInputIsOdd(){
        assertFalse(DemoJenkinsApplication.checkIfInputIsAnEvenNumber(23)); // Assertion
    }

    @Test
    public void testGreaterThan10(){
        assertTrue(DemoJenkinsApplication.checkGreaterThan10(14));
    }
}

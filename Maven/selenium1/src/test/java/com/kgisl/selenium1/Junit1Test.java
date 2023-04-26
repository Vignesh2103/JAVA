package com.kgisl.selenium1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Junit1Test {
    @BeforeClass 
    public static void setup() {
         System.out.println("before class");
        }
    
    @After
    public void tearDown() {
        System.out.println("After");
        
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
        
    }

    @Before
    public  void setup1() {
        System.out.println("before ");
    }
    
    @Test
    public void method1() {
        System.out.println("method1");// assertTrue(new ArrayList().isEmpty());  
    }

    @Test
    public void method2() {
        System.out.println("method1");// assertTrue(new ArrayList().isEmpty());  
    }
    

    
}

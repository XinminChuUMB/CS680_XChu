package edu.umb.cs680.hw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void multiply6by8() {
        Calculator cut = new Calculator();
        float expected = 48;
        float actual = cut.multiply(6, 8);
        assertTrue(cut instanceof Calculator);
        assertEquals(expected, actual);
    }


    @Test
    public void divide7by2() {
        Calculator cut = new Calculator();
        float expected = 3.5f;
        float actual = cut.divide(7, 2);
        assertEquals(expected, actual);
    }


    @Test
    public void divide2By0withTryCatch(){
        Calculator cut = new Calculator();
        try{
            cut.divide(2, 0);
            fail("Division by zero");
        }
        catch (IllegalArgumentException ex){
            assertEquals("division by zero", ex.getMessage());
        }
    }


}
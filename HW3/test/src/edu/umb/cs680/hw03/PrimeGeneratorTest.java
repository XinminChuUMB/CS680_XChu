package edu.umb.cs680.hw03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeGeneratorTest {

    @Test
    public void generatePrimesFrom1To10() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertArrayEquals( expectedPrimes, gen.getPrimes().toArray() );
    }

    @Test
    public void generatePrimesFrom10To100() {
        PrimeGenerator gen = new PrimeGenerator(10, 100);
        gen.generatePrimes();
        Long[] expectedPrimes = {11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L,
                53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
        assertArrayEquals( expectedPrimes, gen.getPrimes().toArray() );
    }

    @Test
    public void generatePrimesFrom100To110() {
        PrimeGenerator gen = new PrimeGenerator(100, 110);
        gen.generatePrimes();
        Long[] expectedPrimes = {101L, 103L, 107L, 109L};
        assertArrayEquals( expectedPrimes, gen.getPrimes().toArray() );
    }


    @Test
    public void generatePrimesFrom100To1(){
        try{
            PrimeGenerator gen = new PrimeGenerator(100, 1);
            gen.generatePrimes();
            fail("The small number should be placed in front");
        } catch(Exception e){
            assertEquals("Wrong input values: from=100 to=1", e.getMessage());
        }
    }


    @Test
    public void generatePrimesFromMinus10To10(){
        try{
            PrimeGenerator gen = new PrimeGenerator(-10, 10);
            gen.generatePrimes();
            fail("Negative integers cannot be prime");
        } catch(Exception e){
            assertEquals("Wrong input values: from=-10 to=10", e.getMessage());
        }
    }

}
package org.factoriaf5.fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void devolverNumeroTest(){

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.devolverNumero(3));
        assertEquals("Fizz", fizzBuzz.devolverNumero(6));
        assertEquals("Fizz", fizzBuzz.devolverNumero(9));
        assertEquals("Fizz", fizzBuzz.devolverNumero(123));
        
        
        assertEquals("Buzz", fizzBuzz.devolverNumero(5));
        assertEquals("Buzz", fizzBuzz.devolverNumero(10));
        assertEquals("Buzz", fizzBuzz.devolverNumero(25));


        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(15));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(30));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(135));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(53));

        
        assertEquals("1", fizzBuzz.devolverNumero(1));
        assertEquals("2", fizzBuzz.devolverNumero(2));
        assertEquals("4", fizzBuzz.devolverNumero(4));
        assertEquals("7", fizzBuzz.devolverNumero(7));
        assertEquals("8", fizzBuzz.devolverNumero(8));





    }



    
}

package org.factoriaf5.fizzbuzz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void devolverNumeroTest(){

        FizzBuzz fizzBuzz=new FizzBuzz();

        assertEquals("Fizz", fizzBuzz.devolverNumero(3));
        assertEquals("Fizz", fizzBuzz.devolverNumero(6));
        assertEquals("Fizz", fizzBuzz.devolverNumero(9));
        assertEquals("Fizz", fizzBuzz.devolverNumero(123));
        assertEquals("Fizz", fizzBuzz.devolverNumero(23));
        assertEquals("Fizz", fizzBuzz.devolverNumero(13));

        
        
        assertEquals("Buzz", fizzBuzz.devolverNumero(5));
        assertEquals("Buzz", fizzBuzz.devolverNumero(10));
        assertEquals("Buzz", fizzBuzz.devolverNumero(25));
        assertEquals("Buzz", fizzBuzz.devolverNumero(52));


        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(15));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(30));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(135));
        assertEquals("FizzBuzz", fizzBuzz.devolverNumero(53));

        
        assertEquals("1", fizzBuzz.devolverNumero(1));
        assertEquals("2", fizzBuzz.devolverNumero(2));
        assertEquals("4", fizzBuzz.devolverNumero(4));
        assertEquals("7", fizzBuzz.devolverNumero(7));
        assertEquals("8", fizzBuzz.devolverNumero(8));

        //Utilizando aserciones de Hamcrest

        assertThat(fizzBuzz.devolverNumero(3), equalTo("Fizz"));
        assertThat(fizzBuzz.devolverNumero(5), equalTo("Buzz"));
        assertThat(fizzBuzz.devolverNumero(15), equalTo("FizzBuzz"));
        assertThat(fizzBuzz.devolverNumero(13), equalTo("Fizz"));
        assertThat(fizzBuzz.devolverNumero(52), equalTo("Buzz"));
        assertThat(fizzBuzz.devolverNumero(7), equalTo("7"));
        assertThat(fizzBuzz.devolverNumero(30), equalTo("FizzBuzz"));
        assertThat(fizzBuzz.devolverNumero(23), equalTo("Fizz"));
        assertThat(fizzBuzz.devolverNumero(10), equalTo("Buzz"));
        assertThat(fizzBuzz.devolverNumero(1), equalTo("1"));





    }



    
}

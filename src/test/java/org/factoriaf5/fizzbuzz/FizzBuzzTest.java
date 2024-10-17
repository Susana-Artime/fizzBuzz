package org.factoriaf5.fizzbuzz;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz=new FizzBuzz();

    @Test
    public void devolverFizzBuzzNumTestDivisiblesTres(){        

        assertThat(fizzBuzz.devolverFizzBuzzNum(3), is("Fizz"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(6), is("Fizz"));
           
    } 

    @Test
    public void devolverFizzBuzzNumTestDivisiblesCinco(){
        

        assertThat(fizzBuzz.devolverFizzBuzzNum(5), is("Buzz"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(10), is("Buzz"));
    
    } 

    @Test
    public void devolverFizzBuzzNumTestDivisiblesTresyCinco(){
        

        assertThat(fizzBuzz.devolverFizzBuzzNum(15), is("FizzBuzz"));
        
    
    } 

    @Test
    public void devolverFizzBuzzNumTestContienenTres(){        

        assertThat(fizzBuzz.devolverFizzBuzzNum(13), is("Fizz"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(23), is("Fizz"));
    
    } 

    @Test
    public void devolverFizzBuzzNumTestContienenCinco(){        

        assertThat(fizzBuzz.devolverFizzBuzzNum(55), is("Buzz"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(52), is("Buzz"));
        
    
    } 

    @Test
    public void devolverFizzBuzzNumTestNingunaCondicion(){        

        assertThat(fizzBuzz.devolverFizzBuzzNum(1), is("1"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(2), is("2"));
        assertThat(fizzBuzz.devolverFizzBuzzNum(4), is("4"));
    
    } 


}



    


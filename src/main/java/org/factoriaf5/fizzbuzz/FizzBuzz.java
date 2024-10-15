package org.factoriaf5.fizzbuzz;

public class FizzBuzz {

       public String devolverNumero(int i){

          String resultado = "";

             if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                resultado += "Fizz";
            }
            
                    
            if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                resultado += "Buzz";
            }
            
             return resultado.isEmpty() ? String.valueOf(i) : resultado;
        }
             

    }





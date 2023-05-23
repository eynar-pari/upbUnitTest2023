package calculadoraTest;

import calculadora.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculadoraTest {
    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void verifySuma(){
        int actualResult = calculator.suma(1,2);
        int expectedResult = 3 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta, verifique el metodo suma()");
    }

    @Test
    public void verifyResta(){
        int actualResult = calculator.resta(3,2);
        int expectedResult = 1 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta, verifique el metodo resta()");

    }

    @Test
    public void verifyMulti(){
        int actualResult = calculator.mult(3,2);
        int expectedResult = 6 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta, verifique el metodo multiplicacion()");
    }

    @Test
    @Timeout(value = 3)
    public void verifyMultiSpeed(){
        int actualResult = calculator.mult(3,2);
        int expectedResult = 6 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta, verifique el metodo multiplicacion()");
    }

    @Test
    public void verifyDiv() throws Exception {
        int actualResult = calculator.div(6,2);
        int expectedResult = 3 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la div es incorrecta, verifique el metodo div()");
    }


    @Test
    public void verifyDiv0() throws Exception {
        Assertions.assertThrows(Exception.class,() -> {calculator.div(6,0);});
    }











}

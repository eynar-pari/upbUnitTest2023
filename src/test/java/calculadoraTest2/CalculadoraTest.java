package calculadoraTest2;

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
        int actualResult = calculator.suma(2,2);
        int expectedResult = 4 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta, verifique el metodo suma()");
    }

    @Test
    public void verifySuma2(){
        int actualResult = calculator.suma(3,1);
        int expectedResult = 4 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta, verifique el metodo suma()");
    }

    @Test
    public void verifyMulti(){
        int actualResult = calculator.mult(2,2);
        int expectedResult = 4 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta, verifique el metodo multiplicacion()");
    }

    @Test
    public void verifyMulti2(){
        int actualResult = calculator.mult(2,3);
        int expectedResult = 6 ;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta, verifique el metodo multiplicacion()");
    }

}

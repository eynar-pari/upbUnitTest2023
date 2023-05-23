package calculadoraSumaTest;

import calculadora.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumaTestParam {

    Calculator calculator = new Calculator();
    @ParameterizedTest
    @CsvSource(
            {
               "1,1,2",
               "2,2,4",
               "2,1,3",
               "1,2,3",
               "0,6,6",
               "0,7,7",
               "-1,-1,-2",
               "-2,-2,-4",
               "-2,-1,-3",
               "-1,-2,-3",
               "0,-6,-6",
               "0,-7,-7",
               "-4,2,-2",
               "-7,9,2",
               "-1,8,7",
               "-4,3,-1"
            }
    )
    public void verifySuma(int numberA, int numberB, int expectedResult){
        int actualResult = calculator.suma(numberA,numberB);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta, verifique el metodo suma()");
    }
}

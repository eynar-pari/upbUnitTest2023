package calculadoraTest3;

import calculadoraMock.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    /**
     *  yo quiero testear el metodo del factorial
     */

    /*
    *  ERROR problema que se solucionara con mocks
    * */

    @Test
    public void verifyFactorial(){
        Calculadora calculadora = new Calculadora();
        int actualResult = calculadora.getFactorial(3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult,actualResult,
                "ERROR! el factorial no esta funcionando");

    }



}

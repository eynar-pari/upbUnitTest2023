package calculadoraMockStaticTest;

import calculadoraMockStatic.CalcServiceStatic;
import calculadoraMockStatic.CalculadoraStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CalculadoraTest {

    @Test
    public void verifyFactorial(){
        // PASO 1 crear el objeto mockeado de la clase donde se encuentra el metodo a mockear
        MockedStatic<CalcServiceStatic> overrideCalcServiceStaticMock = Mockito.mockStatic(CalcServiceStatic.class);

        // PASO 2 adicionar comportamiento del metodo que se esta mockeando

        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(1,1)).thenReturn(1);
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(1,2)).thenReturn(2);
        overrideCalcServiceStaticMock.when(()->CalcServiceStatic.mult(2,3)).thenReturn(6);

        CalculadoraStatic calculadoraStatic = new CalculadoraStatic();
        int actualResult = calculadoraStatic.getFactorial(3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! El factorial no esta funcionando para el valor: "+3);

    }

}

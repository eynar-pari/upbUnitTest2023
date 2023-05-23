package basic;

import org.junit.jupiter.api.*;

public class BasicUnitTest {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void setup(){
        System.out.println("setup");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("cleanup");
    }

    @Test
    public void verifySomeThing(){
      System.out.println("test1");
      Assertions.assertTrue(2==2, "ERROR la suma esta incorrecta verifique el metodo de suma");
    }

    @Test
    public void verifySomeThing2(){
        System.out.println("test2");
    }
}

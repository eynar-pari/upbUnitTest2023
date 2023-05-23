package calculadora;

public class Calculator {

    public Calculator(){}

    public int suma(int a, int b){
        return a +b;
    }

    public int resta(int a, int b){
        return a - b;
    }
    public int mult(int a, int b){
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a * b;
    }
    public int div(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("verifique el segundo valor, ya que la division entre 0 no esta permitida");
        return a / b;
    }


}

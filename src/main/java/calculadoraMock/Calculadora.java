package calculadoraMock;

public class Calculadora {
    private CalcService service;

    /*
    * PASO 1 er paso para hacer mocks
    * necesitamos instanciar desde afuera el service
    * y definirlo en la clase
    *  *- constructor parametreizado (service)
    *  or
    *  *- metodo setService(servio)
    * */
    public Calculadora(){
        service = new CalcService();
    }

    public void setService(CalcService service) {
        this.service = service;
    }

    // Desarrollador A
    public int getFactorial(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact =service.multi(fact,i);
        }
        return fact;
    }
}

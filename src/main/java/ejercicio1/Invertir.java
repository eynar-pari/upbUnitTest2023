package ejercicio1;

public class Invertir {

     // con bugs
    public static String invertir(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = (invertido * 10) + digito;
            numero /= 10;
        }
        if (invertido%2 == 1){
            invertido=invertido+10;
        }

        return invertido+"";
    }

    // sin bugs
    public static String invertirNumero(int numero) {
        StringBuilder resultado = new StringBuilder();
        String numeroString = String.valueOf(numero);

        for (int i = numeroString.length() - 1; i >= 0; i--) {
            resultado.append(numeroString.charAt(i));
        }

        return resultado.toString();
    }

}

import java.util.Scanner;

public class infoDelMes {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
        int[] diasDeLosMeses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 

        System.out.println("Digite el numero para saber el mes:");
        numero = leer.nextInt();

        while (numero > 12 || numero < 1) {
            System.out.println("El numero " + numero + " no es un mes valido. Escribalo otra vez:");
            numero = leer.nextInt();
        }

        System.out.println(meses[numero - 1] + ", de " + diasDeLosMeses[numero - 1] + " dias.");

    }

}

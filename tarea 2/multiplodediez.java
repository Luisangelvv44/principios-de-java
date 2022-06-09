import java.util.Scanner;

public class multiplodediez {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, esMultiplo;

        System.out.println("Digite un numero:");
        numero = leer.nextInt();

        esMultiplo = numero % 10;

        if (esMultiplo == 0) {
            System.out.println("El numero " + numero + " es multiplo de 10.");
        } else {
            System.out.println("El numero " + numero + " no es multiplo de 10.");
        }

    }

}

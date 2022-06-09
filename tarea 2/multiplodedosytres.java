import java.util.Scanner;

public class multiplodedosytres {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, esMultiploDeTres, esMultiploDeDos;

        System.out.println("Digite un numero:");
        numero = leer.nextInt();

        esMultiploDeTres = numero % 3;
        esMultiploDeDos = numero % 2;

        if (esMultiploDeTres == 0) {
            System.out.println("El numero " + numero + " es multiplo de 3.");
            if (esMultiploDeDos == 0) {
                System.out.println("El numero " + numero + " es tambien multiplo de 2.");
            }
        } else if (esMultiploDeDos == 0) {
            System.out.println("El numero " + numero + " es multiplo de 2.");
        } else {
            System.out.println("El numero " + numero + " no es multiplo ni de 3 ni de 2.");
        }

    }

}

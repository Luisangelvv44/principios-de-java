import java.util.Scanner;

public class parimpar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, esPar;

        System.out.println("Digite un numero:");
        numero = leer.nextInt();

        esPar = numero % 2;
        
        if( esPar == 0 ){
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }

    }

}
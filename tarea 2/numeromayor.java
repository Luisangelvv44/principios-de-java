import java.util.Scanner;

public class numeromayor {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int mayor = 0;

        for (int i = 1; i < 5; i++) {

            int numero;

            System.out.println("Digite el numero " + i + ":");
            numero = leer.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

        }

        System.out.println("El numero mayor es: " + mayor);

    }

}

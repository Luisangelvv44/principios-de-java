import java.util.Scanner;

public class negativopositivo {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero:");
        numero = leer.nextInt();

        if (numero > 0) {
            System.out.println("El numero es " + numero + " positivo");
        } else {
            System.out.println("El numero es " + numero + " negativo");
        }

    }

}

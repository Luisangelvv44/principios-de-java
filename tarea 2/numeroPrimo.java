import java.util.Scanner;

public class numeroPrimo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean isPrimo = true;

        System.out.println("Digite un numero para saber si es primo:");
        numero = leer.nextInt();

        for (int i = 2; i < 10; i++) {
            if (i == numero) {
                break;
            }
            int result = numero % i;
            if (result == 0) {
                isPrimo = false;
                break;
            }
        }

        if (isPrimo) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }
}

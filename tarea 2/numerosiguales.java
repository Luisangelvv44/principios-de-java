import java.util.Scanner;

public class numerosiguales {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroUno, numeroDos;

        System.out.println("Digite el primer numero:");
        numeroUno = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        numeroDos = leer.nextInt();

        if (numeroUno == numeroDos) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros no son iguales.");
        }

    }

}

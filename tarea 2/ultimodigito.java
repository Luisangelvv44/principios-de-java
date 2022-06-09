import java.util.Scanner;

public class ultimodigito {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        String[] numeroUno, numeroDos;

        System.out.println("Digite el primer numero:");
        numeroUno = leer.next().split("");

        System.out.println("Digite el segundo numero:");
        numeroDos = leer.next().split("");

        if ( numeroUno[numeroUno.length - 1].equals(numeroDos[numeroDos.length - 1]) ) {
            System.out.println("La ultima cifra de estos dos numeros son iguales");
        } else {
            System.out.println("La ultima cifra de estos dos numeros no son iguales");
        }

    }

}
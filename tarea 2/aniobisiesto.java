import java.util.Scanner;

public class aniobisiesto {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int anio, esBisiesto;

        System.out.println("Digite un anio para saber si es bisiesto:");
        anio = leer.nextInt();

        esBisiesto = anio % 4;

        // 2000 2004 2008 anio bisiesto tienen multiplo de 4 

        if (esBisiesto == 0) {
            System.out.println("El anio " + anio + " si es bisiesto:");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto:");
        }

    }

}

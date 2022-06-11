import java.util.Scanner;

public class descuento {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cantidad, precio = 2000, subtotal;
        double descuento = 0, total;
        String textoDescuento = "0%";

        System.out.println("Cantidad de jeans a comprar:");
        cantidad = leer.nextInt();

        subtotal = precio * cantidad;

        if (cantidad > 35) {
            descuento = subtotal * 0.25;
            textoDescuento = "25%";
        }
        else if (cantidad > 10 && cantidad < 20) {
            descuento = subtotal * 0.15;
            textoDescuento = "15%";
        }
        else if (cantidad > 5) {
            descuento = subtotal * 0.10;
            textoDescuento = "10%";
        }
        
        total = subtotal - descuento;

        System.out.println("El subtotal es: " + subtotal + ", con un descuento de(" + textoDescuento + "): " + descuento + ", para un total de: " + total);

    }

}

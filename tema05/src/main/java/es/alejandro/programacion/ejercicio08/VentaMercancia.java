package es.alejandro.programacion.ejercicio08;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class VentaMercancia {
    private Map<String,Double> productos = new HashMap<>();
    private Map<String,Integer> cesta = new HashMap<>();
    private boolean hayDescuento = false;
    
    /**
     * VentaMercancia
     * Lee los productos y sus precios
     * @param ruta
     * @throws FileNotFoundException
     */
    public void leerProductos(String ruta) throws FileNotFoundException {
        Scanner fDatos = new Scanner(new File(ruta));
        String linea, lineaDatos[];
        String producto;
        double precio;
        while(fDatos.hasNextLine()) {
            linea = fDatos.nextLine();
            linea = linea.replace(",",".");
            lineaDatos = linea.split(" ");
            producto = lineaDatos[0];
            precio = Double.parseDouble(lineaDatos[1]);
            productos.put(producto, precio);
        }
    }

    /**
     * VentaMercancia
     * Lee la cesta de la compra
     * @param ruta
     * @throws FileNotFoundException
     */
    public void leerCesta(String ruta) throws FileNotFoundException {
        Scanner fDatos = new Scanner(new File(ruta));
        String linea, lineaDatos[];
        String producto;
        int cantidad;
        while(fDatos.hasNextLine()) {
            linea = fDatos.nextLine();
            lineaDatos = linea.split(" ");
            producto = lineaDatos[0];
            cantidad = Integer.parseInt(lineaDatos[1]);
            if(cesta.containsKey(producto)) {
                cesta.put(producto, cesta.get(producto) + cantidad);
            } else {
                cesta.put(producto, cantidad);
            }
        }
    }

    
    public static boolean verificarDescuento(String codigoDescuento) {
        return codigoDescuento.equals("ECODTO");
    }

    public void imprimirTicket(double descuento) {
        System.out.println("" +
        "-----------  ------    --------    --------\n" +
        "Producto     Precio    Cantidad    Subtotal\n" +
        "-----------  ------    --------    --------\n");

        double precio, total = 0;
        int cantidad;
        for(String producto: this.cesta.keySet()) {
            precio = this.productos.get(producto);
            cantidad = this.cesta.get(producto);
            total += precio * cantidad;
            if(cantidad > 1) {
                System.out.printf("%-11s %6.2f %8d %8f",producto, precio, cantidad, cantidad*precio );
            } else {
                System.out.printf("%-27s %8f\n", producto, precio);
            }
        }
        System.out.println("-----------  ------    --------    --------\n");
        if(hayDescuento) {
            System.out.printf("%-27s %f","Descuento\n", (descuento * total/100) );
            System.out.println("-----------  ------    --------    --------\n");
        } else {
            System.out.printf("%-27s: %f","Total:\n", total );
            System.out.println("-----------  ------    --------    --------\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner teclado = new Scanner(System.in);
        VentaMercancia v = new VentaMercancia();
        v.leerProductos("/home/daw/Escritorio/GitHub/PROGRAMACION/Tema05/src/tema05/Ejercicios/ejercicio08/T05-E08-DatosProductosSupermercado.txt");
        v.leerCesta("/home/daw/Escritorio/GitHub/PROGRAMACION/Tema05/src/tema05/Ejercicios/ejercicio08/T05-E08-DatosCompraCliente.txt");
        System.out.println("Introduce un codigo de descuento: ");
        String descuentoUsuario = teclado.nextLine();
        if(verificarDescuento(descuentoUsuario)) {
            v.imprimirTicket(10);
        } else {
            v.imprimirTicket(0);
        }
    }
}

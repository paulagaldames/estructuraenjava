package Sentencias;

import java.util.Scanner;

public class Sentencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productos = new String[5];
        int[] stock = new int[5];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n***** Opciones *****");
            System.out.println("1. Agregar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Ver inventario");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (contador < productos.length) {
                        System.out.print("Nombre del producto: ");
                        productos[contador] = sc.next();
                        System.out.print("Ingresar stock: ");
                        stock[contador] = sc.nextInt();
                        contador++;
                        System.out.println("Producto agregado.");
                    } else {
                        System.out.println("Inventario lleno.");
                    }
                    break;

                case 2:
                    System.out.print("Nombre del producto a vender: ");
                    String nombreVenta = sc.next();
                    boolean vendido = false;

                    for (int i = 0; i < contador; i++) {
                        if (productos[i].equalsIgnoreCase(nombreVenta)) {
                            System.out.print("Cantidad a vender: ");
                            int cantidad = sc.nextInt();
                            if (cantidad <= stock[i]) {
                                stock[i] -= cantidad;
                                System.out.println("Venta realizada.");
                            } else {
                                System.out.println("Stock insuficiente.");
                            }
                            vendido = true;
                            break;
                        }
                    }

                    if (!vendido) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    int i = 0;
                    while (i < contador) {
                        System.out.println(productos[i] + ": " + stock[i] + " unidades");
                        i++;
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción no encontrada.");
            }

        } while (opcion != 4);
    }
}

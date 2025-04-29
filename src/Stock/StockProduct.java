package Stock;

public class StockProduct {
    public static void main(String[] args) {
        String[] productos = {"CPU", "Memoria Ram", "Placa Madre", "Disco SSD", "Fuente de Poder"};
        int[] stock = {10, 8, 5, 0, 12};

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase("Disco SSD")) {
                System.out.println("Producto sin stock " + productos[i]);
                break; // Aqui como se detecto que un producto esta sin stock
                // lo cual hara que sa salga del bucle
            }

            if (stock[i] == 0) {
                continue; // Mientras no tenga stock 0 este seguira avanzando y mostrando en pantalla
            }

            System.out.println("Producto: " + productos[i] + " - Stock: " + stock[i]);
        }
    }
}

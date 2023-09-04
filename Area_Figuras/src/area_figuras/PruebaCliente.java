package area_figuras;

import java.util.Scanner;

// Clase de ejecución
public class PruebaCliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente(); // Creamos una instancia de la clase Cliente

        System.out.println("Seleccione la figura para calcular el área (cuadrado/rectangulo):");
        String figuraSeleccionada = scanner.nextLine();

        if ("cuadrado".equalsIgnoreCase(figuraSeleccionada)) {
            System.out.println("Ingrese el lado del cuadrado:");
            double lado = scanner.nextDouble();
            MetodoFabAbsFigura fabricaCuadrado = new MetodoFabCuadrado(lado); // Creamos una fábrica de cuadrados
            cliente.setFigura(fabricaCuadrado.crearFigura()); // Establecemos la figura en el cliente
        } else if ("rectangulo".equalsIgnoreCase(figuraSeleccionada)) {
            System.out.println("Ingrese la base del rectángulo:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura del rectángulo:");
            double altura = scanner.nextDouble();
            MetodoFabAbsFigura fabricaRectangulo = new MetodoFabRectangulo(base, altura); // Creamos una fábrica de rectángulos
            cliente.setFigura(fabricaRectangulo.crearFigura()); // Establecemos la figura en el cliente
        } else {
            System.out.println("Figura no reconocida.");
            return;
        }

        double area = cliente.getAreaFigura(); // Obtenemos el área de la figura a través del cliente
        System.out.println("Área de la figura seleccionada: " + area);
    }
}

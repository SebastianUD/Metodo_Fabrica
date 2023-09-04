package area_figuras;

// Clase de la fábrica para crear cuadrados
class MetodoFabCuadrado extends MetodoFabAbsFigura {
    private double lado; // Lado del cuadrado a crear

    public MetodoFabCuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    AbsFigura crearFigura() {
        return new FigCuadrado(lado); // Creación de un cuadrado con el lado especificado
    }
}

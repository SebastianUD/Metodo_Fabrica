package area_figuras;

// Clase para el cuadrado
class FigCuadrado extends AbsFigura {
    private double lado; // Lado del cuadrado

    public FigCuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado; // Cálculo del área del cuadrado
    }
}

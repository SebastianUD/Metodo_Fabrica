package area_figuras;

// Clase para el rectángulo
class FigRectangulo extends AbsFigura {
    private double base; // Base del rectángulo
    private double altura; // Altura del rectángulo

    public FigRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura; // Cálculo del área del rectángulo
    }
}

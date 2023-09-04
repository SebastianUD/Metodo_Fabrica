/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area_figuras;

// Clase de la fábrica para crear rectángulos
class MetodoFabRectangulo extends MetodoFabAbsFigura {
    private double base; // Base del rectángulo a crear
    private double altura; // Altura del rectángulo a crear

    public MetodoFabRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    AbsFigura crearFigura() {
        return new FigRectangulo(base, altura); // Creación de un rectángulo con la base y altura especificadas
    }
}

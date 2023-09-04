/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area_figuras;

// Clase para Cliente con set y get para figuras
public class Cliente {
    private AbsFigura figura; // Variable para almacenar la figura seleccionada

    // Método para establecer la figura
    public void setFigura(AbsFigura figura) {
        this.figura = figura;
    }

    // Método para obtener el área de la figura
    public double getAreaFigura() {
        if (figura != null) {
            return figura.calcularArea();
        } else {
            return 0.0; // Devolvemos 0 si no se ha establecido una figura
        }
    }
}

/*
 * Geometría abstracta
 * En esta ocasión, te desafiamos a crear un programa con una jerarquía de
 * clases para representar figuras geométricas abstractas. Este programa debe
 * incluir lo siguiente:
 * 
 * Una clase abstracta denominada “Figura”, que contiene dos métodos abstractos
 * llamados “calcularArea()” y “calcularPerimetro()”.
 * 
 * 3 clases para distintas figuras geométricas llamadas “Círculo”, “Rectángulo”
 * y “Triángulo”. Cada una de estas clases debe extender la clase "Figura" y
 * proporcionar implementaciones concretas de los métodos abstractos.
 * 
 * Para concluir, desarrolla una interfaz llamada "Dibujable" con un método
 * "dibujar()", e implementa esta interfaz en cada figura.
 * 
 * Recuerda invocar estos métodos desde el método main() para demostrar su
 * funcionamiento.
 */

import model.Figura;
import model.Circulo;
import model.Rectangulo;
import model.Triangulo;
import model.Dibujable;

public class App {

    public static void main(String[] args) {

        Figura[] listaza = { new Circulo(12), new Rectangulo(5, 10), new Triangulo(8, 7) };

        for (Figura object : listaza) {
            if (object instanceof Dibujable obj) {
                obj.dibujar();

            }
            System.out.println(object.calcularArea());
            ;
            System.out.println(object.calcularPerimetro());
            ;
        }

    }
}
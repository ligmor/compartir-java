package model;

public class Triangulo extends Figura implements Dibujable {

    float base, height;

    public Triangulo() {
    }

    public Triangulo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcularArea() {
        return ((base * height) / 2);
    }

    @Override
    public float calcularPerimetro() {
        return (3 * base);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}

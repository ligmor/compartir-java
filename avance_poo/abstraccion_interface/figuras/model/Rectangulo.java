package model;

public class Rectangulo extends Figura implements Dibujable {

    float base, height;

    public Rectangulo() {
    }

    public Rectangulo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calcularArea() {
        return base * height;
    }

    @Override
    public float calcularPerimetro() {
        return ((base + height) * 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo in Rentangulo");
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

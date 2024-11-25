package model;

public class Circulo extends Figura implements Dibujable {
    float r;

    public Circulo() {
    }

    public Circulo(float r) {
        this.r = r;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * (Math.pow(r, 2)));
    }

    @Override
    public float calcularPerimetro() {
        return (float) ((2 * Math.PI) * r);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

}

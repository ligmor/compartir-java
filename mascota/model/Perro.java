package model;

public class Perro extends Animal {
    private String raza;

    public Perro() {
        super();
    }

    public Perro(String raza) {
        super();
        this.raza = raza;
    }

    public Perro(String nombre, Integer edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String ladrar() {
        return "Estoy ladrando";
    }

    public void mostrarLadrar() {
        System.out.println(ladrar());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        return true;
    }

}

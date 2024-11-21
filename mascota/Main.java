import model.*;

public class Main {

    public static void main(String[] args) {
        Animal emilio = new Gato("emilio", 15, "azul");

        // emilio.ragunar();

        if (emilio instanceof Gato e) {
            System.out.println("nombre: " + e.getNombre() + "\n edad:" + e.getEdad() + "\n Action: " + e.ragunar());
        }
    }
}
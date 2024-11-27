/*
 * Crea el enum "DiaSemana" que represente los días de la semana, definiendo las constantes correspondientes a los días: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO y DOMINGO.

En la clase "DiaSemana", agrega un método llamado "esDiaLaboral()" que devuelva un valor booleano indicando si el día es laboral o no. Para esto, los días SÁBADO y DOMINGO no serán considerados días laborales.

En la clase "Application", crea un arreglo de objetos "DiaSemana" con 10 días de la semana generados al azar, esto es para evitar la entrada manual de datos.

Implementa un método llamado "imprimirDiaLaboral()" en la clase "Application" que tome como parámetro un objeto de tipo "DiaSemana" y utilice el método "esDiaLaboral()" para determinar si el día es laboral o no. Este método devolverá un mensaje indicando si es "Día laboral" o "No es día laboral", según corresponda al día proporcionado.

*/

import java.util.Arrays;

import enums.DiaSemana;

public class App {

    public static void main(String[] args) {
        DiaSemana[] diaSemanas = new DiaSemana[10];
        for (int i = 0; i < diaSemanas.length; i++) {
            diaSemanas[i] = azarDiaSemana();
            // System.out.println(diaSemanas[i].name());
        }

        // System.out.println(Arrays.toString(diaSemanas));
        // for (DiaSemana diaSemana : diaSemanas) {
        // imprimirDiaLaboral(diaSemana);
        // }
    }

    static DiaSemana azarDiaSemana() {

        int index = (int) (Math.random() * 7);
        DiaSemana[] arrayTemp = DiaSemana.values();
        DiaSemana dia = arrayTemp[index];
        return dia;
    }

    static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println(dia.name() + " Es un dia laboral");
        } else {
            System.out.println("El " + dia.name() + " no se trabaja");
        }
    }
}
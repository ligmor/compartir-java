package enums;

public enum DiaSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean laboral;

    private DiaSemana(boolean laboral) {
        this.laboral = laboral;
    }

    public boolean esDiaLaboral() {
        return this.laboral;
    }

}

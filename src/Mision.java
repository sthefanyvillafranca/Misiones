package PACKAGE_NAME;

public class Mision {
    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private boolean completada;

    public Mision(int id, String nombre, String dificultad, int nivelRecomendado) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomendado = nivelRecomendado;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }
    public int getNivelRecomendado() {
        return nivelRecomendado;
    }

    public boolean isCompletada() {
        return completada;

    }

}

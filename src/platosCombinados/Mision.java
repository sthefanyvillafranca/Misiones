package platosCombinados;

public class Mision {
    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private int recompensaExperiencia;
    private boolean completada;

    public Mision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomendado = nivelRecomendado;
        this.recompensaExperiencia = recompensaExperiencia;
        this.completada = completada;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
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

    @Override
    public String toString() {
        String resultado;

        resultado = String.format(new String("platosCombinados.Mision: %d, nombre: -%s, dificultdad: -%d, nivel recomendado: %d, " + "recompensa experiencia: %d, completa: %b"), id, nombre, dificultad, nivelRecomendado, recompensaExperiencia, completada);

        return resultado;
    }

}

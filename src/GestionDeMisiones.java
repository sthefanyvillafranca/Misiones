package PACKAGE_NAME;

public class GestionDeMisiones {
    private ArrayList<Mision> misiones;

    public  GestionDeMisiones(){
        this.misiones = new ArrayList<Mision>();
    }

    /**
     * A PARTIR DE AHORA CREAREMOS LOS OBJETOS DESDE EL GESTOR Y EN EL MAIN LA INTERACCION CON EL USUARIO. Ejemplo -> Main: camarero. GestionDeMisiones: cocinero. Mision: filete
     * Devuelve el id de la nueva mision creada
     * @param id
     * @param nombre
     * @param dificultad
     * @param nivelRecomendado
     * @param recompensaExperiencia
     * @param completada
     * @return el id de la mision creada
     */

    public int createMision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada){

        int idMisionCreada;
        //creamos la mision
        Mision mision = new Mision (id, nombre,dificultad, nivelRecomendado, recompensaExperiencia, completada);

        // agregamos la mision
        idMisionCreada  = agregarMision(mision);

        // devolvemos id de la nueva mision
        return idMisionCreada;


    }

    public int agregarMision(Mision mision){
        this.misiones.add(mision);

        return mision.getId();
    }

}

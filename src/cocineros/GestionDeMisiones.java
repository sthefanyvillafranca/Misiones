package cocineros;

import platosCombinados.Mision;

import java.util.ArrayList;

public class GestionDeMisiones {
    private ArrayList<Mision> misiones;

    public  GestionDeMisiones(){
        this.misiones = new ArrayList<Mision>();
    }

    /**
     * Recibe la informmación de una mision y...
     * Devuelve el id de la nueva mision creada
     * @param id
     * @param nombre
     * @param dificultad
     * @param nivelRecomendado
     * @param recompensaExperiencia
     * @param completada
     * @return el id de la mision creada
     */

    /*
     * A PARTIR DE AHORA CREAREMOS LOS OBJETOS DESDE EL GESTOR Y EN EL MAIN LA INTERACCION CON EL USUARIO. Ejemplo -> Main: camarero. cocineros.GestionDeMisiones: cocinero. platosCombinados.Mision: filete

     */
    public int crearMision(int id, String nombre, String dificultad, int nivelRecomendado, int recompensaExperiencia, boolean completada){

        int idMisionCreada;
        //creamos la mision
        Mision mision = new Mision(id, nombre,dificultad, nivelRecomendado, recompensaExperiencia, completada);

        // agregamos la mision
        idMisionCreada  = agregarMision(mision);

        // devolvemos id de la nueva mision
        return idMisionCreada;


    }

    /**
     *
     * @param mision
     * @return
     */
    public int agregarMision(Mision mision){
        this.misiones.add(mision);

        return mision.getId();
    }

    public String listarMisiones(){
        StringBuilder sb;

        sb = new StringBuilder("Misiones: {\n");

        for(Mision mision : misiones){
            sb.append("\t" + mision.toString());
        }
        sb.append("}");
        return sb.toString();
    }


    /**
     * "Recorre" la coleccion de misiones de la que coincida con
     * @param id
     * @return
     */
    public Mision buscarMision(int id) {

        Mision mision = null;
        boolean sigueBuscando = true;
        int posicion = 0;

        while ( !misiones.isEmpty() && sigueBuscando ) {
            mision = misiones.get(posicion);

            if(mision != null && mision.getId() == id){
                // study este metodo
                sigueBuscando = false;
            }
            posicion++;
        }

        return mision;

        /*
        Mision misionBuscado = null;
        boolean sigueBuscando = true;

        for(int i = 0; i < misiones.size(); i++){
            if(misiones.get(i).getId() == id){
                misionBuscado = misiones.get(i);
                sigueBuscando = false;
            }
        }
        return misionBuscado;
         */
    }

    public Mision eliminarMision(int id){ /
        Mision misionEliminada = null;

        misionEliminada = buscarMision(id);
        if(misionEliminada != null){
        misiones.remove(misionEliminada);
        }

        return misionEliminada;
    }

    /*
    public eliminarMisionConConfirmacion (int id){
        // buscar
        // devolver resultado
        // si confirma eliminamos


    }

    // study practicar como hacer esto con el while
}

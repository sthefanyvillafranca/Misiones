package camareros;

import cocineros.GestionDeMisiones;

import java.util.Scanner;

public class InterfazConsola {
    private GestionDeMisiones gestor;

    public InterfazConsola(GestionDeMisiones gestor) {
        this.gestor = gestor;
    }

    /**
     * Mostrar menu
     * 9. eliminar
     * mostrar respuestas
     * pedir distintos tipos de datos
     * llamar a las distintas funcionalidades del gestor
     * <p>
     * <p>
     * (interfaz) int preguntarID()
     * (interfaz- gestor) Mision buscarMision( id)
     * (interfaz - usuario ) mostrarMision()
     * (interfaz - usuario) solicitarConfirmacionEeliminacionMision(id/Mision)
     * (interfaz- gestor) eliminarMision(id /Mision) ==> devuelve la mision / confirmacion de eliminacion
     * (Gestor - interfaz- usuario) confirmarEliminacion()
     */

    public void iniciar() {

    }

    private void lanzarAccion(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("Hata la proxima");
                break;
            case 1:
                accionMostrarTexto((gestor.listarMisiones());
                break;
            case 2:
                this.accionCrearMision;

        }
    }

    private void accionCrearMision() {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIME LOS DATOS DE LA NUEVA MISION: ");
        System.out.println("\t Nombre: ");
    }

    private void mostrarTexto(String texto) {

    }

    private int leerOpcion() {
    return 1;
    }

    public void mostrarMenu() {

    }

    private boolean eliminarMision() {
    return false;
    }

}

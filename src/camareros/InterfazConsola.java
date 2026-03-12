package camareros;

import cocineros.GestionDeMisiones;

import java.util.Scanner;

public class InterfazConsola {
    private GestionDeMisiones gestor;
    private final Scanner scanner;


    public InterfazConsola(GestionDeMisiones gestor) {
        this.gestor = gestor;
        this.scanner = new Scanner(System.in);

        this.iniciar();
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
     * (interfaz - usuario) solicitarConfirmacionEliminacionMision(id/Mision)
     * (interfaz- gestor) eliminarMision(id /Mision) ==> devuelve la mision / confirmacion de eliminacion
     * (Gestor - interfaz- usuario) confirmarEliminacion()
     */

    public void iniciar() {
        int opcion;

        System.out.println("Iniciando consola...");

        do {
            this.mostrarMenu();

            opcion = this.leerOpcion(); // bucle de mostrar menu leer opcion...

            this.seleccionarAccion(opcion);


        }while (opcion!=0);



    }

    /**
     * Recibe el código de opción y llama al método correspondiente
     * @param opcion
     */
    private void seleccionarAccion(int opcion) {
        switch (opcion) {
            case 0:
                //salir
                System.out.println("Hata la proxima");
                break;
            case 1:
                // Listar
                this.mostrarTextoDecorado((gestor.listarMisiones());
                break;
            case 2:
                // crear mision
                this.crearMision();
                break;
                case 3:
                this.buscarMision();
                    break;
            case 9:
                //eliminar mision
                break;
            default: // cualquier otra opcion que no ofrecemos

                System.out.println("Opcion no valida, escoja otra");
        }
    }

    private void buscarMision() {

        // pedimos info de la mision (id)
        // solicitamos al gestor que nos busque y devuelva la mision
        // informamos al usuario


    }

    private void crearMision() {
        int id;
        String nombre;
        String dificultad;
        int nivelRecomendado;
        int recompensaExperiencia;
        boolean completada;
        String respuesta;

        // pedir datos:
        System.out.println("\nIntroduzca los datos de la misión: ");
        System.out.println("ID: ");
        id = this.scanner.nextInt();

        System.out.println("\nNombre: ");
        nombre = this.scanner.nextLine();

        System.out.println("\nDificultad (BAJA/MEDIA/ALTA): ");
        dificultad = this.scanner.nextLine();

        System.out.println("\nNivel Recomendado para superar misión: ");
        nivelRecomendado = this.scanner.nextInt();

        System.out.println("\nPuntos de experiencia como recompensa: ");
        recompensaExperiencia = this.scanner.nextInt();

        System.out.println("\n¿Creamos la misión como completada por defecto? (SI/NO): ");
        //operador ternario:
        //condicion?valor u accion si true: valor u accion si false
        completada = this.scanner.next().equalsIgnoreCase("NO") ? false : true; // study: diferencia entre next line y next solo

        // otra manera de hacerlo: (ternario)
        respuesta = this.scanner.next();

        if( respuesta.equalsIgnoreCase("No")){
            completada = false;

        } else {
            completada = true;
        }
        // guardar datos
        // pedimos al gestor que cree la mision a partir de los datos que me ha dado el usuario
        // el gestor nos devolverá o nullo o la mision

        if(gestor.crearMision(id,nombre,dificultad,nivelRecomendado,recompensaExperiencia,completada) == id ) {
            // informamos al usuario:
            // si devuelve mision --> mensaje con la info de la misión creada.
            System.out.println(String.format("La mision: %s ha sido creada correctamente", nombre));
        }else  {
            System.out.println(String.format("Error al crear la mision %s", nombre));
        }
        // el gestor nos devolverá o nullo o la mision
        // si devuelve nulo --> mensaje de error
        // si devuelve mision --> mensaje con la info de la misión creada.
    }

    private void accionCrearMision() {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIME LOS DATOS DE LA NUEVA MISIÓN: ");
        System.out.println("\t Nombre: ");
    }



    private int leerOpcion() {
        int opcion;
        opcion = this.scanner.nextInt();


    return opcion;
    }

    public void mostrarMenu() {
        System.out.println("\t1. Listar misiones:");
        System.out.println("\t2. crear mision");
        System.out.println("\t2. buscar mision");
        System.out.println("\t");
        System.out.println("\t9. eliminar mision (Solicita cinfirmacion)");
        System.out.println("\t\n");
        System.out.println("\t\n");
        System.out.println("\t0. Salir");

    }

    private boolean eliminarMision() {
    return false;
    }

    private void mostrarTextoDecorado(String texto){
        System.out.println("\n===========RESPUESTA===============");
        System.out.println(texto);
        System.out.println("\n============== FIN - RESPUESTA ================");

    }

}

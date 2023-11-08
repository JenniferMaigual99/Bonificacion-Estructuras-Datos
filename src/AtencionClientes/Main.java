package AtencionClientes;
import java.util.Scanner;


public class Main {
    public static Scanner inSc = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        String nombreCliente = "";
        int numticket = 0;

        Atencion atencion1 = new Atencion();

        //Menú
        while (option != -1) {
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Ver listado de Clientes");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese seleccion: ");
            option = inSc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Nombre y Número de Tiquete:");
                    nombreCliente = inSc.next();
                    inSc.nextLine();

                    numticket = inSc.nextInt();
                    atencion1.registrarCliente(new Cliente(nombreCliente, numticket));
                    break;
                case 2:
                    atencion1.procesarSiguiente();
                    break;
                case 3:
                    System.out.println("Listado de clientes");
                    atencion1.listadoClientes();
                    break;
                case 4:
                    System.out.println("Gracias por usar este software!");
                default:
                    option = -1;
                    break;
            }
        }
    }
}
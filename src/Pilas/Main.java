package Pilas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Menu menu = new Menu(chat);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.mostrarMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String nuevoUsuario = chat.obtenerNombreUsuario(scanner);
                    chat.conectarUsuario(nuevoUsuario);
                    break;
                case "2":
                    chat.desconectarUsuario();
                    break;
                case "3":
                    chat.mostrarUsuariosConectados();
                    break;
                case "4":
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

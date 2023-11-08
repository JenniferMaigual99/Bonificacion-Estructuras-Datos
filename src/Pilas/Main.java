package Pilas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        Menu menu = new Menu(chat);
        
        String opcion = "";
        String usuario = "";


        while (true) {
            menu.mostrarMenu();
            opcion = menu.obtenerOpcion();

            switch (opcion) {
                case "1":
                    usuario = menu.obtenerNombreUsuario();
                    System.out.println(usuario);
                    menu.getChat().agregarUsuario(usuario);
                    System.out.println("Usuario agregado exisamente "+ usuario);
                    break;
                case "2":
                    usuario = menu.obtenerNombreUsuario();
                    if (chat.conectarUsuario(usuario)){
                        System.out.println("Se conectó el usuario " + usuario);
                    }else{
                        System.out.println("El usuario no existe en el chat");
                    }
                    break;
                case "3":
                    usuario = menu.obtenerNombreUsuario();
                    if (chat.desconectarUsuario(usuario)){
                        System.out.println("Se desconectó el usuario " + usuario);
                    };
                    break;
                case "4":
                    menu.getChat().mostrarUsuariosConectados();
                    break;
                case "5":
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

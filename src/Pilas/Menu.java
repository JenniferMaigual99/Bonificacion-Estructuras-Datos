package Pilas;

import java.util.Scanner;

public class Menu {
    private Chat chat;
    private Scanner scanner = new Scanner(System.in);

    public Menu(Chat chat) {
        this.chat = chat;
    }

    public void mostrarMenu() {
        System.out.println("-------SISTEMA DE CHAT--------");
        System.out.println("1. Agregar un nuevo usuario");
        System.out.println("2. Conectar un usuario al chat");
        System.out.println("3. Desconectar un usuario al chat");
        System.out.println("4. Mostrar usuarios conectados");
        System.out.println("5. Salir");
        System.out.print("Elija una opción del menu: ");
    }

    public Chat getChat() {
        return chat;
    }

    public String obtenerOpcion(){
        return scanner.nextLine();
    }

    public String obtenerNombreUsuario() {
        while (true) {
            try {
                System.out.print("Ingrese el nombre del usuario : ");
                String entrada = scanner.nextLine();
                return entrada;
            } catch (Exception e) {
                scanner.nextLine();
                continue;
            }
        }
    }
}

package Pilas;

public class Menu {
    private Chat chat;
    public Menu(Chat chat) {
        this.chat = chat;
    }

    public void mostrarMenu() {
        System.out.println("-------SISTEMA DE CHAT--------");
        System.out.println("1. Conectar un nuevo usuario");
        System.out.println("2. Desconectar un usuario");
        System.out.println("3. Mostrar usuarios conectados");
        System.out.println("4. Salir");
        System.out.print("Elija una opción del menu: ");
    }
}






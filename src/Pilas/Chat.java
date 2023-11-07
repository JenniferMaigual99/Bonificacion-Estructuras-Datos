package Pilas;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;
public class Chat {
    private Stack<String> usuariosConectados;
    private List<String> usuariosAgregados;


    public Chat() {
        usuariosConectados = new Stack<>();
    }
    public void agregarUsuario(String nombreUsuario){
        usuariosAgregados.add(nombreUsuario);

    }
    public void conectarUsuario(String nombreUsuario) {
        usuariosConectados.push(nombreUsuario);//Coloca un elemneto en la parte superior de la piila
        System.out.println("Usuario '" + nombreUsuario + "' conectado.");
    }

    public void desconectarUsuario() {
        if (!usuariosConectados.isEmpty()) {
            String usuarioDesconectado = usuariosConectados.pop();//elimina un elemnto en la parte superior de la pila
            System.out.println("Usuario '" + usuarioDesconectado + "' desconectado.");
        } else {
            System.out.println("No hay usuarios conectados.");
        }
    }

    public void mostrarUsuariosConectados() {
        System.out.println("Usuarios conectados en orden inverso de conexión: " + usuariosConectados);
    }

    public String obtenerNombreUsuario(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario que se conecta: ");
        return scanner.nextLine();
    }
}

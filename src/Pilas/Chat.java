package Pilas;

import java.util.List;
import java.util.ArrayList;

import java.util.Stack;

public class Chat {
    private Stack<String> usuariosConectados;
    private List<String> usuariosAgregados;

    public Chat() {
        usuariosConectados = new Stack<>();
        usuariosAgregados = new ArrayList<>();
    }

    public void agregarUsuario(String nombreUsuario) {
        usuariosAgregados.add(nombreUsuario);
    }

    public boolean conectarUsuario(String nombreUsuario) {
        boolean found = false;
        for (String string : usuariosAgregados) {
            if (string.equals(nombreUsuario)) {
                found = true;
                break;
            }
        }
        if (found) {
            usuariosConectados.push(nombreUsuario);// Coloca un elemneto en la parte superior de la pila
            return true;
        }
        return false;
    }

    public boolean desconectarUsuario(String nombreUsuario) {
        if (!usuariosConectados.isEmpty()) {
            for (String string : usuariosConectados) {
                if (string.equals(nombreUsuario)) {
                    usuariosConectados.remove(nombreUsuario);
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void mostrarUsuariosConectados() {
        if (!usuariosConectados.isEmpty()) {
            System.out.println("Usuario conectados");
            for (String string : usuariosConectados) {
                System.out.println("\t" + string);
            }
            System.out.println("------------------------------");
        }else{
            System.out.println("No hay usuarios conectados");
        }
    }

    
}

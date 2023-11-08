package AtencionClientes;

import java.util.LinkedList;
import java.util.Queue;

public class Atencion {
    Queue<Cliente> colaClientes;
    //Inicializo la cola (FIFO)
    public Atencion() {
        this.colaClientes = new LinkedList<>();
    }

    //Añado un elemento a la cola
    public void registrarCliente(Cliente cliente) {
        this.colaClientes.add(cliente);
    }

    public void procesarSiguiente() {
        // FIFO -> First In First Out
        //Verifico que la cola no esté vacía
        if(colaClientes.peek() != null){
            System.out.println("Se ha atendido al cliente con ticket: " + colaClientes.peek().getNumticket());
            //Remuevo el primer elemento de la cola
            this.colaClientes.remove();
        }else{
            System.out.println("La cola está vacía");
        }
    }

    //Concateno Listado de Clientes
    public void listadoClientes() {
        String clientes = "";
        for (Cliente cliente : this.colaClientes) {
            clientes += cliente + "\n";
        }
        System.out.println(clientes);
    }
}



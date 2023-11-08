package AtencionClientes;

public class Cliente {
    private String nombre;
    private int numticket;

    public Cliente(String nombre, int numticket) {
        this.nombre = nombre;
        this.numticket = numticket;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumticket() {
        return numticket;
    }

    public void setNumticket(int numticket) {
        this.numticket = numticket;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numticket=" + numticket +
                '}';
    }
}

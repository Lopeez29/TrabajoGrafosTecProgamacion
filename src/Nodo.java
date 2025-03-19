public class Nodo {
    private String nombre;
    public Nodo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public boolean igual(Nodo v) {
        if (v == null) {
            return false;
        }
        return this.nombre.equals(v.getNombre());
    }
}

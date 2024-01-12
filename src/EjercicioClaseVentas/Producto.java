package EjercicioClaseVentas;

public class Producto {
    // Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Contructor
    public Producto(String nombre, double precio) {
        this.idProducto = ++contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}

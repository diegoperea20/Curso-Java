package EjercicioClaseVentas;

public class Orden {
    // Atributos
    private int idOrden;
    private Producto [] productos;
    private static int contadorOrdenes;
    private  int contadorProductos;
    private  static final int MAX_PRODUCTOS = 10;

    //Contructor
    public Orden() {
        this.idOrden = ++contadorOrdenes;
        //arreglo de objetos de la clase
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    //Metodos
    public void agregarProducto(Producto producto){
        if(contadorProductos < MAX_PRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }


    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total de la orden: $" + this.calcularTotal());
        System.out.println("Detalles de la orden: ");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}

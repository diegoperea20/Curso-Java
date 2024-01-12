package interfaces;


public class testinterfaces {
    public static void main(String[] args) {
        interfaces mysql = new implementacionmysql();
        mysql.insertar();
        mysql.actualizar();
        mysql.eliminar();
    }
}

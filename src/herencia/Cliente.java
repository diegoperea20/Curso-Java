package herencia;

import java.util.Date;
public class Cliente extends Persona {
    //Atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    //Constructor
    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip, Date fechaRegistro) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;

    }


    //Getters y Setters

    public int getIdCliente() {
        return idCliente;

    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                ", " + super.toString() +
                '}';
    }

    
}

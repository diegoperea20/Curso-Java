package interfaces;

public class implementacionmysql  implements interfaces{
    
    @Override
    public void insertar(){
        System.out.println("Insertar");
    }
    
    @Override
    public void actualizar(){
        System.out.println("Actualizar");
    }

    @Override
    public void eliminar(){
        System.out.println("Eliminar");
    }
}

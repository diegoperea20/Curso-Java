public class PasoporValor {
    //llama al metodo cambioValor()
    public static void main(String[] args) {
        int x=10;
        System.out.println("x="+x);
        x= cambioValor(x);
        System.out.println("x nuevo valor="+x);
    }

    public static int cambioValor(int x){
        x=20;
        return x;
    }
}

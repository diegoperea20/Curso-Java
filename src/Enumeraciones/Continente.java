package Enumeraciones;

public enum Continente {
    AFRICA(53), AMERICA(34), ASIA(24), EUROPA(15), OCEANIA(5);

    private final int paises;

    
    Continente(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
}

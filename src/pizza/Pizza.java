package pizza;

import adicion.Adicion;
import salsa.Salsa;

public class Pizza {

    private Salsa salsa;
    private Adicion[] adiciones;

    public Pizza(Salsa salsa, Adicion[] adiciones){
        this.adiciones = adiciones;
        this.salsa = salsa;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public Adicion[] getAdiciones() {
        return adiciones;
    }

    public void setAdiciones(Adicion[] adiciones) {
        this.adiciones = adiciones;
    }
}

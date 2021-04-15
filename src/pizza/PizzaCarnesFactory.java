package pizza;

import adicion.Adicion;
import adicion.Peperoni;
import adicion.Queso;
import adicion.Tocineta;
import salsa.Salsa;
import salsa.SalsaRanch;

public class PizzaCarnesFactory extends PizzaFactory {

    @Override
    public Adicion[] obtenerAdiciones() {
        return new Adicion[]{new Tocineta(), new Peperoni(), new Queso()};
    }

    @Override
    public Salsa obtenerSalsa() {
        return new SalsaRanch();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

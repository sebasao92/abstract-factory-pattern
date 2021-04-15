package pizza;

import adicion.Adicion;
import adicion.Jamon;
import adicion.Piña;
import adicion.Queso;
import salsa.Salsa;
import salsa.SalsaTomate;

public class PizzaHawaianaFactory extends PizzaFactory {

    @Override
    public Adicion[] obtenerAdiciones() {
        return new Adicion[]{new Queso(), new Jamon(), new Piña()};
    }

    @Override
    public Salsa obtenerSalsa() {
        return new SalsaTomate();
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

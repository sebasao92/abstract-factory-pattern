package pizza;

import adicion.Adicion;
import salsa.Salsa;

public abstract class PizzaFactory {

    public abstract Adicion[] obtenerAdiciones();
    public abstract Salsa obtenerSalsa();
}

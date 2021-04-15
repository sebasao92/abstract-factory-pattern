import pizza.Pizza;
import pizza.PizzaFactory;

public class Orden {

    private Pizza pizza;

    public Orden(PizzaFactory pizzaFactory){
        this.pizza = new Pizza(pizzaFactory.obtenerSalsa(), pizzaFactory.obtenerAdiciones());
    }
}

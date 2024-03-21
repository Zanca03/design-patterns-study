package Creational.Factory.factories;

import Creational.Factory.interfaces.Burger;
import Creational.Factory.models.BeefBurger;
import Creational.Factory.models.ChickenBurger;

public class BurgerFactory {
    public static Burger newBurger(String request){
        Burger burger = null;
        if (request.equals("Beef"))
            burger = new BeefBurger();
        else if (request.equals("Chicken"))
            burger = new ChickenBurger();
        return burger;
    }
}

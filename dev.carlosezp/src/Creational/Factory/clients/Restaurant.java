package Creational.Factory.clients;

import Creational.Factory.factories.BurgerFactory;
import Creational.Factory.interfaces.Burger;

public class Restaurant {
    public Burger orderBurger(String request){
        Burger burger = BurgerFactory.newBurger(request);
        return burger;
    }
}
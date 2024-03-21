package Creational.Factory.models;

import Creational.Factory.clients.Restaurant;
import Creational.Factory.interfaces.Burger;

public class BeefBurger extends Restaurant implements Burger {
    private String status;

    public BeefBurger(){
        status = "Request";
    }
    @Override
    public void prepare() {
        String stepByStep = """
                Taking bread
                Preparing Beef Burger
                Adding onions and sauce
                Joining everything
                """;
        System.out.println(stepByStep);
        status = "Prepared to deliver";
    }

    @Override
    public String getStatus() {
        return status;
    }
}

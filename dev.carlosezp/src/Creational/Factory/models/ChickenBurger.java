package Creational.Factory.models;

import Creational.Factory.interfaces.Burger;

public class ChickenBurger implements Burger {
    private String status;

    public ChickenBurger(){
        status = "Request";
    }
    @Override
    public void prepare() {
        String stepByStep = """
                Taking bread
                Preparing Chicken Burger
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


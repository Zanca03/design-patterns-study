package Creational.AbstractFactory.models;

import Creational.AbstractFactory.interfaces.Laptop;

public class GalaxyBook implements Laptop {
    @Override
    public void printProduct() {
        System.out.println("GalaxyBook was created");
    }
}

package Creational.AbstractFactory.models;

import Creational.AbstractFactory.interfaces.Laptop;

public class MacBook implements Laptop {
    @Override
    public void printProduct() {
        System.out.println("MacBook was created");
    }
}

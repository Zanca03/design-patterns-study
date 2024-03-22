package Creational.AbstractFactory.models;

import Creational.AbstractFactory.interfaces.CellPhone;

public class GalaxyS24 implements CellPhone {
    @Override
    public void printProduct() {
        System.out.println("Galaxy S24 was created");
    }
}

package Creational.AbstractFactory.models;

import Creational.AbstractFactory.interfaces.CellPhone;

public class Iphone implements CellPhone {
    @Override
    public void printProduct() {
        System.out.println("Iphone was created");
    }
}

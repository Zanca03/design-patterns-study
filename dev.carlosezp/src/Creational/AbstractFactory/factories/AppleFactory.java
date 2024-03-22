package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.interfaces.CellPhone;
import Creational.AbstractFactory.interfaces.Factory;
import Creational.AbstractFactory.interfaces.Laptop;
import Creational.AbstractFactory.models.Iphone;
import Creational.AbstractFactory.models.MacBook;

public class AppleFactory implements Factory {
    @Override
    public CellPhone createCellPhone() {
        return new Iphone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}

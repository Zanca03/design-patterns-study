package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.interfaces.CellPhone;
import Creational.AbstractFactory.interfaces.Factory;
import Creational.AbstractFactory.interfaces.Laptop;
import Creational.AbstractFactory.models.GalaxyBook;
import Creational.AbstractFactory.models.GalaxyS24;

public class SamsungFactory implements Factory {
    @Override
    public Laptop createLaptop() {
        return new GalaxyBook();
    }

    @Override
    public CellPhone createCellPhone() {
        return new GalaxyS24();
    }
}

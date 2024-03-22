package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.interfaces.CellPhone;
import Creational.AbstractFactory.interfaces.Factory;
import Creational.AbstractFactory.interfaces.Laptop;

public class EletronicFactory {
    Factory factory;
    public EletronicFactory(String factory) throws Exception{
        if (factory.toLowerCase().equals("apple")){
            this.factory = new AppleFactory();
        } else if (factory.toLowerCase().equals("samsung")) {
            this.factory = new SamsungFactory();
        }else
            throw new Exception("Factory not found");
    }
    public Laptop createLapTop(){
        return factory.createLaptop();
    }
    public CellPhone createCellPhone(){
        return factory.createCellPhone();
    }
}

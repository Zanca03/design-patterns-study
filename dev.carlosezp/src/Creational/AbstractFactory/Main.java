package Creational.AbstractFactory;

import Creational.AbstractFactory.factories.EletronicFactory;
import Creational.AbstractFactory.interfaces.CellPhone;
import Creational.AbstractFactory.interfaces.Laptop;

public class Main {
    public static void main(String[] args) {
        try {
            EletronicFactory ef = new EletronicFactory("samsung");
            CellPhone cellPhone = ef.createCellPhone();
            cellPhone.printProduct();
            Laptop laptop = ef.createLapTop();
            laptop.printProduct();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

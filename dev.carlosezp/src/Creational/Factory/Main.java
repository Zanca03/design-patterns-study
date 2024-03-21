package Creational.Factory;

import Creational.Factory.clients.Restaurant;
import Creational.Factory.interfaces.Burger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Burger burger = null;

        System.out.println("[1] Beff Burger");
        System.out.println("[2] Chicken Burger");

        int choice = sc.nextInt();
        sc.close();

        if (choice == 1){
            burger = restaurant.orderBurger("Beef");
        }else if(choice == 2){
            burger = restaurant.orderBurger("Chicken");
        }
        try {
            System.out.println("Status = " + burger.getStatus());
            burger.prepare();
            System.out.println("Status = " + burger.getStatus());
            System.out.println("You burger is prepared!");
        }catch (Exception e){
            System.out.println("Something wrong happened. Please try again later.");
        }
    }
}

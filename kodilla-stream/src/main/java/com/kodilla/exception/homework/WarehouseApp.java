package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        warehouse.addOrder(new Order("Order6"));

        warehouse.getOrder( "Order5");
        try {
            warehouse.isOrderInUse("Order10");
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie nie istnieje. Spróbuj innego numeru.");
        }
        System.out.println("Twoje zamówienie. Sprawdź inny.");
    }
}


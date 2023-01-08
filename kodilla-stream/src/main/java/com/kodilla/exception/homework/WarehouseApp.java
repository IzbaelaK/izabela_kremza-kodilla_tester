package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        try {
            Order findOrder = warehouse.getOrder("567DD");
            System.out.println("Order found!");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesnt exist!");
        } finally {
            System.out.println("Hope result is fine!");
        }
    }}

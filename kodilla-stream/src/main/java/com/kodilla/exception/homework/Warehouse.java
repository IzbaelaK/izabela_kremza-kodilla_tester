package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }
    public Set<Order> getOrder(String number) {
        try{ getOrders()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny().orElseThrow();

        } catch (Exception e) {
            System.out.println("Zamówienie nie istnieje. Spróbuj innego numeru.");
        }
        return getOrders();
    }

    public String isOrderInUse (String number) throws OrderDoesntExistException {
        if (getOrder(number).equals(number))
            return getOrder(number).toString();
        throw new OrderDoesntExistException();
    }

    public Set<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
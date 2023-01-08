package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order getOrder (String number) throws OrderDoesntExistException {
        return orders.stream().filter(o->o.getNumber().equals(number)).findAny().orElseThrow(()->new OrderDoesntExistException());
    }

    public String isOrderInUse (String number) throws OrderDoesntExistException {
        if (getOrder(number).equals(number))
            return getOrder(number).toString();
        throw new OrderDoesntExistException();

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
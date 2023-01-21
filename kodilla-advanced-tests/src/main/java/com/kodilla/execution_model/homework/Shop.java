package com.kodilla.execution_model.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Shop {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order orders) {
        this.orders.add(orders);
    }

    public List getOrdersFromADateRange(String dateOne, String dateTwo) throws ParseException {
        List<Order> ordersWithDates = new ArrayList<>();
        int index = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = formatter.parse(dateOne);
        Date date2 = formatter.parse(dateTwo);

        for (index = 0; index < this.orders.size(); index++) {
            Date date = formatter.parse(this.orders.get(index).getOrderDate());
            if (date.after(date1) && date.before(date2)) {
                ordersWithDates.add(orders.get(index));
            }
        }
        return ordersWithDates;

    }

    public Order getOrdersFromAValueRange(double max, double min) {
        int index = 0;
        for (index = 0; index < this.orders.size(); index++) ;
        if (this.orders.get(index).getOrderValue() >= min && this.orders.get(index).getOrderValue() <= max) {
            return this.orders.get(index);
        }
        return null;
}
    public int getNumberOfOrders() {
        return this.orders.size();
    }
    public double getSumOfValues() {
        double sumOfValues = 0;
        int index = 0;
        for(index = 0; index < this.orders.size(); index++) {
            sumOfValues = sumOfValues + this.orders.get(index).getOrderValue();
        }
        return sumOfValues;
    }
}



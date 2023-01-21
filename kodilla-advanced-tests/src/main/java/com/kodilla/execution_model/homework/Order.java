package com.kodilla.execution_model.homework;

import java.util.Objects;

public class Order {
 private double orderValue;
 private String numberOrder;
 private String orderDate;


 public Order(double orderValue, String numberOrder, String orderDate) {
  this.orderValue = orderValue;
  this.numberOrder = numberOrder;
  this.orderDate = orderDate;
 }

 public double getOrderValue() {
  return orderValue;
 }

 public String getNumberOrder() {
  return numberOrder;
 }

 public String getOrderDate() {
  return orderDate;
 }

 @Override
 public String toString() {
  return "Order{" +
          "orderValue=" + orderValue +
          ", numberOrder='" + numberOrder + '\'' +
          ", orderDate='" + orderDate + '\'' +
          '}';
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Order order = (Order) o;
  return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(numberOrder, order.numberOrder) && Objects.equals(orderDate, order.orderDate);
 }

 @Override
 public int hashCode() {
  return Objects.hash(orderValue, numberOrder, orderDate);
 }
}
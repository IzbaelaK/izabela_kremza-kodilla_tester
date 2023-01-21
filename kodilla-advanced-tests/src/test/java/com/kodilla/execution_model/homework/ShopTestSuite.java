package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {

    Shop shop = new Shop();

    Order one = new Order(200.00, "1452/2022", "2022-12-02");
    Order two = new Order(378.00, "1457/2022", "2022-12-06");
    Order three = new Order(170.00, "1460/2022", "2022-12-16");
    Order four = new Order(78.00, "1478/2022", "2022-12-20");
    Order five = new Order(480.00, "1490/2022", "2022-12-21");
    Order six = new Order(214.00, "1454/2022", "2022-12-04");

    @Test
    public void shouldAddNewOrder() {
        //when
        int result = shop.getNumberOfOrders();
        //then
        assertEquals(1454 / 2022, result);

    }

    @Test
    public void shouldGetOrdersFromADateRange() throws ParseException {
        //when
        List<Order> result1 = shop.getOrdersFromADateRange("2022-12-02", "2022-12-20");
        //then
        assertEquals(new Order(200.0, "1452/2022", "2022-12-02"), result1.get(0));

    }
    @Test
    public void shouldGetOrdersFromAValueRange(){
        //when
        Order result2 = shop.getOrdersFromAValueRange(200.0, 50.0);
        //then
        assertEquals(170.0, result2.getOrderValue(), 0.01);
        assertEquals("2022-12-16", result2.getOrderDate());
        assertEquals("1460/2022", result2.getNumberOrder());
    }
    @Test
    public void shouldReturnNullWhenPassingValueOutOfRange() {
        //when
        Order result3 = shop.getOrdersFromAValueRange(990.0, 500.0);
        //then
        assertNull(result3);
    }
    @Test
    public void shouldGetNumberOfOrders() {
        //when
        int result4 = shop.getNumberOfOrders();
        //then
        assertEquals(5,result4);
    }
    @Test
    public void shouldGetSumOfValues() {
        //when
        double result5 = shop.getSumOfValues();
        //then
        assertEquals(1520.0, result5);

    }
    @BeforeEach
    public void initializeShop() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
        shop.addOrder(four);
        shop.addOrder(five);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }
    @BeforeAll
    public void displayIntroMessage() {
        System.out.println("Starting testing");
    }
    @AfterAll
    public void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}

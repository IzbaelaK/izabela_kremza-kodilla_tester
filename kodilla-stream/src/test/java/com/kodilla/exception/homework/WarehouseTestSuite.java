package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


class WarehouseTestSuite {
    @Test
    public void testIsItOrdered() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.isOrderInUse("Order10"));
    }
}
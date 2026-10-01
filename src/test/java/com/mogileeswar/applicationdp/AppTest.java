package com.mogileeswar.applicationdp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {

        int result = App.add(10, 20);

        assertEquals(30, result);
    }
}
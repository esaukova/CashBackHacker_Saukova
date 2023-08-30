package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceJunit5 {

    @org.junit.Test
    public void testRemainWhenAmountBelowBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assertions.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testRemainWhenAmountEqualBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRemainWhenAmountAboveBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(1_800);

        Assertions.assertEquals(expected, actual);

    }


}

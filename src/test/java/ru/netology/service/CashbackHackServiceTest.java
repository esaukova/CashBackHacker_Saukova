package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainWhenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1_000);

        Assert.assertEquals(actual, expected);

    }


    @Test
    public void testRemainWhenAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(1_800);

        Assert.assertEquals(actual, expected);


    }
}
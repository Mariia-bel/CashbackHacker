package ru.netology;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldSow150() {
        int amount = 850;
        int expected = 150;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSow50() {
        int amount = 950;
        int expected = 50;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSow0() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSow0To() {
        int amount = 1400;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @AfterEach

    public void Msg(int expected){
        System.out.println("For get bonuses you need buy for " + expected + " rub");
    }

}
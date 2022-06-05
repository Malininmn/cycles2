package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldSum () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.sum(sales);

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals( expected, actual );

    }

    @Test
    public void ShouldAvr () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.avr(sales);

        long expected = 15;

        Assertions.assertEquals( expected, actual );

    }

    @Test
    public void ShouldNumberOfMonthWithMaxSales () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSales(sales);

        long expected = 8;

        Assertions.assertEquals( expected, actual );

    }


    @Test
    public void ShouldNumberOfMonthWithMinSales () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSales(sales);

        long expected = 9;

        Assertions.assertEquals( expected, actual );

    }



    @Test
    public void ShouldCountMonthsBelowAvr () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.belowAvr(sales);

        long expected = 5;

        Assertions.assertEquals( expected, actual );

    }



    @Test
    public void ShouldCountMonthsAboveAvr () {

        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.aboveAvr(sales);

        long expected = 5;

        Assertions.assertEquals( expected, actual );

    }


}

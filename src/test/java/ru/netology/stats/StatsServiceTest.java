package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void salesAmountTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        long actual = service.salesAmount(arraySalesAmount);

        /* Не совсем понял из условия задания каким должен быть автотест, то есть сравнивать ожидаемый результат с актуальным
        или просто выводить сумму всех продаж, поэтому оставил оба варианта */

        Assertions.assertEquals(expected, actual);

        System.out.println("Сумма всех продаж: " + actual);
    }

    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        long actual = service.averageSalesAmount(arraySalesAmount);

        Assertions.assertEquals(expected, actual);

        System.out.println("Средняя сумма продаж: " + actual);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(arraySalesAmount);

        // Тут на самом деле тоже не совсем понятно что нужно вернуть/сравнить, ведь у нас 2 месяца с пиковыми продажами

        Assertions.assertEquals(expected, actual);

        System.out.println("Месяц в котором был пик продаж: " + actual);
    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(arraySalesAmount);

        Assertions.assertEquals(expected, actual);

        System.out.println("Месяц с минимальными продажами: " + actual);
    }

    @Test
    public void countMonthBelowAverageSalesTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.countMonthBelowAverageSales(arraySalesAmount);

        Assertions.assertEquals(expected, actual);

        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + actual);
    }

    @Test
    public void countMonthAboveAverageSalesTest() {
        StatsService service = new StatsService();

        long[] arraySalesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.countMonthAboveAverageSales(arraySalesAmount);

        Assertions.assertEquals(expected, actual);

        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + actual);
    }
}

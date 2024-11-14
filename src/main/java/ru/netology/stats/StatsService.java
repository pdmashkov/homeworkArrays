package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] arraySalesAmount) {
        long sumSalesAmount = 0;

        for (long sum : arraySalesAmount) {
            sumSalesAmount = sumSalesAmount + sum;
        }

        return sumSalesAmount;
    }

    public long averageSalesAmount(long[] arraySalesAmount) {
        return salesAmount(arraySalesAmount) / arraySalesAmount.length;
    }

    public int maxSalesMonth(long[] arraySalesAmount) {
        int maxMonth = 0;

        for (int i = 0; i < arraySalesAmount.length; i++) {
            if (arraySalesAmount[i] >= arraySalesAmount[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSalesMonth(long[] arraySalesAmount) {
        int minMonth = 0;

        for (int i = 0; i < arraySalesAmount.length; i++) {
            if (arraySalesAmount[i] <= arraySalesAmount[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int countMonthBelowAverageSales(long[] arraySalesAmount) {
        long averageSaleAmount = averageSalesAmount(arraySalesAmount);
        int countMonth = 0;

        for (long sale : arraySalesAmount) {
            if (sale < averageSaleAmount) {
                countMonth++;
            }
        }

        return countMonth;
    }

    public int countMonthAboveAverageSales(long[] arraySalesAmount) {
        long averageSaleAmount = averageSalesAmount(arraySalesAmount);
        int countMonth = 0;

        for (long sale : arraySalesAmount) {
            if (sale > averageSaleAmount) {
                countMonth++;
            }
        }

        return countMonth;
    }
}

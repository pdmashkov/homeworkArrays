package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] arraySalesAmount) {
        int sumSalesAmount = 0;

        for (int sum : arraySalesAmount) {
            sumSalesAmount = sumSalesAmount + sum;
        }

        return sumSalesAmount;
    }

    public int averageSalesAmount(int[] arraySalesAmount) {
        return salesAmount(arraySalesAmount) / arraySalesAmount.length;
    }

    public int maxSalesMonth(int[] arraySalesAmount) {
        int maxMonth = 0;

        for (int i = 0; i < arraySalesAmount.length; i++) {
            if (arraySalesAmount[i] >= arraySalesAmount[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSalesMonth(int[] arraySalesAmount) {
        int minMonth = 0;

        for (int i = 0; i < arraySalesAmount.length; i++) {
            if (arraySalesAmount[i] <= arraySalesAmount[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int countMonthBelowAverageSales(int[] arraySalesAmount) {
        int averageSaleAmount = averageSalesAmount(arraySalesAmount);
        int countMonth = 0;

        for (int sale : arraySalesAmount) {
            if (sale < averageSaleAmount) {
                countMonth++;
            }
        }

        return countMonth;
    }

    public int countMonthAboveAverageSales(int[] arraySalesAmount) {
        int averageSaleAmount = averageSalesAmount(arraySalesAmount);
        int countMonth = 0;

        for (int sale : arraySalesAmount) {
            if (sale > averageSaleAmount) {
                countMonth++;
            }
        }

        return countMonth;
    }
}

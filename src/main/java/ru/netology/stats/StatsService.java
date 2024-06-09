package ru.netology.stats;

public class StatsService {
    //сумма всех продаж за весь период
    public long summarySales(long[] sales) {
        long amountSales = 0;
        for (long i : sales) {
            amountSales = amountSales + i;
        }
        return amountSales;
    }

    //средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return summarySales(sales) / sales.length;
    }

    //месяц максимальных продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //месяц минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // месяцы,где продажи были ниже среднего
    public int salesUnderAverage(long[] sales) {
        int monthUnderAverage = 0;

        for (long i : sales) {
            if (i < averageSales(sales)) {
                monthUnderAverage++;
            }
        }
        return monthUnderAverage;

    }

    //месяцы,в которых продажи были выше среднего
    public int salesAboveAverage(long[] sales) {
        int monthAboveAverage = 0;
        for (long i : sales) {
            if (i > averageSales(sales)) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}
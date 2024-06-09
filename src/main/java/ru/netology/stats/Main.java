package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Набор данных о продажах: ");
        for (long sale : sales) {
            System.out.print(sale + " ");
        }
        System.out.println();
        System.out.println("Сумма всех продаж: " + service.summarySales(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSales(sales));
        System.out.println("Номер месяца с пиком продаж: " + service.maxSales(sales));
        System.out.println("Номер месяца с минимумом продаж: " + service.minSales(sales));
        System.out.println("Количество месяцев с продажами ниже среднего: " + service.salesUnderAverage(sales));
        System.out.println("Количество месяцев с продажами выше среднего: " + service.salesAboveAverage(sales));
    }
}
package home_work_7_inheritance.exercise_6;

public class Main {
    public static void main(String[] args) {
        int totalCost = 0;
        int maxDayOfLife = 0;


        Roses rose1 = new Roses("Роза красная", 5, "red", 5);
        Peonies peony1 = new Peonies("Пион белый", 8, "white", 10);

        Flowers[] bouquetOfFlowers = new Flowers[7];
        bouquetOfFlowers[0] = new Roses("Роза красная", 5, "red", 5);
        bouquetOfFlowers[1] = new Roses("Роза красная", 5, "red", 5);
        bouquetOfFlowers[2] = new Peonies("Пион белый", 8, "white", 10);
        bouquetOfFlowers[3] = new Peonies("Пион белый", 8, "white", 10);
        bouquetOfFlowers[4] = new Peonies("Пион белый", 8, "white", 10);
        bouquetOfFlowers[5] = new Lilies("Лилия желтая", 6, "yellow", 15);
        bouquetOfFlowers[6] = new Lilies("Лилия желта", 6, "yellow", 15);

        System.out.println("Цвета используемые в букете: ");

        for (Flowers flowerFromBouquet : bouquetOfFlowers) {
            totalCost = totalCost + flowerFromBouquet.cost;
            if (maxDayOfLife < flowerFromBouquet.dayOfLife) {
                maxDayOfLife = flowerFromBouquet.dayOfLife;
            }
            System.out.println(flowerFromBouquet.color);
        }
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Количество дней через который букет полностью завянет: " + maxDayOfLife);

    }
}

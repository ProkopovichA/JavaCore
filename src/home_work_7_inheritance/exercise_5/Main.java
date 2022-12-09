package home_work_7_inheritance.exercise_5;

public class Main {
    public static void main(String[] args) {

        int totalCost = 0;

        PublicTransport[] park = new PublicTransport[6];
        park[0] = new Bus("Bus 1", 1000, 10);
        park[1] = new Bus("Bus 2", 1200, 8);
        park[2] = new Tram("Tram 1", 2000, 3);
        park[3] = new Tram("Tram 2", 2000, 3);
        park[4] = new TrolleyBus("Trolley bus 1", 1500, 5);
        park[5] = new TrolleyBus("Trolley bus 2", 1400, 5);

        for (PublicTransport publicTransports : park) {
            totalCost = totalCost + publicTransports.cost;
        }

        System.out.println("Общая стоимость машин парка: " + totalCost);

        //Сортировка машин парка по расходу топлива
        int indexOfArr = -1;
        int tmp;
        PublicTransport tmpPublicTransport;

        for (int i = 0; i < park.length; i++) {
            tmp = park[i].fuelConsumption;
            indexOfArr = -1;
            //System.out.println(i);
            for (int j = i; j < park.length; j++) {
                if (park[j].fuelConsumption < tmp) {
                    tmp = park[j].fuelConsumption;
                    indexOfArr = j;
                }
            }
            if (indexOfArr != -1) {
                tmpPublicTransport = park[i];
                park[i] = park[indexOfArr];
                park[indexOfArr] = tmpPublicTransport;
            }
        }

        //Проверка сортировки
        for (PublicTransport publicTransports : park) {
            System.out.println(publicTransports.fuelConsumption);
        }

        //найдем машину которая потребляет меньше 10 литров, и стоит меньше 2000
        for (PublicTransport publicTransports : park) {
            if ((publicTransports.fuelConsumption < 10) && (publicTransports.cost < 2000)) {
                System.out.println(publicTransports.name);
            }
        }

    }
}

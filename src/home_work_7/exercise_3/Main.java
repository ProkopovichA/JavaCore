package home_work_7.exercise_3;

import lesson_7.Car;
import lesson_7.Transport;

public class Main {
    public static void main(String[] args) {
        int totalPower = 0;

        Technique[] techniqueOfHome = new Technique[6];
        techniqueOfHome[0] = new KitchenAppliances("Чайник", 1500);
        techniqueOfHome[1] = new KitchenAppliances("Тостер", 700);
        techniqueOfHome[2] = new KitchenAppliances("Блэндер", 300);
        techniqueOfHome[3] = new OtherAppliances("Пылесос", 2000);
        techniqueOfHome[4] = new OtherAppliances("Телевизор", 150);
        techniqueOfHome[5] = new OtherAppliances("Стриральная машина", 500);

        techniqueOfHome[1].plugIn();
        techniqueOfHome[3].plugIn();
        techniqueOfHome[4].plugIn();

        for (Technique techniquesOfHome : techniqueOfHome) {
            totalPower = totalPower + techniquesOfHome.сalculatePower();
        }

        System.out.println("Итоговая мощность работающих приборов: " + totalPower);

        //Сортировка приборов по мощности
        int indexOfArr = -1;
        int tmp;
        Technique tmpTechnique;

        for (int i = 0; i < techniqueOfHome.length; i++) {
            tmp = techniqueOfHome[i].power;
            indexOfArr = -1;
            //System.out.println(i);
            for (int j = i; j < techniqueOfHome.length; j++) {
                if (techniqueOfHome[j].power < tmp) {
                    tmp = techniqueOfHome[j].power;
                    indexOfArr = j;
                }
            }
            if (indexOfArr != -1) {
                tmpTechnique = techniqueOfHome[i];
                techniqueOfHome[i] = techniqueOfHome[indexOfArr];
                techniqueOfHome[indexOfArr] = tmpTechnique;
            }

        }

        //Проверка сортировки
        for (Technique techniquesOfHome : techniqueOfHome) {
            System.out.println(techniquesOfHome.power);
        }

        //найдем кухонный прибор который включен в розетку и потребляет больше 500 ватт
        for (Technique techniquesOfHome : techniqueOfHome) {
            if ((techniquesOfHome instanceof KitchenAppliances) && (techniquesOfHome.power > 500)) {
                System.out.println("Найден прибор: " + techniquesOfHome.deviceName);
            }
        }


    }
}

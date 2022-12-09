package home_work_09_generalizations_enum;

public class VegetarianChecker {
    public static boolean isVegetarian(Food[] foods) {
        for (Food i : foods) {
            if (!i.isVegetarian()) {
                return false;
            }
        }
        return true;
    }
}

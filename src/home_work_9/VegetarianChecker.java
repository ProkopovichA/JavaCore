package home_work_9;

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

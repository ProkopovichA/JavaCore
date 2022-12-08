package home_work_9;

public enum FoodType {
    MEAT(false), FISH(false), FRUIT(true), VEGETABLE(true), MILK(false), UNKNOWN(false);

    private boolean vegetarian;

    FoodType(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    FoodType() {
        this(true);
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

}

package home_work_9_generalizations_enum;

public abstract class Food {
    protected String name;
    protected FoodType foodType;

    public abstract FoodType getFoodType();
    public abstract String getName();
    public abstract void setName(String name);


    public boolean isVegetarian() {
        if (foodType.isVegetarian()) {
            return true;
        }
        return false;
    }

}

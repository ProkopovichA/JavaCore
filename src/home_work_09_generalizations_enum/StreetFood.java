package home_work_09_generalizations_enum;

public class StreetFood extends Food {

    public StreetFood() {

    }

    public StreetFood(String name, FoodType foodType) {
        this.name = name;
        this.foodType = foodType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

}

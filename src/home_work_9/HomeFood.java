package home_work_9;

public class HomeFood extends Food {

    public HomeFood() {

    }

    public HomeFood(String name, FoodType foodType) {
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

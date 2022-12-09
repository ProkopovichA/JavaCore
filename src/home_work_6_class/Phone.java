package home_work_6_class;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void printPhone() {
        System.out.println("Номер: " + number + ", модель: " + model + ", вес: " + weight);
    }

    public int receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
        return number;
    }

    public int receiveCall(String callerName, int extNumber) {
        System.out.println("Звонит " + callerName);
        return extNumber;
    }

    public void sendMessage(int...listOfPhoneNumbers) {
        for (int phoneNumber : listOfPhoneNumbers) {
            System.out.println(phoneNumber);
        }
    }


}

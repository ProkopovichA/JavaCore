package lesson_17_lombok_builred;

public class temp {

    public static void main(String[] args) {
        int myInt = 123456;
        int temp2 = 0;
        while (myInt != 0) {
            temp2 = temp2 + (myInt % 10);
        }
        myInt = myInt / 10;
    }


}

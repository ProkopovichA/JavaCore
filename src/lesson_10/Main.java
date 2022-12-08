package lesson_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) {
//        String[] arrString = {"a", "b", "a", "d", "b", "c"};
//        Integer[] arrInt = {1, 2, 1, 3, 2, 3};
//        System.out.println(arrayToMap(arrInt));
//        System.out.println(arrayToMap(arrString));
//        String myStirng = "baaccc   ";
//        System.out.println(arrayToMap(myStirng.split("")));

        User user1 = new User("John","Smith");
        User user2 = new User("John","Smith");

        System.out.println(user1);
        System.out.println(user2);

        HashSet hashSet = new HashSet();
        hashSet.add(user1);
        hashSet.add(user2);

        System.out.println(hashSet);


    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        int counter = 0;
        Map<K, Integer> myMap = new HashMap<>();
        for (int i = 0; i < ks.length; i++){
            if (myMap.get(ks[i]) == null) {
                myMap.put(ks[i], 1);
            } else {
                counter = myMap.get(ks[i]);
                myMap.put(ks[i],++counter);
            }
        }
        return myMap;
    }
}

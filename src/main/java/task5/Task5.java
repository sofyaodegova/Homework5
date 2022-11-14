package task5;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, Integer> cats = new HashMap<>();
        cats.put("Vasya", 2);
        cats.put("Murzik", 5);
        cats.put("Lucifer", 1);

        HashMap<String, Integer> dogs = new HashMap<>();
        dogs.put("Bim", 6);
        dogs.put("Sumrak", 11);
        dogs.put("Nora", 2);

        HashMap<String, Integer> pets = new HashMap<>();
        pets.putAll(cats);
        pets.putAll(dogs);

        System.out.println(pets);
    }
}

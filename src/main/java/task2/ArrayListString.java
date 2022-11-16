package task2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Giraffe");

        System.out.println("Создан новый массив: " + animals);

        Collections.sort(animals);
        System.out.println("Массив отсортирован от A до Z: " + animals);

        Collections.reverse(animals);
        System.out.println("Массив отсортирован от A до Z: " + animals);

        animals.clear();
        System.out.println("Массив очищен: " + animals);
    }
}
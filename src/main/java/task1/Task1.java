package task1;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> task1 = new ArrayList<Integer>();
        task1.add(7);
        task1.add(2);
        task1.add(9);
        task1.add(4);
        task1.add(11);

        System.out.println("Создан новый массив: " + task1.toString());

        Collections.sort(task1);
        System.out.println("Массив отсортирован по возрастанию: " + task1);

        Collections.reverse(task1);
        System.out.println("Массив отсортирован по убыванию: " + task1);

        task1.clear();
        System.out.println("Массив очищен: " + task1);
    }
}

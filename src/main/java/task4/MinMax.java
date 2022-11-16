package task4;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(53);
        array.add(158);
        array.add(33);
        array.add(98);
        System.out.println("Максимальное значение в массиве: " + Collections.max(array));
        System.out.println("Минимальное значение в массиве: " + Collections.min(array));
    }
}

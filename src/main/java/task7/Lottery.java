package task7;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<Integer>(100);

        for (int i = 1; i <= 100; i++) {
            lottery.add(i);
        }

        Collections.shuffle(lottery);
        for (int j = 1; j <= 10; j++) {
            System.out.println(j + " элемент: " + lottery.get(j));
        }
    }
}
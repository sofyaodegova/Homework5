package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> ageAndNames = new HashMap<>();

        ageAndNames.put("Александра Ивановна Петрова", 22);
        ageAndNames.put("Иван Сергеевич Николаев", 33);
        ageAndNames.put("Олег Викторович Дерендяев", 18);
        ageAndNames.put("Ольга Владимировна Шулятьева", 16);
        ageAndNames.put("Михаил Романович Белых", 17);
        ageAndNames.put("Игорь Тимофеевич Ефремов", 8);
        ageAndNames.put("Тимофей Анатольевич Ефремов", 37);
        ageAndNames.put("Наталья Григорьевна Николаева", 31);

        ArrayList<String> adults = new ArrayList<>();
        adults.add("Александра Ивановна Петрова");
        adults.add("Иван Сергеевич Николаев");
        adults.add("Олег Викторович Дерендяев");
        adults.add("Тимофей Анатольевич Ефремов");
        adults.add("Наталья Григорьевна Николаева");

        Collections.sort(adults);
        System.out.println("Список жильцов, отсортированный от А до Я: " + adults);
    }
}


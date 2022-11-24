package task3;

import java.util.*;

public class House {
    public static void main(String[] args) {
        ArrayList<String> adults = new ArrayList<>();

        HashMap<String, Integer> ageAndNames = new HashMap<>();

        ageAndNames.put("Александра Ивановна Петрова", 22);
        ageAndNames.put("Иван Сергеевич Николаев", 33);
        ageAndNames.put("Олег Викторович Дерендяев", 18);
        ageAndNames.put("Ольга Владимировна Шулятьева", 16);
        ageAndNames.put("Михаил Романович Белых", 17);
        ageAndNames.put("Игорь Тимофеевич Ефремов", 8);
        ageAndNames.put("Тимофей Анатольевич Ефремов", 37);
        ageAndNames.put("Наталья Григорьевна Николаева", 31);

        for (Map.Entry<String, Integer> entry : ageAndNames.entrySet()) {
            if (entry.getValue() >= 18) {
                adults.add(entry.getKey());
            }
        }

        Collections.sort(adults);
        System.out.println("Список жильцов, отсортированный от А до Я: " + adults);
    }
}

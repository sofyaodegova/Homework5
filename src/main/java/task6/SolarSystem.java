package task6;

import java.util.ArrayList;
import java.util.Collections;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> solarSystem = new ArrayList<>();
        solarSystem.add("Mercury");
        solarSystem.add("Venus");
        solarSystem.add("Earth");
        solarSystem.add("Mars");
        solarSystem.add("Jupiter");
        solarSystem.add("Saturn");
        solarSystem.add("Neptune");
        solarSystem.add("Uranus");

        Collections.swap(solarSystem, 6, 7);
        System.out.println("Правильный порядок планет Солнечной системы: " + solarSystem);
    }
}

package ru.sberbank;
import java.util.*;

public class Menu {
    public static void print() {
        System.out.println("--Справочник--");
        System.out.println("1. Вывести список");
        System.out.println("2. Отсортировать список по наименованию города");
        System.out.println("3. Отстортировать список по федеральному округу и наименованию города");
        System.out.println("4. Вывести id города с максимальым населением");
        System.out.println("5. Вывести количество городов в каждом регионе");
        System.out.println("6. Выход");
        System.out.println("\n");
        System.out.print("Введите число: ");
    }

    public static void printCities(List<City> cities) {
        System.out.println("\n");
        for (City s : cities) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

    public static void findFirst(List<City> cities) {
        System.out.println("\n");
        int maxPopulation = 0;
        int id=0;
        for (City c : cities) {
            if (Integer.parseInt(c.getPopulationInt()) > maxPopulation){
                maxPopulation = Integer.parseInt(c.getPopulationInt());
                id =Integer.parseInt(c.getId());
            }
        }
        System.out.println("["+id+"]"+" = "+maxPopulation);
        System.out.println("\n");

    }

    public static void sumByRegion(List<City> cities) {
        Map<String,Integer> regionCount = new HashMap<>();
        for (City c : cities) {
            if (regionCount.containsKey(c.getRegionName())) {
                regionCount.put(c.getRegionName(), regionCount.get(c.getRegionName()) + 1);
            } else {
                regionCount.put(c.getRegionName(), 1);
            }
        }
        System.out.println("\n");
        for (String region : regionCount.keySet()) {
            int count = regionCount.get(region);
            System.out.println(region + " - " + count);
        }
        System.out.println("\n");
    }
}

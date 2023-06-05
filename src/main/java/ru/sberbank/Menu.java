package ru.sberbank;
import java.util.List;

public class Menu {
    public static void print() {
        System.out.println("--Справочник--");
        System.out.println("1. Вывести список");
        System.out.println("2. Отсортировать список по наименованию города");
        System.out.println("3. Отстортировать список по федеральному округу и наименованию города");
        System.out.println("4. Вывести id города с максимальым населением");
        System.out.println("5. Выход");
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
        for (City s : cities) {
            if (Integer.parseInt(s.getPopulationInt()) > maxPopulation){
                maxPopulation = Integer.parseInt(s.getPopulationInt());
                id =Integer.parseInt(s.getId());
            }
        }
        System.out.println("["+id+"]"+" = "+maxPopulation);
        System.out.println("\n");

    }
}

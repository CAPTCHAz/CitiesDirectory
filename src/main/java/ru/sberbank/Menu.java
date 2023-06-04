package ru.sberbank;

import java.util.List;

public class Menu {
    public static void print() {
        System.out.println("--Справочник--");
        System.out.println("1. Вывести список");
        System.out.println("2. Отсортировать список по наименованию города");
        System.out.println("3. Отстортировать список по федеральному округу и наименованию города");
        System.out.println("4. Выход");
        System.out.print("Введите число: ");
    }
    public static void printCities(List<City> cities) {
        System.out.println("\n");
        for (City s : cities) {
            System.out.println(s);
        }
        System.out.println("\n");
    }
}

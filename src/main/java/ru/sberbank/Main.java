package ru.sberbank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static ru.sberbank.Menu.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String FILE_PATH = "src\\main\\resources\\cities.csv";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), StandardCharsets.UTF_8));
        String line = null;
        Scanner scanner = null;
        int index = 0;
        ArrayList<City> cities = new ArrayList<>();
        while ((line = reader.readLine()) != null){
            City city = new City();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()){
                String data = scanner.next();
                if (index == 0)
                    city.setId(data);
                else if (index == 1)
                    city.setName(data);
                else if (index == 2)
                    city.setRegion(data);
                else if (index == 3)
                    city.setDistrict(data);
                else if (index == 4)
                    city.setPopulation(data);
                else if (index == 5)
                    city.setFoundation(data);
                else System.out.println("Undefined data:" + data);
                index++;
            }
            index = 0;
            cities.add(city);
        }
        reader.close();

        Comparator<City> byName = Comparator.comparing(City::getName);
        Comparator<City> byDistrictAndName = Comparator.comparing(City::getDistrict).thenComparing(City::getName);
        Scanner choice = new Scanner(System.in);
        int usrChoice = 0;
        do {
            Menu.print();
            usrChoice = choice.nextInt();
            switch (usrChoice) {
                case 1:
                    printCities(cities);
                    break;
                case 2:
                    cities.sort(byName);
                    printCities(cities);
                    break;
                case 3:
                    cities.sort(byDistrictAndName);
                    printCities(cities);
                    break;
                case 4:
                    Menu.findFirst(cities);
                    break;
            }
        } while (usrChoice!=5);
    }
}


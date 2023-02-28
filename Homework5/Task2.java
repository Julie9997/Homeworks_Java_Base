package Homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class Task2 {
    public static void main(String[] args) {
        String[] names = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        Map<String, Integer> nameCount = fillMap(names);
        List<Map.Entry<String, Integer>> nameCountsList = new ArrayList<>(nameCount.entrySet());
        nameCountsList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        for (Map.Entry<String, Integer> counter : nameCountsList) 
            System.out.println(counter.getKey() + ": " + counter.getValue());
    }

    public static Map<String,Integer> fillMap(String[] arr){
        Map<String, Integer> сounts = new HashMap<>();
        for (String a : arr) {
            String name = a.split(" ")[0];
            сounts.put(name, сounts.getOrDefault(name, 0) + 1);
        }
        return сounts;
    }

}

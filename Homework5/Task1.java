package Homework5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        boolean exit = false;

        while(!exit){
            System.out.println("Выберите действие\n1 - Добавление номера\n2 - Вывод телефонной книги\n3 - Выход\n");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    addContact(phoneBook);
                    System.out.println();
                    break;
                case 2:
                    show(phoneBook);
                    System.out.println();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Такого действия нет");
            }
        }
        sc.close();
    }

    public static void addContact(Map<String, String> map){
        Scanner sc = new Scanner(System.in, "cp866");
        String contact = "";
        System.out.println("Введите фамилию: ");
        contact += sc.nextLine() + " ";
        System.out.println("Введите имя: ");
        contact += sc.nextLine();
        System.out.println("Введите телефон: ");
        String phone = sc.nextLine();
        map.put(phone, contact);
    }

    public static void show(Map<String, String> map){
        Set<String> uniqueValues = new HashSet<>(map.values());
        for(String value : uniqueValues){
            String valueToFind = value;
            System.out.println(value);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(valueToFind)) {
                    System.out.println("\t\t" + entry.getKey());
                }
            }
            System.out.println("------------------------------------");
        }
    }
}
